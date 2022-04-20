package com.modusbox.client.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public class FulfilNotificationQuoteResponse   {
  
  private @Valid Object headers;
  private @Valid String body;

  /**
   **/
  public FulfilNotificationQuoteResponse headers(Object headers) {
    this.headers = headers;
    return this;
  }

  

  
  @JsonProperty("headers")
  public Object getHeaders() {
    return headers;
  }

  public void setHeaders(Object headers) {
    this.headers = headers;
  }

/**
   **/
  public FulfilNotificationQuoteResponse body(String body) {
    this.body = body;
    return this;
  }

  

  
  @JsonProperty("body")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfilNotificationQuoteResponse fulfilNotificationQuoteResponse = (FulfilNotificationQuoteResponse) o;
    return Objects.equals(this.headers, fulfilNotificationQuoteResponse.headers) &&
        Objects.equals(this.body, fulfilNotificationQuoteResponse.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headers, body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfilNotificationQuoteResponse {\n");
    
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
