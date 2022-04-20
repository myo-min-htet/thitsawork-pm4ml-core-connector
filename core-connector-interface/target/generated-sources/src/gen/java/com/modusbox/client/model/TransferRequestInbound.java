package com.modusbox.client.model;

import com.modusbox.client.model.AmountType;
import com.modusbox.client.model.Currency;
import com.modusbox.client.model.ExtensionItem;
import com.modusbox.client.model.QuoteResponse;
import com.modusbox.client.model.TransactionType;
import com.modusbox.client.model.TransferPartyInbound;
import com.modusbox.client.model.TransferRequestInboundIlpPacket;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public class TransferRequestInbound   {
  
  private @Valid String transferId;
  private @Valid QuoteResponse quote;
  private @Valid TransferPartyInbound from;
  private @Valid TransferPartyInbound to;
  private @Valid AmountType amountType;
  private @Valid Currency currency;
  private @Valid String amount;
  private @Valid TransactionType transactionType;
  private @Valid TransferRequestInboundIlpPacket ilpPacket;
  private @Valid String note;
  private @Valid List<ExtensionItem> extensionList = new ArrayList<ExtensionItem>();

  /**
   * A Mojaloop API transfer identifier (UUID).
   **/
  public TransferRequestInbound transferId(String transferId) {
    this.transferId = transferId;
    return this;
  }

  

  
  @JsonProperty("transferId")
  @NotNull
 @Pattern(regexp="^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$")  public String getTransferId() {
    return transferId;
  }

  public void setTransferId(String transferId) {
    this.transferId = transferId;
  }

/**
   **/
  public TransferRequestInbound quote(QuoteResponse quote) {
    this.quote = quote;
    return this;
  }

  

  
  @JsonProperty("quote")
  @NotNull
  public QuoteResponse getQuote() {
    return quote;
  }

  public void setQuote(QuoteResponse quote) {
    this.quote = quote;
  }

/**
   **/
  public TransferRequestInbound from(TransferPartyInbound from) {
    this.from = from;
    return this;
  }

  

  
  @JsonProperty("from")
  @NotNull
  public TransferPartyInbound getFrom() {
    return from;
  }

  public void setFrom(TransferPartyInbound from) {
    this.from = from;
  }

/**
   **/
  public TransferRequestInbound to(TransferPartyInbound to) {
    this.to = to;
    return this;
  }

  

  
  @JsonProperty("to")
  @NotNull
  public TransferPartyInbound getTo() {
    return to;
  }

  public void setTo(TransferPartyInbound to) {
    this.to = to;
  }

/**
   **/
  public TransferRequestInbound amountType(AmountType amountType) {
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
  public TransferRequestInbound currency(Currency currency) {
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
  public TransferRequestInbound amount(String amount) {
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
  public TransferRequestInbound transactionType(TransactionType transactionType) {
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
  public TransferRequestInbound ilpPacket(TransferRequestInboundIlpPacket ilpPacket) {
    this.ilpPacket = ilpPacket;
    return this;
  }

  

  
  @JsonProperty("ilpPacket")
  public TransferRequestInboundIlpPacket getIlpPacket() {
    return ilpPacket;
  }

  public void setIlpPacket(TransferRequestInboundIlpPacket ilpPacket) {
    this.ilpPacket = ilpPacket;
  }

/**
   **/
  public TransferRequestInbound note(String note) {
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
  public TransferRequestInbound extensionList(List<ExtensionItem> extensionList) {
    this.extensionList = extensionList;
    return this;
  }

  

  
  @JsonProperty("extensionList")
 @Size(min=0,max=16)  public List<ExtensionItem> getExtensionList() {
    return extensionList;
  }

  public void setExtensionList(List<ExtensionItem> extensionList) {
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
    TransferRequestInbound transferRequestInbound = (TransferRequestInbound) o;
    return Objects.equals(this.transferId, transferRequestInbound.transferId) &&
        Objects.equals(this.quote, transferRequestInbound.quote) &&
        Objects.equals(this.from, transferRequestInbound.from) &&
        Objects.equals(this.to, transferRequestInbound.to) &&
        Objects.equals(this.amountType, transferRequestInbound.amountType) &&
        Objects.equals(this.currency, transferRequestInbound.currency) &&
        Objects.equals(this.amount, transferRequestInbound.amount) &&
        Objects.equals(this.transactionType, transferRequestInbound.transactionType) &&
        Objects.equals(this.ilpPacket, transferRequestInbound.ilpPacket) &&
        Objects.equals(this.note, transferRequestInbound.note) &&
        Objects.equals(this.extensionList, transferRequestInbound.extensionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transferId, quote, from, to, amountType, currency, amount, transactionType, ilpPacket, note, extensionList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferRequestInbound {\n");
    
    sb.append("    transferId: ").append(toIndentedString(transferId)).append("\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    amountType: ").append(toIndentedString(amountType)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    ilpPacket: ").append(toIndentedString(ilpPacket)).append("\n");
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

