package com.modusbox.client.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Below are the allowed values for the enumeration - ERROR_OCCURRED An error has occurred during the transfer process. - WAITING_FOR_PARTY_ACCEPTANCE &#x60;AUTO_ACCEPT_PARTY&#x60; is set to \&quot;false\&quot; and party information has been returned, waiting to be accepted by the Payer DFSP using a &#x60;PUT /sendmoney/{transferId}&#x60; request. - WAITING_FOR_QUOTE_ACCEPTANCE &#x60;AUTO_ACCEPT_QUOTE&#x60; is set to \&quot;false\&quot; and quote information has been returned, waiting to be accepted by the Payer DFSP using a &#x60;PUT /sendmoney/{transferId}&#x60; request. - COMPLETED The transfer has completed successfully. 
 */
public enum TransferStatus {
  
  ERROR_OCCURRED("ERROR_OCCURRED"),
  
  WAITING_FOR_PARTY_ACCEPTANCE("WAITING_FOR_PARTY_ACCEPTANCE"),
  
  WAITING_FOR_QUOTE_ACCEPTANCE("WAITING_FOR_QUOTE_ACCEPTANCE"),
  
  COMPLETED("COMPLETED");

  private String value;

  TransferStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TransferStatus fromValue(String value) {
    for (TransferStatus b : TransferStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


