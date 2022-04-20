package com.modusbox.client.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specifies if the initiator of the transfer is the Payer or Payee.
 */
public enum Initiator {
  
  PAYER("PAYER"),
  
  PAYEE("PAYEE");

  private String value;

  Initiator(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Initiator fromValue(String value) {
    for (Initiator b : Initiator.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


