package com.modusbox.client.api;

import com.modusbox.client.model.ErrorTransferResponse;
import com.modusbox.client.model.TransferContinuationAccept;
import com.modusbox.client.model.TransferRequest;
import com.modusbox.client.model.TransferResponse;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/sendmoney")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public interface SendmoneyApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    TransferResponse postSendMoney(@Valid @NotNull TransferRequest transferRequest);

    @PUT
    @Path("/{transferId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    TransferResponse putSendMoneyByTransferId(@PathParam("transferId") @Pattern(regexp="^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$") String transferId,@Valid TransferContinuationAccept transferContinuationAccept);
}
