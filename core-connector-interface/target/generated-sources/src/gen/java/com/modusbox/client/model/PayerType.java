package com.modusbox.client.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Below are the allowed values for the enumeration - CONSUMER Consumer is the initiator of the transaction. Example - peer-to-peer transfer or loan repayment from wallet. - AGENT Agent is the initiator of the transaction. Example - loan repayment via an agent. - BUSINESS Business is the initiator of the transaction. Example - loan disbursement. - DEVICE Device is the initiator of the transaction. Example - merchant-initiated merchant payment authorized on POS. 
 */
public enum PayerType {
  
  CONSUMER("CONSUMER"),
  
  AGENT("AGENT"),
  
  BUSINESS("BUSINESS"),
  
  DEVICE("DEVICE");

  private String value;

  PayerType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PayerType fromValue(String value) {
    for (PayerType b : PayerType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


