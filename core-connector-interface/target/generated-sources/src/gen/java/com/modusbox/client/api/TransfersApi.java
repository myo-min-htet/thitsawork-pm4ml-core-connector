package com.modusbox.client.api;

import com.modusbox.client.model.ErrorResponse;
import com.modusbox.client.model.FulfilNotification;
import com.modusbox.client.model.TransferRequestInbound;
import com.modusbox.client.model.TransferResponseInbound;
import com.modusbox.client.model.TransferStatusResponse;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/transfers")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public interface TransfersApi {

    @GET
    @Path("/{transferId}")
    @Produces({ "application/json" })
    TransferStatusResponse getTransfersByTransferId(@PathParam("transferId") @Pattern(regexp="^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$") String transferId);

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    TransferResponseInbound postTransfers(@Valid TransferRequestInbound transferRequestInbound);

    @PUT
    @Path("/{transferId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    TransferResponseInbound putTransfersByTransferId(@PathParam("transferId") @Pattern(regexp="^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$") String transferId,@Valid FulfilNotification fulfilNotification);
}
