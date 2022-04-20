package com.modusbox.client.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public class TransferResponseInbound   {
  
  private @Valid String homeTransactionId;

  /**
   * Transaction ID from the DFSP backend, used to reconcile transactions between the Switch and DFSP backend systems.
   **/
  public TransferResponseInbound homeTransactionId(String homeTransactionId) {
    this.homeTransactionId = homeTransactionId;
    return this;
  }

  

  
  @JsonProperty("homeTransactionId")
 @Size(max=255)  public String getHomeTransactionId() {
    return homeTransactionId;
  }

  public void setHomeTransactionId(String homeTransactionId) {
    this.homeTransactionId = homeTransactionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferResponseInbound transferResponseInbound = (TransferResponseInbound) o;
    return Objects.equals(this.homeTransactionId, transferResponseInbound.homeTransactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(homeTransactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferResponseInbound {\n");
    
    sb.append("    homeTransactionId: ").append(toIndentedString(homeTransactionId)).append("\n");
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

