package com.modusbox.client.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Below are the allowed values for the enumeration - RECEIVED The Switch has received the transfer. - RESERVED The Switch has reserved the transfer. - COMMITTED The Switch has successfully performed the transfer. - ABORTED The Switch has aborted the transfer due a rejection or failure to perform the transfer. 
 */
public enum MojaloopTransferState {
  
  RECEIVED("RECEIVED"),
  
  RESERVED("RESERVED"),
  
  COMMITTED("COMMITTED"),
  
  ABORTED("ABORTED");

  private String value;

  MojaloopTransferState(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MojaloopTransferState fromValue(String value) {
    for (MojaloopTransferState b : MojaloopTransferState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


