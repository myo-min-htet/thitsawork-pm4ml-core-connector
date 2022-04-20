package com.modusbox.client.model;

import com.modusbox.client.model.AmountType;
import com.modusbox.client.model.Currency;
import com.modusbox.client.model.ExtensionItem;
import com.modusbox.client.model.TransactionType;
import com.modusbox.client.model.TransferParty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public class TransferRequest   {
  
  private @Valid String homeTransactionId;
  private @Valid TransferParty from;
  private @Valid TransferParty to;
  private @Valid AmountType amountType;
  private @Valid Currency currency;
  private @Valid String amount;
  private @Valid TransactionType transactionType;
  private @Valid String note;
  private @Valid List<ExtensionItem> quoteRequestExtensions = new ArrayList<ExtensionItem>();
  private @Valid List<ExtensionItem> transferRequestExtensions = new ArrayList<ExtensionItem>();

  /**
   * Transaction ID from the DFSP backend, used to reconcile transactions between the Switch and DFSP backend systems.
   **/
  public TransferRequest homeTransactionId(String homeTransactionId) {
    this.homeTransactionId = homeTransactionId;
    return this;
  }

  

  
  @JsonProperty("homeTransactionId")
  @NotNull
 @Size(max=255)  public String getHomeTransactionId() {
    return homeTransactionId;
  }

  public void setHomeTransactionId(String homeTransactionId) {
    this.homeTransactionId = homeTransactionId;
  }

/**
   **/
  public TransferRequest from(TransferParty from) {
    this.from = from;
    return this;
  }

  

  
  @JsonProperty("from")
  @NotNull
  public TransferParty getFrom() {
    return from;
  }

  public void setFrom(TransferParty from) {
    this.from = from;
  }

/**
   **/
  public TransferRequest to(TransferParty to) {
    this.to = to;
    return this;
  }

  

  
  @JsonProperty("to")
  @NotNull
  public TransferParty getTo() {
    return to;
  }

  public void setTo(TransferParty to) {
    this.to = to;
  }

/**
   **/
  public TransferRequest amountType(AmountType amountType) {
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
  public TransferRequest currency(Currency currency) {
    this.currency = currency;
    return this;
  }

  

  
  @JsonProperty("currency")
  @NotNull
  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

/**
   **/
  public TransferRequest amount(String amount) {
    this.amount = amount;
    return this;
  }

  

  
  @JsonProperty("amount")
  @NotNull
 @Pattern(regexp="^([0]|([1-9][0-9]{0,17}))([.][0-9]{0,3}[1-9])?$")  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

/**
   **/
  public TransferRequest transactionType(TransactionType transactionType) {
    this.transactionType = transactionType;
    return this;
  }

  

  
  @JsonProperty("transactionType")
  @NotNull
  public TransactionType getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(TransactionType transactionType) {
    this.transactionType = transactionType;
  }

/**
   **/
  public TransferRequest note(String note) {
    this.note = note;
    return this;
  }

  

  
  @JsonProperty("note")
 @Size(max=128)  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

/**
   **/
  public TransferRequest quoteRequestExtensions(List<ExtensionItem> quoteRequestExtensions) {
    this.quoteRequestExtensions = quoteRequestExtensions;
    return this;
  }

  

  
  @JsonProperty("quoteRequestExtensions")
 @Size(min=0,max=16)  public List<ExtensionItem> getQuoteRequestExtensions() {
    return quoteRequestExtensions;
  }

  public void setQuoteRequestExtensions(List<ExtensionItem> quoteRequestExtensions) {
    this.quoteRequestExtensions = quoteRequestExtensions;
  }

/**
   **/
  public TransferRequest transferRequestExtensions(List<ExtensionItem> transferRequestExtensions) {
    this.transferRequestExtensions = transferRequestExtensions;
    return this;
  }

  

  
  @JsonProperty("transferRequestExtensions")
 @Size(min=0,max=16)  public List<ExtensionItem> getTransferRequestExtensions() {
    return transferRequestExtensions;
  }

  public void setTransferRequestExtensions(List<ExtensionItem> transferRequestExtensions) {
    this.transferRequestExtensions = transferRequestExtensions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferRequest transferRequest = (TransferRequest) o;
    return Objects.equals(this.homeTransactionId, transferRequest.homeTransactionId) &&
        Objects.equals(this.from, transferRequest.from) &&
        Objects.equals(this.to, transferRequest.to) &&
        Objects.equals(this.amountType, transferRequest.amountType) &&
        Objects.equals(this.currency, transferRequest.currency) &&
        Objects.equals(this.amount, transferRequest.amount) &&
        Objects.equals(this.transactionType, transferRequest.transactionType) &&
        Objects.equals(this.note, transferRequest.note) &&
        Objects.equals(this.quoteRequestExtensions, transferRequest.quoteRequestExtensions) &&
        Objects.equals(this.transferRequestExtensions, transferRequest.transferRequestExtensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(homeTransactionId, from, to, amountType, currency, amount, transactionType, note, quoteRequestExtensions, transferRequestExtensions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferRequest {\n");
    
    sb.append("    homeTransactionId: ").append(toIndentedString(homeTransactionId)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    amountType: ").append(toIndentedString(amountType)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    quoteRequestExtensions: ").append(toIndentedString(quoteRequestExtensions)).append("\n");
    sb.append("    transferRequestExtensions: ").append(toIndentedString(transferRequestExtensions)).append("\n");
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

