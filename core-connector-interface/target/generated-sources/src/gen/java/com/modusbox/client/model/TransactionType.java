package com.modusbox.client.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of transaction. Below are the allowed values for the enumeration. - LOAN_REPAYMENT - Used in the loan repayment use case when the loan repayment goes to a loan account. - SAVINGS_DEPOSIT - Used in the loan repayment use case when the loan repayment goes to a savings account. - TRANSFER - Used in the loan disbursement use case.
 */
public enum TransactionType {
  
  LOAN_REPAYMENT("LOAN_REPAYMENT"),
  
  SAVINGS_DEPOSIT("SAVINGS_DEPOSIT"),
  
  TRANSFER("TRANSFER");

  private String value;

  TransactionType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TransactionType fromValue(String value) {
    for (TransactionType b : TransactionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


