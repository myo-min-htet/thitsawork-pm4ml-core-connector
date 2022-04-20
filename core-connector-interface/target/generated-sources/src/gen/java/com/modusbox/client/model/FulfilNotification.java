package com.modusbox.client.model;

import com.modusbox.client.model.FulfilNotificationFinalNotification;
import com.modusbox.client.model.FulfilNotificationPrepare;
import com.modusbox.client.model.FulfilNotificationQuote;
import com.modusbox.client.model.FulfilNotificationQuoteRequest;
import com.modusbox.client.model.FulfilNotificationQuoteResponse;
import com.modusbox.client.model.TransferError;
import com.modusbox.client.model.TransferStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * PUT /transfers/{transferId} object
 **/

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public class FulfilNotification   {
  
  private @Valid String transferId;

public enum DirectionEnum {

    INBOUND(String.valueOf("INBOUND"));


    private String value;

    DirectionEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static DirectionEnum fromValue(String value) {
        for (DirectionEnum b : DirectionEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid DirectionEnum direction;
  private @Valid FulfilNotificationQuoteRequest quoteRequest;
  private @Valid FulfilNotificationQuoteResponse quoteResponse;
  private @Valid FulfilNotificationPrepare prepare;
  private @Valid FulfilNotificationQuoteResponse fulfil;
  private @Valid FulfilNotificationQuote quote;
  private @Valid TransferStatus currentState;
  private @Valid TransferError lastError;
  private @Valid String initiatedTimestamp;
  private @Valid FulfilNotificationFinalNotification finalNotification;

  /**
   * A Mojaloop API transfer identifier (UUID).
   **/
  public FulfilNotification transferId(String transferId) {
    this.transferId = transferId;
    return this;
  }

  

  
  @JsonProperty("transferId")
 @Pattern(regexp="^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$")  public String getTransferId() {
    return transferId;
  }

  public void setTransferId(String transferId) {
    this.transferId = transferId;
  }

/**
   **/
  public FulfilNotification direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

  

  
  @JsonProperty("direction")
  public DirectionEnum getDirection() {
    return direction;
  }

  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

/**
   **/
  public FulfilNotification quoteRequest(FulfilNotificationQuoteRequest quoteRequest) {
    this.quoteRequest = quoteRequest;
    return this;
  }

  

  
  @JsonProperty("quoteRequest")
  public FulfilNotificationQuoteRequest getQuoteRequest() {
    return quoteRequest;
  }

  public void setQuoteRequest(FulfilNotificationQuoteRequest quoteRequest) {
    this.quoteRequest = quoteRequest;
  }

/**
   **/
  public FulfilNotification quoteResponse(FulfilNotificationQuoteResponse quoteResponse) {
    this.quoteResponse = quoteResponse;
    return this;
  }

  

  
  @JsonProperty("quoteResponse")
  public FulfilNotificationQuoteResponse getQuoteResponse() {
    return quoteResponse;
  }

  public void setQuoteResponse(FulfilNotificationQuoteResponse quoteResponse) {
    this.quoteResponse = quoteResponse;
  }

/**
   **/
  public FulfilNotification prepare(FulfilNotificationPrepare prepare) {
    this.prepare = prepare;
    return this;
  }

  

  
  @JsonProperty("prepare")
  public FulfilNotificationPrepare getPrepare() {
    return prepare;
  }

  public void setPrepare(FulfilNotificationPrepare prepare) {
    this.prepare = prepare;
  }

/**
   **/
  public FulfilNotification fulfil(FulfilNotificationQuoteResponse fulfil) {
    this.fulfil = fulfil;
    return this;
  }

  

  
  @JsonProperty("fulfil")
  public FulfilNotificationQuoteResponse getFulfil() {
    return fulfil;
  }

  public void setFulfil(FulfilNotificationQuoteResponse fulfil) {
    this.fulfil = fulfil;
  }

/**
   **/
  public FulfilNotification quote(FulfilNotificationQuote quote) {
    this.quote = quote;
    return this;
  }

  

  
  @JsonProperty("quote")
  public FulfilNotificationQuote getQuote() {
    return quote;
  }

  public void setQuote(FulfilNotificationQuote quote) {
    this.quote = quote;
  }

/**
   **/
  public FulfilNotification currentState(TransferStatus currentState) {
    this.currentState = currentState;
    return this;
  }

  

  
  @JsonProperty("currentState")
  public TransferStatus getCurrentState() {
    return currentState;
  }

  public void setCurrentState(TransferStatus currentState) {
    this.currentState = currentState;
  }

/**
   **/
  public FulfilNotification lastError(TransferError lastError) {
    this.lastError = lastError;
    return this;
  }

  

  
  @JsonProperty("lastError")
  public TransferError getLastError() {
    return lastError;
  }

  public void setLastError(TransferError lastError) {
    this.lastError = lastError;
  }

/**
   * An ISO-8601 formatted timestamp.
   **/
  public FulfilNotification initiatedTimestamp(String initiatedTimestamp) {
    this.initiatedTimestamp = initiatedTimestamp;
    return this;
  }

  

  
  @JsonProperty("initiatedTimestamp")
 @Pattern(regexp="^(?:[1-9]\\d{3}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1\\d|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|(?:[1-9]\\d(?:0[48]|[2468][048]|[13579][26])|(?:[2468][048]|[13579][26])00)-02-29)T(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d(?:(\\.\\d{3}))(?:Z|[+-][01]\\d:[0-5]\\d)$")  public String getInitiatedTimestamp() {
    return initiatedTimestamp;
  }

  public void setInitiatedTimestamp(String initiatedTimestamp) {
    this.initiatedTimestamp = initiatedTimestamp;
  }

/**
   **/
  public FulfilNotification finalNotification(FulfilNotificationFinalNotification finalNotification) {
    this.finalNotification = finalNotification;
    return this;
  }

  

  
  @JsonProperty("finalNotification")
  public FulfilNotificationFinalNotification getFinalNotification() {
    return finalNotification;
  }

  public void setFinalNotification(FulfilNotificationFinalNotification finalNotification) {
    this.finalNotification = finalNotification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfilNotification fulfilNotification = (FulfilNotification) o;
    return Objects.equals(this.transferId, fulfilNotification.transferId) &&
        Objects.equals(this.direction, fulfilNotification.direction) &&
        Objects.equals(this.quoteRequest, fulfilNotification.quoteRequest) &&
        Objects.equals(this.quoteResponse, fulfilNotification.quoteResponse) &&
        Objects.equals(this.prepare, fulfilNotification.prepare) &&
        Objects.equals(this.fulfil, fulfilNotification.fulfil) &&
        Objects.equals(this.quote, fulfilNotification.quote) &&
        Objects.equals(this.currentState, fulfilNotification.currentState) &&
        Objects.equals(this.lastError, fulfilNotification.lastError) &&
        Objects.equals(this.initiatedTimestamp, fulfilNotification.initiatedTimestamp) &&
        Objects.equals(this.finalNotification, fulfilNotification.finalNotification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transferId, direction, quoteRequest, quoteResponse, prepare, fulfil, quote, currentState, lastError, initiatedTimestamp, finalNotification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfilNotification {\n");
    
    sb.append("    transferId: ").append(toIndentedString(transferId)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    quoteRequest: ").append(toIndentedString(quoteRequest)).append("\n");
    sb.append("    quoteResponse: ").append(toIndentedString(quoteResponse)).append("\n");
    sb.append("    prepare: ").append(toIndentedString(prepare)).append("\n");
    sb.append("    fulfil: ").append(toIndentedString(fulfil)).append("\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
    sb.append("    currentState: ").append(toIndentedString(currentState)).append("\n");
    sb.append("    lastError: ").append(toIndentedString(lastError)).append("\n");
    sb.append("    initiatedTimestamp: ").append(toIndentedString(initiatedTimestamp)).append("\n");
    sb.append("    finalNotification: ").append(toIndentedString(finalNotification)).append("\n");
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

