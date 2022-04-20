package com.modusbox.client.router;

import com.modusbox.client.exception.RouteExceptionHandlingConfigurer;
import com.modusbox.client.processor.TokenStore;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;

public class AuthRouter extends RouteBuilder {

    private final String PATH_NAME = "Middleware Fetch Access Token API";
    private final String PATH = "/Token";

    private final RouteExceptionHandlingConfigurer exceptionHandlingConfigurer = new RouteExceptionHandlingConfigurer();

    public void configure() {

        exceptionHandlingConfigurer.configureExceptionHandling(this);
        //new ExceptionHandlingRouter(this);

        from("direct:getAuthHeader")
                .setProperty("downstreamRequestBody", simple("${body}"))
                .setProperty("AccessToken", method(TokenStore.class, "getAccessToken()"))
                .choice()
                    .when(method(TokenStore.class, "getAccessToken()").isEqualTo(""))
                        .setProperty("username", simple("{{dfsp.username}}"))
                        .setProperty("password", simple("{{dfsp.password}}"))
                        .setProperty("grantType", simple("{{dfsp.grant-type}}"))
                        .removeHeaders("Camel*")
                        .setHeader("Content-Type", constant("application/x-www-form-urlencoded content type"))
                        .setHeader(Exchange.HTTP_METHOD, constant("POST"))
                        .setBody(simple("grant_type={{dfsp.grant-type}}&username={{dfsp.username}}&password={{dfsp.password}}"))
//                        .marshal().json()
//                        .transform(datasonnet("resource:classpath:mappings/postAuthTokenRequest.ds"))
//                        .setBody(simple("${body.content}"))
//                        .marshal().json()
                        //.bean("postAuthTokenRequest")
                        .to("bean:customJsonMessage?method=logJsonMessage(" +
                                "'info', " +
                                "${header.X-CorrelationId}, " +
                                "'Calling the access token " + PATH_NAME + "', " +
                                "null, " +
                                "null, " +
                                "'Request to POST {{dfsp.host}}" + PATH +", IN Payload: ${body}')")
                        .toD("{{mw.connoutbound.host}}" + PATH)
                        .unmarshal().json()

                        .setProperty("AccessToken", simple("${body['access_token']}"))
                        .setProperty("AccessTokenExpiration", simple("${body['expires_in']}"))
                        .bean(TokenStore.class, "setAccessToken(${exchangeProperty.AccessToken}, ${exchangeProperty.AccessTokenExpiration})")

                        .to("bean:customJsonMessage?method=logJsonMessage(" +
                                "'info', " +
                                "${header.X-CorrelationId}, " +
                                "'Called refresh token " + PATH_NAME + "', " +
                                "null, " +
                                "null, " +
                                "'Response from POST {{dfsp.host}}" + PATH + ", OUT Payload: ${body}')")
                        //.unmarshal().json(JsonLibrary.Gson)
                .end()
                .log("${exchangeProperty.AccessToken}")
                .setHeader("Authorization", simple("Bearer ${exchangeProperty.AccessToken}"))
                .to("bean:customJsonMessage?method=logJsonMessage(" +
                        "'info', " +
                        "${header.X-CorrelationId}, " +
                        "'Auth Token caught from " + PATH_NAME + "', " +
                        "null, " +
                        "null, " +
                        "'Authorization: ${header.Authorization}')")
                .removeHeaders("CamelHttp*")
                .setBody(simple("${exchangeProperty.downstreamRequestBody}"))
        ;
    }
}
