package com.modusbox.client.api;

import com.modusbox.client.model.ErrorResponse;
import com.modusbox.client.model.QuoteRequest;
import com.modusbox.client.model.QuoteResponse;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/quoterequests")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public interface QuoterequestsApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    QuoteResponse postQuoteRequests(@Valid QuoteRequest quoteRequest);
}
