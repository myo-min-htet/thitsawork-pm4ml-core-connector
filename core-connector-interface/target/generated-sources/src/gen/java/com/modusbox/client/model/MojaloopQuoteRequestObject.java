package com.modusbox.client.model;

import com.modusbox.client.model.AmountType;
import com.modusbox.client.model.ExtensionListComplex;
import com.modusbox.client.model.MojaloopMoney;
import com.modusbox.client.model.MojaloopTransactionType;
import com.modusbox.client.model.Party;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public class MojaloopQuoteRequestObject   {
  
  private @Valid String quoteId;
  private @Valid String transactionId;
  private @Valid AmountType amountType;
  private @Valid MojaloopMoney amount;
  private @Valid MojaloopMoney fees;
  private @Valid String expiration;
  private @Valid Party payer;
  private @Valid Party payee;
  private @Valid MojaloopTransactionType transactionType;
  private @Valid String note;
  private @Valid ExtensionListComplex extensionList;

  /**
   * A Mojaloop API quote identifier (UUID).
   **/
  public MojaloopQuoteRequestObject quoteId(String quoteId) {
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
  public MojaloopQuoteRequestObject transactionId(String transactionId) {
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
  public MojaloopQuoteRequestObject amountType(AmountType amountType) {
    this.amountType = amountType;
    return this;
  }

  

  
  @JsonProperty("amountType")
  @NotNull
  public AmountType getAmountType() {
    return amountType;
  }

  public void setAmountType(AmountType amountType) {
    this.amountType = amountType;
  }

/**
   **/
  public MojaloopQuoteRequestObject amount(MojaloopMoney amount) {
    this.amount = amount;
    return this;
  }

  

  
  @JsonProperty("amount")
  @NotNull
  public MojaloopMoney getAmount() {
    return amount;
  }

  public void setAmount(MojaloopMoney amount) {
    this.amount = amount;
  }

/**
   **/
  public MojaloopQuoteRequestObject fees(MojaloopMoney fees) {
    this.fees = fees;
    return this;
  }

  

  
  @JsonProperty("fees")
  public MojaloopMoney getFees() {
    return fees;
  }

  public void setFees(MojaloopMoney fees) {
    this.fees = fees;
  }

/**
   * An ISO-8601 formatted timestamp.
   **/
  public MojaloopQuoteRequestObject expiration(String expiration) {
    this.expiration = expiration;
    return this;
  }

  

  
  @JsonProperty("expiration")
 @Pattern(regexp="^(?:[1-9]\\d{3}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1\\d|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|(?:[1-9]\\d(?:0[48]|[2468][048]|[13579][26])|(?:[2468][048]|[13579][26])00)-02-29)T(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d(?:(\\.\\d{3}))(?:Z|[+-][01]\\d:[0-5]\\d)$")  public String getExpiration() {
    return expiration;
  }

  public void setExpiration(String expiration) {
    this.expiration = expiration;
  }

/**
   **/
  public MojaloopQuoteRequestObject payer(Party payer) {
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
  public MojaloopQuoteRequestObject payee(Party payee) {
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
  public MojaloopQuoteRequestObject transactionType(MojaloopTransactionType transactionType) {
    this.transactionType = transactionType;
    return this;
  }

  

  
  @JsonProperty("transactionType")
  @NotNull
  public MojaloopTransactionType getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(MojaloopTransactionType transactionType) {
    this.transactionType = transactionType;
  }

/**
   * An optional note associated with the requested transfer.
   **/
  public MojaloopQuoteRequestObject note(String note) {
    this.note = note;
    return this;
  }

  

  
  @JsonProperty("note")
 @Size(min=1,max=128)  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

/**
   **/
  public MojaloopQuoteRequestObject extensionList(ExtensionListComplex extensionList) {
    this.extensionList = extensionList;
    return this;
  }

  

  
  @JsonProperty("extensionList")
  public ExtensionListComplex getExtensionList() {
    return extensionList;
  }

  public void setExtensionList(ExtensionListComplex extensionList) {
    this.extensionList = extensionList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MojaloopQuoteRequestObject mojaloopQuoteRequestObject = (MojaloopQuoteRequestObject) o;
    return Objects.equals(this.quoteId, mojaloopQuoteRequestObject.quoteId) &&
        Objects.equals(this.transactionId, mojaloopQuoteRequestObject.transactionId) &&
        Objects.equals(this.amountType, mojaloopQuoteRequestObject.amountType) &&
        Objects.equals(this.amount, mojaloopQuoteRequestObject.amount) &&
        Objects.equals(this.fees, mojaloopQuoteRequestObject.fees) &&
        Objects.equals(this.expiration, mojaloopQuoteRequestObject.expiration) &&
        Objects.equals(this.payer, mojaloopQuoteRequestObject.payer) &&
        Objects.equals(this.payee, mojaloopQuoteRequestObject.payee) &&
        Objects.equals(this.transactionType, mojaloopQuoteRequestObject.transactionType) &&
        Objects.equals(this.note, mojaloopQuoteRequestObject.note) &&
        Objects.equals(this.extensionList, mojaloopQuoteRequestObject.extensionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quoteId, transactionId, amountType, amount, fees, expiration, payer, payee, transactionType, note, extensionList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MojaloopQuoteRequestObject {\n");
    
    sb.append("    quoteId: ").append(toIndentedString(quoteId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    amountType: ").append(toIndentedString(amountType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    payer: ").append(toIndentedString(payer)).append("\n");
    sb.append("    payee: ").append(toIndentedString(payee)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    extensionList: ").append(toIndentedString(extensionList)).append("\n");
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

