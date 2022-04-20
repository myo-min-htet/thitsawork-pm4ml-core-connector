package com.modusbox.client.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Below are the allowed values for the enumeration. - DEPOSIT - Used for performing a Cash-In (deposit) transaction. In a normal scenario, electronic funds are transferred from a Business account to a Consumer account, and physical cash is given from the Consumer to the Business User. - WITHDRAWAL - Used for performing a Cash-Out (withdrawal) transaction. In a normal scenario, electronic funds are transferred from a Consumer&#39;s account to a Business account, and physical cash is given from the Business User to the Consumer. - TRANSFER - Used for performing a P2P (Peer to Peer, or Consumer to Consumer) transaction. - PAYMENT - Usually used for performing a transaction from a Consumer to a Merchant or Organization, but could also be for a B2B (Business to Business) payment. The transaction could be online for a purchase in an Internet store, in a physical store where both the Consumer and Business User are present, a bill payment, a donation, and so on. - REFUND - Used for performing a refund of transaction.
 */
public enum TransactionScenario {
  
  DEPOSIT("DEPOSIT"),
  
  WITHDRAWAL("WITHDRAWAL"),
  
  TRANSFER("TRANSFER"),
  
  PAYMENT("PAYMENT"),
  
  REFUND("REFUND");

  private String value;

  TransactionScenario(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TransactionScenario fromValue(String value) {
    for (TransactionScenario b : TransactionScenario.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


