package com.modusbox.client.model;

import com.modusbox.client.model.TransferRequestBulkItem;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Data model for the bulk payment list
 **/

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public class TransferRequestBulk   {
  
  private @Valid List<TransferRequestBulkItem> transferRequestBulkList = new ArrayList<TransferRequestBulkItem>();

  /**
   **/
  public TransferRequestBulk transferRequestBulkList(List<TransferRequestBulkItem> transferRequestBulkList) {
    this.transferRequestBulkList = transferRequestBulkList;
    return this;
  }

  

  
  @JsonProperty("transferRequestBulkList")
  @NotNull
 @Size(min=1)  public List<TransferRequestBulkItem> getTransferRequestBulkList() {
    return transferRequestBulkList;
  }

  public void setTransferRequestBulkList(List<TransferRequestBulkItem> transferRequestBulkList) {
    this.transferRequestBulkList = transferRequestBulkList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferRequestBulk transferRequestBulk = (TransferRequestBulk) o;
    return Objects.equals(this.transferRequestBulkList, transferRequestBulk.transferRequestBulkList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transferRequestBulkList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferRequestBulk {\n");
    
    sb.append("    transferRequestBulkList: ").append(toIndentedString(transferRequestBulkList)).append("\n");
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

