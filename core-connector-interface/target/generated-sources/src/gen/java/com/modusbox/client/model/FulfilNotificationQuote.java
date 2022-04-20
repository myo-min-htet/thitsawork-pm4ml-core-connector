package com.modusbox.client.model;

import com.modusbox.client.model.MojaloopQuoteRequestObject;
import com.modusbox.client.model.MojaloopQuoteResponseObject;
import com.modusbox.client.model.QuoteRequest;
import com.modusbox.client.model.QuoteResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public class FulfilNotificationQuote   {
  
  private @Valid MojaloopQuoteRequestObject request;
  private @Valid QuoteRequest internalRequest;
  private @Valid QuoteResponse response;
  private @Valid MojaloopQuoteResponseObject mojaloopResponse;
  private @Valid String fulfilment;

  /**
   **/
  public FulfilNotificationQuote request(MojaloopQuoteRequestObject request) {
    this.request = request;
    return this;
  }

  

  
  @JsonProperty("request")
  public MojaloopQuoteRequestObject getRequest() {
    return request;
  }

  public void setRequest(MojaloopQuoteRequestObject request) {
    this.request = request;
  }

/**
   **/
  public FulfilNotificationQuote internalRequest(QuoteRequest internalRequest) {
    this.internalRequest = internalRequest;
    return this;
  }

  

  
  @JsonProperty("internalRequest")
  public QuoteRequest getInternalRequest() {
    return internalRequest;
  }

  public void setInternalRequest(QuoteRequest internalRequest) {
    this.internalRequest = internalRequest;
  }

/**
   **/
  public FulfilNotificationQuote response(QuoteResponse response) {
    this.response = response;
    return this;
  }

  

  
  @JsonProperty("response")
  public QuoteResponse getResponse() {
    return response;
  }

  public void setResponse(QuoteResponse response) {
    this.response = response;
  }

/**
   **/
  public FulfilNotificationQuote mojaloopResponse(MojaloopQuoteResponseObject mojaloopResponse) {
    this.mojaloopResponse = mojaloopResponse;
    return this;
  }

  

  
  @JsonProperty("mojaloopResponse")
  public MojaloopQuoteResponseObject getMojaloopResponse() {
    return mojaloopResponse;
  }

  public void setMojaloopResponse(MojaloopQuoteResponseObject mojaloopResponse) {
    this.mojaloopResponse = mojaloopResponse;
  }

/**
   * Fulfilment that must be attached to the transfer by the Payee.
   **/
  public FulfilNotificationQuote fulfilment(String fulfilment) {
    this.fulfilment = fulfilment;
    return this;
  }

  

  
  @JsonProperty("fulfilment")
 @Pattern(regexp="^[A-Za-z0-9-_]{43}$") @Size(max=48)  public String getFulfilment() {
    return fulfilment;
  }

  public void setFulfilment(String fulfilment) {
    this.fulfilment = fulfilment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfilNotificationQuote fulfilNotificationQuote = (FulfilNotificationQuote) o;
    return Objects.equals(this.request, fulfilNotificationQuote.request) &&
        Objects.equals(this.internalRequest, fulfilNotificationQuote.internalRequest) &&
        Objects.equals(this.response, fulfilNotificationQuote.response) &&
        Objects.equals(this.mojaloopResponse, fulfilNotificationQuote.mojaloopResponse) &&
        Objects.equals(this.fulfilment, fulfilNotificationQuote.fulfilment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request, internalRequest, response, mojaloopResponse, fulfilment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfilNotificationQuote {\n");
    
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    internalRequest: ").append(toIndentedString(internalRequest)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    mojaloopResponse: ").append(toIndentedString(mojaloopResponse)).append("\n");
    sb.append("    fulfilment: ").append(toIndentedString(fulfilment)).append("\n");
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

