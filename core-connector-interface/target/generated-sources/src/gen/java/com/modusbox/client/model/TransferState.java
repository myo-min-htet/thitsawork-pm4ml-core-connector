package com.modusbox.client.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Below are the allowed values for the enumeration - COMMITTED The transfer has been committed in the Switch. The Payee DFSP responds to the &#x60;COMMITTED&#x60; state with an HTTP 200 message, and then marks the transfer as completed. in its internal records. - ABORTED The transfer has been aborted in the Switch. The Payee DFSP responds to the &#x60;ABORTED&#x60; state with an HTTP 200 message, and then aborts the transfer in its internal records. 
 */
public enum TransferState {
  
  COMMITTED("COMMITTED"),
  
  ABORTED("ABORTED");

  private String value;

  TransferState(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TransferState fromValue(String value) {
    for (TransferState b : TransferState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


