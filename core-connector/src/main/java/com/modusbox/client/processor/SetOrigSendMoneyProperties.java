package com.modusbox.client.processor;

import com.modusbox.client.customexception.CCCustomException;
import com.modusbox.client.enums.ErrorCode;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONObject;

public class SetOrigSendMoneyProperties implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {

        String body = exchange.getIn().getBody(String.class);
        JSONObject objBody = new JSONObject(body);
        String paymentTransactionID=  objBody.getString("paymentTransactionID");
//        String orderID=  respObject.getString("orderID");
//        String processGUID=  respObject.getString("processGUID");
//        String fromFspID=  respObject.getString("fromFspID");
//        String toFspID=  respObject.getString("toFspID");
//        String toFspCode=  respObject.getString("toFspCode");
        String hubID=  objBody.getString("hubID");
//        String accountNo=  respObject.getString("accountNo");
//        String accountTypeEnumID=  respObject.getString("accountTypeEnumID");
//        String payeeName=  respObject.getString("payeeName");
//        String payeeMainIdentifier=  respObject.getString("payeeMainIdentifier");
//        String payeeTypeEnumID=  respObject.getString("payeeTypeEnumID");
//        String mobileNo1=  respObject.getString("mobileNo1");
//        String mobileNo2=  respObject.getString("mobileNo2");
        String amount=  objBody.getString("amount");
//        String currency=  respObject.getString("currency");
//        String referenceID=  respObject.getString("referenceID");
//        String referenceNote=  respObject.getString("referenceNote");
//        String fees1=  respObject.getString("fees1");
//        String fees2=  respObject.getString("fees2");
//        String fees3=  respObject.getString("fees3");
//        String requestedDate=  respObject.getString("requestedDate");
//        String createdDtm=  respObject.getString("createdDtm");
//        String createdByID=  respObject.getString("createdByID");

        exchange.setProperty("paymentTransactionID",paymentTransactionID);
//        exchange.setProperty("orderID", orderID);
//        exchange.setProperty("processGUID", processGUID);
//        exchange.setProperty("fromFspID", fromFspID);
//        exchange.setProperty("toFspID", toFspID);
//        exchange.setProperty("toFspCode", toFspCode);
        exchange.setProperty("hubID", hubID);
//        exchange.setProperty("accountNo", accountNo);
//        exchange.setProperty("accountTypeEnumID", accountTypeEnumID);
//        exchange.setProperty("payeeName", payeeName);
//        exchange.setProperty("payeeMainIdentifier", payeeMainIdentifier);
//        exchange.setProperty("payeeTypeEnumID", payeeTypeEnumID);
//        exchange.setProperty("mobileNo1", mobileNo1);
//        exchange.setProperty("mobileNo2", mobileNo2);
//        exchange.setProperty("amount", amount);
//        exchange.setProperty("currency", currency);
//        exchange.setProperty("referenceID", referenceID);
//        exchange.setProperty("referenceNote", referenceNote);
//        exchange.setProperty("fees1", fees1);
//        exchange.setProperty("fees2", fees2);
//        exchange.setProperty("fees3", fees3);
//        exchange.setProperty("requestedDate", requestedDate);
//        exchange.setProperty("createdDtm", createdDtm);
//        exchange.setProperty("createdByID", createdByID);

        if (amount.equals("0")){
            throw new CCCustomException(ErrorCode.getErrorResponse(ErrorCode.PAYEE_LIMIT_ERROR, "Transfer amount cannot be zero value"));
        }
    }
}
