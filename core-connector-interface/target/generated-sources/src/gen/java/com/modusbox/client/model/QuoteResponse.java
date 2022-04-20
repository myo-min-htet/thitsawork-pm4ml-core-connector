package com.modusbox.client.model;

import com.modusbox.client.model.Currency;
import com.modusbox.client.model.ExtensionItem;
import com.modusbox.client.model.GeoCode;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A response to a request for a quote.
 **/

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public class QuoteResponse   {
  
  private @Valid String quoteId;
  private @Valid String transactionId;
  private @Valid String transferAmount;
  private @Valid Currency transferAmountCurrency;
  private @Valid String payeeReceiveAmount;
  private @Valid Currency payeeReceiveAmountCurrency;
  private @Valid String payeeFspFeeAmount;
  private @Valid Currency payeeFspFeeAmountCurrency;
  private @Valid String payeeFspCommissionAmount;
  private @Valid Currency payeeFspCommissionAmountCurrency;
  private @Valid String expiration;
  private @Valid GeoCode geoCode;
  private @Valid List<ExtensionItem> extensionList = new ArrayList<ExtensionItem>();

  /**
   * A Mojaloop API quote identifier (UUID).
   **/
  public QuoteResponse quoteId(String quoteId) {
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
  public QuoteResponse transactionId(String transactionId) {
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
  public QuoteResponse transferAmount(String transferAmount) {
    this.transferAmount = transferAmount;
    return this;
  }

  

  
  @JsonProperty("transferAmount")
  @NotNull
 @Pattern(regexp="^([0]|([1-9][0-9]{0,17}))([.][0-9]{0,3}[1-9])?$")  public String getTransferAmount() {
    return transferAmount;
  }

  public void setTransferAmount(String transferAmount) {
    this.transferAmount = transferAmount;
  }

/**
   **/
  public QuoteResponse transferAmountCurrency(Currency transferAmountCurrency) {
    this.transferAmountCurrency = transferAmountCurrency;
    return this;
  }

  

  
  @JsonProperty("transferAmountCurrency")
  @NotNull
  public Currency getTransferAmountCurrency() {
    return transferAmountCurrency;
  }

  public void setTransferAmountCurrency(Currency transferAmountCurrency) {
    this.transferAmountCurrency = transferAmountCurrency;
  }

/**
   **/
  public QuoteResponse payeeReceiveAmount(String payeeReceiveAmount) {
    this.payeeReceiveAmount = payeeReceiveAmount;
    return this;
  }

  

  
  @JsonProperty("payeeReceiveAmount")
 @Pattern(regexp="^([0]|([1-9][0-9]{0,17}))([.][0-9]{0,3}[1-9])?$")  public String getPayeeReceiveAmount() {
    return payeeReceiveAmount;
  }

  public void setPayeeReceiveAmount(String payeeReceiveAmount) {
    this.payeeReceiveAmount = payeeReceiveAmount;
  }

/**
   **/
  public QuoteResponse payeeReceiveAmountCurrency(Currency payeeReceiveAmountCurrency) {
    this.payeeReceiveAmountCurrency = payeeReceiveAmountCurrency;
    return this;
  }

  

  
  @JsonProperty("payeeReceiveAmountCurrency")
  public Currency getPayeeReceiveAmountCurrency() {
    return payeeReceiveAmountCurrency;
  }

  public void setPayeeReceiveAmountCurrency(Currency payeeReceiveAmountCurrency) {
    this.payeeReceiveAmountCurrency = payeeReceiveAmountCurrency;
  }

/**
   **/
  public QuoteResponse payeeFspFeeAmount(String payeeFspFeeAmount) {
    this.payeeFspFeeAmount = payeeFspFeeAmount;
    return this;
  }

  

  
  @JsonProperty("payeeFspFeeAmount")
 @Pattern(regexp="^([0]|([1-9][0-9]{0,17}))([.][0-9]{0,3}[1-9])?$")  public String getPayeeFspFeeAmount() {
    return payeeFspFeeAmount;
  }

  public void setPayeeFspFeeAmount(String payeeFspFeeAmount) {
    this.payeeFspFeeAmount = payeeFspFeeAmount;
  }

/**
   **/
  public QuoteResponse payeeFspFeeAmountCurrency(Currency payeeFspFeeAmountCurrency) {
    this.payeeFspFeeAmountCurrency = payeeFspFeeAmountCurrency;
    return this;
  }

  

  
  @JsonProperty("payeeFspFeeAmountCurrency")
  public Currency getPayeeFspFeeAmountCurrency() {
    return payeeFspFeeAmountCurrency;
  }

  public void setPayeeFspFeeAmountCurrency(Currency payeeFspFeeAmountCurrency) {
    this.payeeFspFeeAmountCurrency = payeeFspFeeAmountCurrency;
  }

/**
   **/
  public QuoteResponse payeeFspCommissionAmount(String payeeFspCommissionAmount) {
    this.payeeFspCommissionAmount = payeeFspCommissionAmount;
    return this;
  }

  

  
  @JsonProperty("payeeFspCommissionAmount")
 @Pattern(regexp="^([0]|([1-9][0-9]{0,17}))([.][0-9]{0,3}[1-9])?$")  public String getPayeeFspCommissionAmount() {
    return payeeFspCommissionAmount;
  }

  public void setPayeeFspCommissionAmount(String payeeFspCommissionAmount) {
    this.payeeFspCommissionAmount = payeeFspCommissionAmount;
  }

/**
   **/
  public QuoteResponse payeeFspCommissionAmountCurrency(Currency payeeFspCommissionAmountCurrency) {
    this.payeeFspCommissionAmountCurrency = payeeFspCommissionAmountCurrency;
    return this;
  }

  

  
  @JsonProperty("payeeFspCommissionAmountCurrency")
  public Currency getPayeeFspCommissionAmountCurrency() {
    return payeeFspCommissionAmountCurrency;
  }

  public void setPayeeFspCommissionAmountCurrency(Currency payeeFspCommissionAmountCurrency) {
    this.payeeFspCommissionAmountCurrency = payeeFspCommissionAmountCurrency;
  }

/**
   * An ISO-8601 formatted timestamp.
   **/
  public QuoteResponse expiration(String expiration) {
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
  public QuoteResponse geoCode(GeoCode geoCode) {
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
   **/
  public QuoteResponse extensionList(List<ExtensionItem> extensionList) {
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
    QuoteResponse quoteResponse = (QuoteResponse) o;
    return Objects.equals(this.quoteId, quoteResponse.quoteId) &&
        Objects.equals(this.transactionId, quoteResponse.transactionId) &&
        Objects.equals(this.transferAmount, quoteResponse.transferAmount) &&
        Objects.equals(this.transferAmountCurrency, quoteResponse.transferAmountCurrency) &&
        Objects.equals(this.payeeReceiveAmount, quoteResponse.payeeReceiveAmount) &&
        Objects.equals(this.payeeReceiveAmountCurrency, quoteResponse.payeeReceiveAmountCurrency) &&
        Objects.equals(this.payeeFspFeeAmount, quoteResponse.payeeFspFeeAmount) &&
        Objects.equals(this.payeeFspFeeAmountCurrency, quoteResponse.payeeFspFeeAmountCurrency) &&
        Objects.equals(this.payeeFspCommissionAmount, quoteResponse.payeeFspCommissionAmount) &&
        Objects.equals(this.payeeFspCommissionAmountCurrency, quoteResponse.payeeFspCommissionAmountCurrency) &&
        Objects.equals(this.expiration, quoteResponse.expiration) &&
        Objects.equals(this.geoCode, quoteResponse.geoCode) &&
        Objects.equals(this.extensionList, quoteResponse.extensionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quoteId, transactionId, transferAmount, transferAmountCurrency, payeeReceiveAmount, payeeReceiveAmountCurrency, payeeFspFeeAmount, payeeFspFeeAmountCurrency, payeeFspCommissionAmount, payeeFspCommissionAmountCurrency, expiration, geoCode, extensionList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteResponse {\n");
    
    sb.append("    quoteId: ").append(toIndentedString(quoteId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    transferAmount: ").append(toIndentedString(transferAmount)).append("\n");
    sb.append("    transferAmountCurrency: ").append(toIndentedString(transferAmountCurrency)).append("\n");
    sb.append("    payeeReceiveAmount: ").append(toIndentedString(payeeReceiveAmount)).append("\n");
    sb.append("    payeeReceiveAmountCurrency: ").append(toIndentedString(payeeReceiveAmountCurrency)).append("\n");
    sb.append("    payeeFspFeeAmount: ").append(toIndentedString(payeeFspFeeAmount)).append("\n");
    sb.append("    payeeFspFeeAmountCurrency: ").append(toIndentedString(payeeFspFeeAmountCurrency)).append("\n");
    sb.append("    payeeFspCommissionAmount: ").append(toIndentedString(payeeFspCommissionAmount)).append("\n");
    sb.append("    payeeFspCommissionAmountCurrency: ").append(toIndentedString(payeeFspCommissionAmountCurrency)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    geoCode: ").append(toIndentedString(geoCode)).append("\n");
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

