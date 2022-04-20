package com.modusbox.client.model;

import com.modusbox.client.model.MojaloopError;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * This object represents a Mojaloop API error received at any time during the transfer process
 **/

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public class TransferError   {
  
  private @Valid Integer httpStatusCode;
  private @Valid MojaloopError mojaloopError;

  /**
   * The HTTP status code returned to the caller. This is the same as the actual HTTP status code returned with the response.
   **/
  public TransferError httpStatusCode(Integer httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
    return this;
  }

  

  
  @JsonProperty("httpStatusCode")
  public Integer getHttpStatusCode() {
    return httpStatusCode;
  }

  public void setHttpStatusCode(Integer httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
  }

/**
   **/
  public TransferError mojaloopError(MojaloopError mojaloopError) {
    this.mojaloopError = mojaloopError;
    return this;
  }

  

  
  @JsonProperty("mojaloopError")
  public MojaloopError getMojaloopError() {
    return mojaloopError;
  }

  public void setMojaloopError(MojaloopError mojaloopError) {
    this.mojaloopError = mojaloopError;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferError transferError = (TransferError) o;
    return Objects.equals(this.httpStatusCode, transferError.httpStatusCode) &&
        Objects.equals(this.mojaloopError, transferError.mojaloopError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpStatusCode, mojaloopError);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferError {\n");
    
    sb.append("    httpStatusCode: ").append(toIndentedString(httpStatusCode)).append("\n");
    sb.append("    mojaloopError: ").append(toIndentedString(mojaloopError)).append("\n");
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

