package com.modusbox.client.model;

import com.modusbox.client.model.AmountCurrency;
import com.modusbox.client.model.Party;
import com.modusbox.client.model.TransactionTypeObject;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Object containing transfer object.
 **/

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public class IlpPacketData   {
  
  private @Valid String quoteId;
  private @Valid String transactionId;
  private @Valid Party payer;
  private @Valid Party payee;
  private @Valid AmountCurrency amount;
  private @Valid TransactionTypeObject transactionType;

  /**
   * A Mojaloop API quote identifier (UUID).
   **/
  public IlpPacketData quoteId(String quoteId) {
    this.quoteId = quoteId;
    return this;
  }

  

  
  @JsonProperty("quoteId")
  @NotNull
 @Pattern(regexp="^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$")  public String getQuoteId() {
    return quoteId;
  }

  public void setQuoteId(String quoteId) {
    this.quoteId = quoteId;
  }

/**
   * ID of the transaction, the ID is decided by the Payer FSP during the creation of the quote.
   **/
  public IlpPacketData transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  

  
  @JsonProperty("transactionId")
  @NotNull
 @Pattern(regexp="^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$")  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

/**
   **/
  public IlpPacketData payer(Party payer) {
    this.payer = payer;
    return this;
  }

  

  
  @JsonProperty("payer")
  @NotNull
  public Party getPayer() {
    return payer;
  }

  public void setPayer(Party payer) {
    this.payer = payer;
  }

/**
   **/
  public IlpPacketData payee(Party payee) {
    this.payee = payee;
    return this;
  }

  

  
  @JsonProperty("payee")
  @NotNull
  public Party getPayee() {
    return payee;
  }

  public void setPayee(Party payee) {
    this.payee = payee;
  }

/**
   **/
  public IlpPacketData amount(AmountCurrency amount) {
    this.amount = amount;
    return this;
  }

  

  
  @JsonProperty("amount")
  @NotNull
  public AmountCurrency getAmount() {
    return amount;
  }

  public void setAmount(AmountCurrency amount) {
    this.amount = amount;
  }

/**
   **/
  public IlpPacketData transactionType(TransactionTypeObject transactionType) {
    this.transactionType = transactionType;
    return this;
  }

  

  
  @JsonProperty("transactionType")
  @NotNull
  public TransactionTypeObject getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(TransactionTypeObject transactionType) {
    this.transactionType = transactionType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IlpPacketData ilpPacketData = (IlpPacketData) o;
    return Objects.equals(this.quoteId, ilpPacketData.quoteId) &&
        Objects.equals(this.transactionId, ilpPacketData.transactionId) &&
        Objects.equals(this.payer, ilpPacketData.payer) &&
        Objects.equals(this.payee, ilpPacketData.payee) &&
        Objects.equals(this.amount, ilpPacketData.amount) &&
        Objects.equals(this.transactionType, ilpPacketData.transactionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quoteId, transactionId, payer, payee, amount, transactionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IlpPacketData {\n");
    
    sb.append("    quoteId: ").append(toIndentedString(quoteId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    payer: ").append(toIndentedString(payer)).append("\n");
    sb.append("    payee: ").append(toIndentedString(payee)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

