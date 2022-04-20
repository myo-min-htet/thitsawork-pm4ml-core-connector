package com.modusbox.client.model;

import com.modusbox.client.model.ExtensionListComplex;
import com.modusbox.client.model.MojaloopTransferState;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A Mojaloop API transfer fulfilment
 **/

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public class TransferFulfilment   {
  
  private @Valid String fulfilment;
  private @Valid String completedTimestamp;
  private @Valid MojaloopTransferState transferState;
  private @Valid ExtensionListComplex extensionList;

  /**
   * Fulfilment that must be attached to the transfer by the Payee.
   **/
  public TransferFulfilment fulfilment(String fulfilment) {
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

/**
   * An ISO-8601 formatted timestamp.
   **/
  public TransferFulfilment completedTimestamp(String completedTimestamp) {
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

/**
   **/
  public TransferFulfilment transferState(MojaloopTransferState transferState) {
    this.transferState = transferState;
    return this;
  }

  

  
  @JsonProperty("transferState")
  @NotNull
  public MojaloopTransferState getTransferState() {
    return transferState;
  }

  public void setTransferState(MojaloopTransferState transferState) {
    this.transferState = transferState;
  }

/**
   **/
  public TransferFulfilment extensionList(ExtensionListComplex extensionList) {
    this.extensionList = extensionList;
    return this;
  }

  

  
  @JsonProperty("extensionList")
  public ExtensionListComplex getExtensionList() {
    return extensionList;
  }

  public void setExtensionList(ExtensionListComplex extensionList) {
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
    TransferFulfilment transferFulfilment = (TransferFulfilment) o;
    return Objects.equals(this.fulfilment, transferFulfilment.fulfilment) &&
        Objects.equals(this.completedTimestamp, transferFulfilment.completedTimestamp) &&
        Objects.equals(this.transferState, transferFulfilment.transferState) &&
        Objects.equals(this.extensionList, transferFulfilment.extensionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfilment, completedTimestamp, transferState, extensionList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferFulfilment {\n");
    
    sb.append("    fulfilment: ").append(toIndentedString(fulfilment)).append("\n");
    sb.append("    completedTimestamp: ").append(toIndentedString(completedTimestamp)).append("\n");
    sb.append("    transferState: ").append(toIndentedString(transferState)).append("\n");
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

