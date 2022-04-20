package com.modusbox.client.model;

import com.modusbox.client.model.IlpPacketData;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public class TransferRequestInboundIlpPacket   {
  
  private @Valid IlpPacketData data;

  /**
   **/
  public TransferRequestInboundIlpPacket data(IlpPacketData data) {
    this.data = data;
    return this;
  }

  

  
  @JsonProperty("data")
  @NotNull
  public IlpPacketData getData() {
    return data;
  }

  public void setData(IlpPacketData data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferRequestInboundIlpPacket transferRequestInboundIlpPacket = (TransferRequestInboundIlpPacket) o;
    return Objects.equals(this.data, transferRequestInboundIlpPacket.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferRequestInboundIlpPacket {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

