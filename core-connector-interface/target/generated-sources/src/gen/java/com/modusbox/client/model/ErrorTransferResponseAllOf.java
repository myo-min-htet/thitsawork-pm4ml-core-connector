package com.modusbox.client.model;

import com.modusbox.client.model.TransferResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public class ErrorTransferResponseAllOf   {
  
  private @Valid TransferResponse transferState;

  /**
   **/
  public ErrorTransferResponseAllOf transferState(TransferResponse transferState) {
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
    ErrorTransferResponseAllOf errorTransferResponseAllOf = (ErrorTransferResponseAllOf) o;
    return Objects.equals(this.transferState, errorTransferResponseAllOf.transferState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transferState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorTransferResponseAllOf {\n");
    
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

