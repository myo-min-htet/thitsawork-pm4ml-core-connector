package com.modusbox.client.model;

import com.modusbox.client.model.ExtensionItem;
import com.modusbox.client.model.TransferState;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public class FulfilNotificationFinalNotification   {
  
  private @Valid String completedTimestamp;
  private @Valid TransferState transferState;
  private @Valid List<ExtensionItem> extensionList = new ArrayList<ExtensionItem>();

  /**
   * An ISO-8601 formatted timestamp.
   **/
  public FulfilNotificationFinalNotification completedTimestamp(String completedTimestamp) {
    this.completedTimestamp = completedTimestamp;
    return this;
  }

  

  
  @JsonProperty("completedTimestamp")
  @NotNull
 @Pattern(regexp="^(?:[1-9]\\d{3}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1\\d|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|(?:[1-9]\\d(?:0[48]|[2468][048]|[13579][26])|(?:[2468][048]|[13579][26])00)-02-29)T(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d(?:(\\.\\d{3}))(?:Z|[+-][01]\\d:[0-5]\\d)$")  public String getCompletedTimestamp() {
    return completedTimestamp;
  }

  public void setCompletedTimestamp(String completedTimestamp) {
    this.completedTimestamp = completedTimestamp;
  }

/**
   **/
  public FulfilNotificationFinalNotification transferState(TransferState transferState) {
    this.transferState = transferState;
    return this;
  }

  

  
  @JsonProperty("transferState")
  @NotNull
  public TransferState getTransferState() {
    return transferState;
  }

  public void setTransferState(TransferState transferState) {
    this.transferState = transferState;
  }

/**
   **/
  public FulfilNotificationFinalNotification extensionList(List<ExtensionItem> extensionList) {
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
    FulfilNotificationFinalNotification fulfilNotificationFinalNotification = (FulfilNotificationFinalNotification) o;
    return Objects.equals(this.completedTimestamp, fulfilNotificationFinalNotification.completedTimestamp) &&
        Objects.equals(this.transferState, fulfilNotificationFinalNotification.transferState) &&
        Objects.equals(this.extensionList, fulfilNotificationFinalNotification.extensionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completedTimestamp, transferState, extensionList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfilNotificationFinalNotification {\n");
    
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

