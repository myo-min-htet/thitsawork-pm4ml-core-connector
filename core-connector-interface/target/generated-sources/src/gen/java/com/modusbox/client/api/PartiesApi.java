package com.modusbox.client.api;

import com.modusbox.client.model.ErrorResponse;
import com.modusbox.client.model.TransferPartyInbound;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/parties/{idType}/{idValue}")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public interface PartiesApi {

    @GET
    @Produces({ "application/json" })
    TransferPartyInbound getPartiesByIdTypeIdValue(@PathParam("idType") String idType,@PathParam("idValue") @Size(min=1,max=128) String idValue);

    @GET
    @Path("/{idSubValue}")
    @Produces({ "application/json" })
    TransferPartyInbound getPartiesByIdTypeIdValueIdSubValue(@PathParam("idType") String idType,@PathParam("idValue") @Size(min=1,max=128) String idValue,@PathParam("idSubValue") @Size(min=1,max=128) String idSubValue);
}
