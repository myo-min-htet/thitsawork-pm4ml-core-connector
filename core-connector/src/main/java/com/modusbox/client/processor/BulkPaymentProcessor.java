package com.modusbox.client.processor;

import com.modusbox.client.utils.DataFormatUtils;
import org.apache.camel.*;
import org.json.JSONArray;
import org.json.JSONObject;


public class BulkPaymentProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {

        JSONObject jsObj = new JSONObject(exchange.getProperty("BulkPayload"));
        JSONArray jsArray = jsObj.getJSONArray("transferRequestBulkList");
        for(int i=0; i<jsArray.length(); i++)
        {
            System.out.println("Start Payment : "+ jsArray.getJSONObject(i));

            try {
                ProducerTemplate template = exchange.getContext().createProducerTemplate();
                int finalI = i;
                exchange = template.send("direct:postSendMoney", exchange1 -> exchange1.getIn().setBody(jsArray.getJSONObject(finalI)));
//                String strSendMoneyResponse = template.requestBody("direct:postSendMoney",jsArray.getJSONObject(i),String.class);
//                JSONObject objResponse = new JSONObject();
//                if(DataFormatUtils.isJSONValid(exchange.getMessage().getBody()))
//                {
//                    if(objResponse.has("StatusCode")) {
//                        exchange.setProperty("acceptQuoteStatusCode");
//                    }
//                }
                System.out.println("ProducerTemplate response : "+exchange.getMessage());
            }
            catch (Exception ex)
            {
                System.out.println("ProducerTemplate Error response : "+ex.getMessage());
            }
        }

        ProducerTemplate template = exchange.getContext().createProducerTemplate();
        System.out.println(jsArray.getJSONObject(0));
        String strUpdate = template.requestBody("direct:postBatchProcessState",jsArray.getJSONObject(0),String.class);

    }
}