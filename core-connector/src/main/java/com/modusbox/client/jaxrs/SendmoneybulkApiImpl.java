package com.modusbox.client.jaxrs;

import com.modusbox.client.api.SendmoneybulkApi;
import com.modusbox.client.model.TransferContinuationAccept;
import com.modusbox.client.model.TransferRequestBulk;
import com.modusbox.client.model.TransferResponse;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;

public class SendmoneybulkApiImpl implements SendmoneybulkApi {


    @Override
    public TransferResponse postSendMoneyBulk(TransferRequestBulk transferRequest) {
        return null;
    }

}
