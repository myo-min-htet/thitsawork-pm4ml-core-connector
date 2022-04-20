package com.modusbox.client.model;

import com.modusbox.client.model.ErrorResponse;
import com.modusbox.client.model.ErrorTransferResponseAllOf;
import com.modusbox.client.model.TransferResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public class ErrorTransferResponse   {
  
  private @Valid String statusCode;
  private @Valid String message;
  private @Valid TransferResponse transferState;

  /**
   * Error code as string.
   **/
  public ErrorTransferResponse statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  

  
  @JsonProperty("statusCode")
 @Pattern(regexp="^[1-9]\\d{2,3}$")  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

/**
   * Error message text.
   **/
  public ErrorTransferResponse message(String message) {
    this.message = message;
    return this;
  }

  

  
  @JsonProperty("message")
 @Size(max=4096)  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

/**
   **/
  public ErrorTransferResponse transferState(TransferResponse transferState) {
    this.transferState = transferState;
    return this;
  }

  

  
  @JsonProperty("transferState")
  @NotNull
  public TransferResponse getTransferState() {
    return transferState;
  }

  public void setTransferState(TransferResponse transferState) {
    this.transferState = transferState;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorTransferResponse errorTransferResponse = (ErrorTransferResponse) o;
    return Objects.equals(this.statusCode, errorTransferResponse.statusCode) &&
        Objects.equals(this.message, errorTransferResponse.message) &&
        Objects.equals(this.transferState, errorTransferResponse.transferState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, message, transferState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorTransferResponse {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    transferState: ").append(toIndentedString(transferState)).append("\n");
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

