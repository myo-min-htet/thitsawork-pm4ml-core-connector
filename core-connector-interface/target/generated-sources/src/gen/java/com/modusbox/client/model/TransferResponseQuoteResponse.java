package com.modusbox.client.model;

import com.modusbox.client.model.Quote;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public class TransferResponseQuoteResponse   {
  
  private @Valid Quote body;
  private @Valid Object headers;

  /**
   **/
  public TransferResponseQuoteResponse body(Quote body) {
    this.body = body;
    return this;
  }

  

  
  @JsonProperty("body")
  @NotNull
  public Quote getBody() {
    return body;
  }

  public void setBody(Quote body) {
    this.body = body;
  }

/**
   **/
  public TransferResponseQuoteResponse headers(Object headers) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferResponseQuoteResponse transferResponseQuoteResponse = (TransferResponseQuoteResponse) o;
    return Objects.equals(this.body, transferResponseQuoteResponse.body) &&
        Objects.equals(this.headers, transferResponseQuoteResponse.headers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, headers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferResponseQuoteResponse {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
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

