package com.modusbox.client.router;

import com.modusbox.client.exception.RouteExceptionHandlingConfigurer;
import com.modusbox.client.processor.BulkPaymentProcessor;
import com.modusbox.client.processor.SetOrigSendMoneyProperties;
import io.prometheus.client.Counter;
import io.prometheus.client.Histogram;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.http.base.HttpOperationFailedException;
import org.apache.http.conn.HttpHostConnectException;
import org.json.JSONException;

public class SendmoneyRouter extends RouteBuilder {

    private static final String TIMER_NAME_POST = "histogram_post_sendmoney_timer";
    private static final String TIMER_NAME_PUT = "histogram_put_sendmoney_by_id_timer";

    private final RouteExceptionHandlingConfigurer exceptionHandlingConfigurer = new RouteExceptionHandlingConfigurer();
    private final BulkPaymentProcessor BulkPayment = new BulkPaymentProcessor();
    private final SetOrigSendMoneyProperties SetOrigSendMoneyProperties = new SetOrigSendMoneyProperties();
    public static final Counter reqCounterPost = Counter.build()
            .name("counter_post_sendmoney_requests_total")
            .help("Total requests for POST /sendmoney.")
            .register();

    public static final Counter reqCounterPut = Counter.build()
            .name("counter_put_sendmoney_by_id_requests_total")
            .help("Total requests for PUT /sendmoney.")
            .register();

    private static final Histogram reqLatencyPost = Histogram.build()
            .name("histogram_post_sendmoney_request_latency")
            .help("Request latency in seconds for POST /sendmoney.")
            .register();

    private static final Histogram reqLatencyPut = Histogram.build()
            .name("histogram_put_sendmoney_by_id_request_latency")
            .help("Request latency in seconds for PUT /sendmoney.")
            .register();

    public void configure() {

        exceptionHandlingConfigurer.configureExceptionHandling(this);
        //new ExceptionHandlingRouter(this);

        from("direct:postSendMoneyBulk").routeId("com.modusbox.postSendMoneyBulk").doTry()
                .process(exchange -> {
                    reqCounterPost.inc(1); // increment Prometheus Counter metric
                    exchange.setProperty(TIMER_NAME_POST, reqLatencyPost.startTimer()); // initiate Prometheus Histogram metric
                })
                .to("bean:customJsonMessage?method=logJsonMessage(" +
                        "'info', " +
                        "${header.X-CorrelationId}, " +
                        "'Request received POST /sendmoney', " +
                        "'Tracking the request', " +
                        "'Call the single sendmoney method, Track the response', " +
                        "'Input Payload: ${body}')")
                /*
                 * BEGIN processing
                 */
                .setProperty("BulkPayload", simple("${body}"))
                .process(BulkPayment)
                /*
                 * END processing
                 */
                .to("bean:customJsonMessage?method=logJsonMessage(" +
                        "'info', " +
                        "${header.X-CorrelationId}, " +
                        "'Response for POST /sendmoneyBulk', " +
                        "'Tracking the response', " +
                        "null, " +
                        "'Output Payload: ${body}')")
                // .removeHeaders("*", "X-*")
                .doCatch(HttpOperationFailedException.class, JSONException.class, HttpHostConnectException.class)
                .to("direct:extractCustomErrors")
                .doFinally().process(exchange -> {
                    ((Histogram.Timer) exchange.getProperty(TIMER_NAME_POST)).observeDuration(); // stop Prometheus Histogram metric
                }).end()
        ;

        from("direct:postTransactionStatus").routeId("com.modusbox.postTransactionStatus")
                .process(exchange -> {
                    reqCounterPost.inc(1); // increment Prometheus Counter metric
                    exchange.setProperty(TIMER_NAME_POST, reqLatencyPost.startTimer()); // initiate Prometheus Histogram metric
                })
                .to("bean:customJsonMessage?method=logJsonMessage(" +
                        "'info', " +
                        "${header.X-CorrelationId}, " +
                        "'Request received POST /transactionStatus', " +
                        "'Tracking the request', " +
                        "'Call the transactionStatus update method, Track the response', " +
                        "'Input Payload: ${body}')")
                /*
                 * BEGIN processing
                 */
                .to("direct:getAuthHeader")
                .removeHeaders("CamelHttp*")
                .setHeader(Exchange.HTTP_METHOD, constant("POST"))
                .setHeader("Content-Type", constant("application/json"))

                .log("origPayload : ${exchangeProperty.origPayload}")
                .log("postSendMoneyInitial : ${exchangeProperty.postSendMoneyInitial}")
                .marshal().json()
                .transform(datasonnet("resource:classpath:mappings/postTransactionStatus.ds"))
                .setBody(simple("${body.content}"))
                .marshal().json()
                .log("Check the TransactionStatus : ${body}")
                .log("Middleware endpoint : {{mw.connoutbound.host}}")
                .toD("{{mw.connoutbound.host}}/PaymentService/SaveTransactionStatus")
                /*
                 * END processing
                 */
                .to("bean:customJsonMessage?method=logJsonMessage(" +
                        "'info', " +
                        "${header.X-CorrelationId}, " +
                        "'Response for POST /transactionStatus', " +
                        "'Tracking the response', " +
                        "null, " +
                        "'Output Payload: ${body}')")
        ;
        from("direct:postBatchProcessState").routeId("com.modusbox.postBatchProcessState")
                .process(exchange -> {
                    reqCounterPost.inc(1); // increment Prometheus Counter metric
                    exchange.setProperty(TIMER_NAME_POST, reqLatencyPost.startTimer()); // initiate Prometheus Histogram metric
                })
                .to("bean:customJsonMessage?method=logJsonMessage(" +
                        "'info', " +
                        "${header.X-CorrelationId}, " +
                        "'Request received POST /postBatchProcessState', " +
                        "'Tracking the request', " +
                        "'Call the postBatchProcessState method, Track the response', " +
                        "'Input Payload: ${body}')")
                /*
                 * BEGIN processing
                 */
                .to("direct:getAuthHeader")
                .removeHeaders("CamelHttp*")
                .setHeader(Exchange.HTTP_METHOD, constant("POST"))
//                .setHeader("Authorization", simple("Bearer QysiUQF4xfl1fCQjc8tn7TUK-L6Nlz-npRvne63B-FQ4ex5uDxczEowkPpTHtYJ8L2TwDdnYjRcmplh6U72iiFLybGZ4gwQtd-vwudD2sIhthQ_nznVSfAt7VNN4mrZoG9ZtFN0xxzlRfBnAO7qa9ZmRams95qeF2_13SVBKP52tzob5dpJXi9_joL33OwiUKcExMzQ-oqhiZUptVDCI-G9QV9U2hsdXkKnVZ3sLX-feSdAaLYljiIni_exwGcUrtYtvvS3IJAWWza5FNEz6ClRo7_fcNdMeO-mIsTWn3Ks3Sxn8SHzhx6-AJ_75mnQK4sIBpkYCVPdYLhKSWo-EFoadYNkGJayC3M6eUtfj-1UwIRJVch8Z90jnhRMr5xJ_elcsfGs5M_S0tSxtwZ7MWleDC3ucLkHHqnMi4gdT61eh6wgoNNr-dPn9PwdE4zwByv2T1msFnkw7dPDI_lb3JjVqyGj5CQEcLKHiHcAhDm81i5mvW5i_UQgut8yNzysG"))
                .setHeader("Content-Type", constant("application/json"))
                .setProperty("batchSateEnum",simple("{{mw.batchprocessed.enum}}"))
                .transform(datasonnet("resource:classpath:mappings/postBatchProcessState.ds"))
                .setBody(simple("${body.content}"))
                .marshal().json()
                .log("Check the BatchState : ${body}")
                .log("Middleware endpoint : {{mw.connoutbound.host}}")
                .toD("{{mw.connoutbound.host}}/PaymentService/SaveBatchProcessState")
                /*
                 * END processing
                 */
                .to("bean:customJsonMessage?method=logJsonMessage(" +
                        "'info', " +
                        "${header.X-CorrelationId}, " +
                        "'Response for POST /batchprocessstate', " +
                        "'Tracking the response', " +
                        "null, " +
                        "'Output Payload: ${body}')")
        ;
        from("direct:postSendMoney").routeId("com.modusbox.postSendMoney")
                .process(exchange -> {
                    reqCounterPost.inc(1); // increment Prometheus Counter metric
                    exchange.setProperty(TIMER_NAME_POST, reqLatencyPost.startTimer()); // initiate Prometheus Histogram metric
                })
                .to("bean:customJsonMessage?method=logJsonMessage(" +
                        "'info', " +
                        "${header.X-CorrelationId}, " +
                        "'Request received POST /sendmoney', " +
                        "'Tracking the request', " +
                        "'Call the Mojaloop Connector Outbound API, Track the response', " +
                        "'Input Payload: ${body}')")
                /*
                 * BEGIN processing
                 */
                .process(SetOrigSendMoneyProperties)
                .removeHeaders("CamelHttp*")
                .setHeader(Exchange.HTTP_METHOD, constant("POST"))
                .setHeader("Content-Type", constant("application/json"))
                .setHeader("MFIName", constant("{{dfsp.name}}"))
                .transform(datasonnet("resource:classpath:mappings/postSendMoneyRequest.ds"))
                .setBody(simple("${body.content}"))
                .marshal().json()
                .log("Checking the body ${body}")
                .to("bean:customJsonMessage?method=logJsonMessage(" +
                        "'info', " +
                        "${header.X-CorrelationId}, " +
                        "'Calling the Mojaloop Connector Outbound API postSendMoney POST {{ml-conn.outbound.host}}'," +
                        "'Tracking the request', " +
                        "'Track the response', " +
                        "'Request to POST {{ml-conn.outbound.host}}/transfers, IN Payload: ${body} IN Headers: ${headers}')")

                .toD("{{ml-conn.outbound.host}}/transfers?bridgeEndpoint=true")
                .unmarshal().json()
                .marshal().json()
                .to("bean:customJsonMessage?method=logJsonMessage(" +
                        "'info', " +
                        "${header.X-CorrelationId}, " +
                        "'Called the Mojaloop Connector Outbound API postSendMoney', " +
                        "'Tracking the response', " +
                        "'Verify the response', " +
                        "'Response from POST {{ml-conn.outbound.host}}/transfers, OUT Payload: ${body}')")
                .setProperty("transferId",simple("${body.content.get('transferId')}"))
                .log("${exchangeProperty.transferId}")
                .setProperty("postSendMoneyInitial", body())
                // Send request to accept the party instead of hard coding AUTO_ACCEPT_PARTY: true
                .to("direct:putTransfersAcceptParty")
                .to("direct:putTransfersAcceptQuote")
                /*
                 * END processing
                 */
                .to("bean:customJsonMessage?method=logJsonMessage(" +
                        "'info', " +
                        "${header.X-CorrelationId}, " +
                        "'Response for POST /sendmoney', " +
                        "'Tracking the response', " +
                        "null, " +
                        "'Output Payload: ${body}')")
                // .removeHeaders("*", "X-*")

        ;

        from("direct:putTransfersAcceptParty").routeId("com.modusbox.putTransfersAcceptParty")
                .removeHeaders("CamelHttp*")
                .setHeader(Exchange.HTTP_METHOD, constant("PUT"))
                .setHeader("Content-Type", constant("application/json"))

                .marshal().json()
                .transform(datasonnet("resource:classpath:mappings/putTransfersAcceptPartyRequest.ds"))
                .setBody(simple("${body.content}"))
                .marshal().json()

                .to("bean:customJsonMessage?method=logJsonMessage('info', ${header.X-CorrelationId}, " +
                        "'Calling outbound API, putTransfersAcceptParty " +
                        "PUT {{ml-conn.outbound.host}}/transfers/${exchangeProperty.postSendMoneyInitial?.get('transferId')}', " +
                        "'Tracking the request',"+
                        "'Track the response'," +
                        "'Input Payload: ${body}')")

                // Instead of having to do a DataSonnet transformation
                .toD("{{ml-conn.outbound.host}}/transfers/${exchangeProperty.postSendMoneyInitial?.get('transferId')}?bridgeEndpoint=true")
                .unmarshal().json()
                .to("bean:customJsonMessage?method=logJsonMessage('info', ${header.X-CorrelationId}, " +
                        "'Response from outbound API, putTransfersAcceptParty: ${body}', " +
                        "'Tracking the response', 'Verify the response',"+
                        "'Output Payload: ${body}')")
        ;

        from("direct:putTransfersAcceptQuote").routeId("com.modusbox.putTransfersAcceptQuote")
                .removeHeaders("CamelHttp*")
                .setHeader(Exchange.HTTP_METHOD, constant("PUT"))
                .setHeader("Content-Type", constant("application/json"))

                .marshal().json()
                .transform(datasonnet("resource:classpath:mappings/putTransfersAcceptQuoteRequest.ds"))
                .setBody(simple("${body.content}"))
                .marshal().json()

                .to("bean:customJsonMessage?method=logJsonMessage('info', ${header.X-CorrelationId}, " +
                        "'Calling outbound API, putTransfersAcceptQuote " +
                        "PUT {{ml-conn.outbound.host}}/transfers/${exchangeProperty.postSendMoneyInitial?.get('transferId')}', " +
                        "'Tracking the request'," +
                        "'Track the response'," +
                        "'Input Payload: ${body}')")

                // Instead of having to do a DataSonnet transformation
                .toD("{{ml-conn.outbound.host}}/transfers/${exchangeProperty.postSendMoneyInitial?.get('transferId')}?bridgeEndpoint=true")
                .unmarshal().json()
                .log("acceptQuote body : ${body}")
                .setProperty("transferId",simple("${exchangeProperty.postSendMoneyInitial?.get('transferId')}"))
                .setProperty("acceptQuoteResponse", simple("${body}"))
                .setProperty("acceptQuoteStatusCode", simple("${header.CamelHttpResponseCode}"))
                .to("direct:postTransactionStatus")
                .to("bean:customJsonMessage?method=logJsonMessage('info', ${header.X-CorrelationId}, " +
                        "'Response from outbound API, putTransfersAcceptQuote: ${body}', " +
                        "'Tracking the response', 'Verify the response', " +
                        "'Output Payload: ${body}')")
        ;

        from("direct:putSendMoneyByTransferId") .routeId("com.modusbox.putSendMoneyByTransferId").doTry()
                .process(exchange -> {
                    reqCounterPut.inc(1); // increment Prometheus Counter metric
                    exchange.setProperty(TIMER_NAME_PUT, reqLatencyPut.startTimer()); // initiate Prometheus Histogram metric
                })
                .to("bean:customJsonMessage?method=logJsonMessage(" +
                        "'info', " +
                        "${header.X-CorrelationId}, " +
                        "'Request received PUT /sendmoney/${header.transferId}', " +
                        "'Tracking the request'," +
                        "'Call the Mojaloop Connector Outbound API, Track the response', " +
                        "'Input Payload: ${body}')") // default logger
                /*
                 * BEGIN processing
                 */
                .setProperty("origPayload", simple("${body}"))
                .removeHeaders("CamelHttp*")
                .setHeader(Exchange.HTTP_METHOD, constant("PUT"))
                .setHeader("Content-Type", constant("application/json"))

                // Will convert to JSON and only take the accept quote section
                .marshal().json()
                .transform(datasonnet("resource:classpath:mappings/putTransfersDisburseRequest.ds"))
                .setBody(simple("${body.content}"))
                .marshal().json()

                .to("bean:customJsonMessage?method=logJsonMessage(" +
                        "'info', " +
                        "${header.X-CorrelationId}, " +
                        "'Calling the Mojaloop Connector Outbound API putTransfersById " +
                        "POST {{ml-conn.outbound.host}}', " +
                        "'Tracking the request',"+
                        "'Track the response'," +
                        "'Request to PUT {{ml-conn.outbound.host}}/transfers, IN Payload: ${body} IN Headers: ${headers}')")

                .toD("{{ml-conn.outbound.host}}/transfers/${header.transferId}?bridgeEndpoint=true")
                .unmarshal().json()

                .to("bean:customJsonMessage?method=logJsonMessage(" +
                        "'info', " +
                        "${header.X-CorrelationId}, " +
                        "'Called the Mojaloop Connector Outbound API putTransfersById', " +
                        "null, " +
                        "null, " +
                        "'Response from POST {{ml-conn.outbound.host}}/transfers, OUT Payload: ${body}')")
                /*
                 * END processing
                 */
                .to("bean:customJsonMessage?method=logJsonMessage(" +
                        "'info', " +
                        "${header.X-CorrelationId}, " +
                        "'Response for PUT /sendmoney', " +
                        "'Tracking the response', " +
                        "null, " +
                        "'Output Payload: ${body}')")
//                .removeHeaders("*", "X-*")
//                .setBody(simple(""))
                .doFinally().process(exchange -> {
                    ((Histogram.Timer) exchange.getProperty(TIMER_NAME_PUT)).observeDuration(); // stop Prometheus Histogram metric
                }).end()
        ;
    }
}
