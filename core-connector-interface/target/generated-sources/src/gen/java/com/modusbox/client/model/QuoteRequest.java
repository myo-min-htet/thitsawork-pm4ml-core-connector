package com.modusbox.client.model;

import com.modusbox.client.model.AmountType;
import com.modusbox.client.model.Currency;
import com.modusbox.client.model.ExtensionItem;
import com.modusbox.client.model.GeoCode;
import com.modusbox.client.model.Initiator;
import com.modusbox.client.model.InitiatorType;
import com.modusbox.client.model.TransactionType;
import com.modusbox.client.model.TransferPartyInbound;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A request for a quote for transfer from the DFSP backend.
 **/

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public class QuoteRequest   {
  
  private @Valid String quoteId;
  private @Valid String transactionId;
  private @Valid TransferPartyInbound to;
  private @Valid TransferPartyInbound from;
  private @Valid AmountType amountType;
  private @Valid String amount;
  private @Valid Currency currency;
  private @Valid String feesAmount;
  private @Valid Currency feesCurrency;
  private @Valid TransactionType transactionType;
  private @Valid Initiator initiator;
  private @Valid InitiatorType initiatorType;
  private @Valid GeoCode geoCode;
  private @Valid String note;
  private @Valid String expiration;
  private @Valid List<ExtensionItem> extensionList = new ArrayList<ExtensionItem>();

  /**
   * A Mojaloop API quote identifier (UUID).
   **/
  public QuoteRequest quoteId(String quoteId) {
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
  public QuoteRequest transactionId(String transactionId) {
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
  public QuoteRequest to(TransferPartyInbound to) {
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
  public QuoteRequest from(TransferPartyInbound from) {
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
  public QuoteRequest amountType(AmountType amountType) {
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
  public QuoteRequest amount(String amount) {
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
  public QuoteRequest currency(Currency currency) {
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
  public QuoteRequest feesAmount(String feesAmount) {
    this.feesAmount = feesAmount;
    return this;
  }

  

  
  @JsonProperty("feesAmount")
 @Pattern(regexp="^([0]|([1-9][0-9]{0,17}))([.][0-9]{0,3}[1-9])?$")  public String getFeesAmount() {
    return feesAmount;
  }

  public void setFeesAmount(String feesAmount) {
    this.feesAmount = feesAmount;
  }

/**
   **/
  public QuoteRequest feesCurrency(Currency feesCurrency) {
    this.feesCurrency = feesCurrency;
    return this;
  }

  

  
  @JsonProperty("feesCurrency")
  public Currency getFeesCurrency() {
    return feesCurrency;
  }

  public void setFeesCurrency(Currency feesCurrency) {
    this.feesCurrency = feesCurrency;
  }

/**
   **/
  public QuoteRequest transactionType(TransactionType transactionType) {
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
  public QuoteRequest initiator(Initiator initiator) {
    this.initiator = initiator;
    return this;
  }

  

  
  @JsonProperty("initiator")
  @NotNull
  public Initiator getInitiator() {
    return initiator;
  }

  public void setInitiator(Initiator initiator) {
    this.initiator = initiator;
  }

/**
   **/
  public QuoteRequest initiatorType(InitiatorType initiatorType) {
    this.initiatorType = initiatorType;
    return this;
  }

  

  
  @JsonProperty("initiatorType")
  @NotNull
  public InitiatorType getInitiatorType() {
    return initiatorType;
  }

  public void setInitiatorType(InitiatorType initiatorType) {
    this.initiatorType = initiatorType;
  }

/**
   **/
  public QuoteRequest geoCode(GeoCode geoCode) {
    this.geoCode = geoCode;
    return this;
  }

  

  
  @JsonProperty("geoCode")
  public GeoCode getGeoCode() {
    return geoCode;
  }

  public void setGeoCode(GeoCode geoCode) {
    this.geoCode = geoCode;
  }

/**
   * An optional note associated with the requested transfer.
   **/
  public QuoteRequest note(String note) {
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
   * An ISO-8601 formatted timestamp.
   **/
  public QuoteRequest expiration(String expiration) {
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
  public QuoteRequest extensionList(List<ExtensionItem> extensionList) {
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
    QuoteRequest quoteRequest = (QuoteRequest) o;
    return Objects.equals(this.quoteId, quoteRequest.quoteId) &&
        Objects.equals(this.transactionId, quoteRequest.transactionId) &&
        Objects.equals(this.to, quoteRequest.to) &&
        Objects.equals(this.from, quoteRequest.from) &&
        Objects.equals(this.amountType, quoteRequest.amountType) &&
        Objects.equals(this.amount, quoteRequest.amount) &&
        Objects.equals(this.currency, quoteRequest.currency) &&
        Objects.equals(this.feesAmount, quoteRequest.feesAmount) &&
        Objects.equals(this.feesCurrency, quoteRequest.feesCurrency) &&
        Objects.equals(this.transactionType, quoteRequest.transactionType) &&
        Objects.equals(this.initiator, quoteRequest.initiator) &&
        Objects.equals(this.initiatorType, quoteRequest.initiatorType) &&
        Objects.equals(this.geoCode, quoteRequest.geoCode) &&
        Objects.equals(this.note, quoteRequest.note) &&
        Objects.equals(this.expiration, quoteRequest.expiration) &&
        Objects.equals(this.extensionList, quoteRequest.extensionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quoteId, transactionId, to, from, amountType, amount, currency, feesAmount, feesCurrency, transactionType, initiator, initiatorType, geoCode, note, expiration, extensionList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteRequest {\n");
    
    sb.append("    quoteId: ").append(toIndentedString(quoteId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    amountType: ").append(toIndentedString(amountType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    feesAmount: ").append(toIndentedString(feesAmount)).append("\n");
    sb.append("    feesCurrency: ").append(toIndentedString(feesCurrency)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
    sb.append("    initiatorType: ").append(toIndentedString(initiatorType)).append("\n");
    sb.append("    geoCode: ").append(toIndentedString(geoCode)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
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

