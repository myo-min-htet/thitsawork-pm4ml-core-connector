package com.modusbox.client.model;

import com.modusbox.client.model.TransferStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public class TransferStatusResponse   {
  
  private @Valid String transferId;
  private @Valid TransferStatus transferState;
  private @Valid String completedTimestamp;

  /**
   * A Mojaloop API identifier (UUID).
   **/
  public TransferStatusResponse transferId(String transferId) {
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
  public TransferStatusResponse transferState(TransferStatus transferState) {
    this.transferState = transferState;
    return this;
  }

  

  
  @JsonProperty("transferState")
  public TransferStatus getTransferState() {
    return transferState;
  }

  public void setTransferState(TransferStatus transferState) {
    this.transferState = transferState;
  }

/**
   * An ISO-8601 formatted timestamp.
   **/
  public TransferStatusResponse completedTimestamp(String completedTimestamp) {
    this.completedTimestamp = completedTimestamp;
    return this;
  }

  

  
  @JsonProperty("completedTimestamp")
 @Pattern(regexp="^(?:[1-9]\\d{3}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1\\d|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|(?:[1-9]\\d(?:0[48]|[2468][048]|[13579][26])|(?:[2468][048]|[13579][26])00)-02-29)T(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d(?:(\\.\\d{3}))(?:Z|[+-][01]\\d:[0-5]\\d)$")  public String getCompletedTimestamp() {
    return completedTimestamp;
  }

  public void setCompletedTimestamp(String completedTimestamp) {
    this.completedTimestamp = completedTimestamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferStatusResponse transferStatusResponse = (TransferStatusResponse) o;
    return Objects.equals(this.transferId, transferStatusResponse.transferId) &&
        Objects.equals(this.transferState, transferStatusResponse.transferState) &&
        Objects.equals(this.completedTimestamp, transferStatusResponse.completedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transferId, transferState, completedTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferStatusResponse {\n");
    
    sb.append("    transferId: ").append(toIndentedString(transferId)).append("\n");
    sb.append("    transferState: ").append(toIndentedString(transferState)).append("\n");
    sb.append("    completedTimestamp: ").append(toIndentedString(completedTimestamp)).append("\n");
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

