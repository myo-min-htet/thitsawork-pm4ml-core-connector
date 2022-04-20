package com.modusbox.client.model;

import com.modusbox.client.model.ExtensionListComplex;
import com.modusbox.client.model.GeoCode;
import com.modusbox.client.model.MojaloopMoney;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Mojaloop API response to a quote request
 **/

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public class Quote   {
  
  private @Valid MojaloopMoney transferAmount;
  private @Valid MojaloopMoney payeeReceiveAmount;
  private @Valid MojaloopMoney payeeFspFee;
  private @Valid MojaloopMoney payeeFspCommission;
  private @Valid String expiration;
  private @Valid GeoCode geoCode;
  private @Valid String ilpPacket;
  private @Valid String condition;
  private @Valid ExtensionListComplex extensionList;

  /**
   **/
  public Quote transferAmount(MojaloopMoney transferAmount) {
    this.transferAmount = transferAmount;
    return this;
  }

  

  
  @JsonProperty("transferAmount")
  @NotNull
  public MojaloopMoney getTransferAmount() {
    return transferAmount;
  }

  public void setTransferAmount(MojaloopMoney transferAmount) {
    this.transferAmount = transferAmount;
  }

/**
   **/
  public Quote payeeReceiveAmount(MojaloopMoney payeeReceiveAmount) {
    this.payeeReceiveAmount = payeeReceiveAmount;
    return this;
  }

  

  
  @JsonProperty("payeeReceiveAmount")
  public MojaloopMoney getPayeeReceiveAmount() {
    return payeeReceiveAmount;
  }

  public void setPayeeReceiveAmount(MojaloopMoney payeeReceiveAmount) {
    this.payeeReceiveAmount = payeeReceiveAmount;
  }

/**
   **/
  public Quote payeeFspFee(MojaloopMoney payeeFspFee) {
    this.payeeFspFee = payeeFspFee;
    return this;
  }

  

  
  @JsonProperty("payeeFspFee")
  public MojaloopMoney getPayeeFspFee() {
    return payeeFspFee;
  }

  public void setPayeeFspFee(MojaloopMoney payeeFspFee) {
    this.payeeFspFee = payeeFspFee;
  }

/**
   **/
  public Quote payeeFspCommission(MojaloopMoney payeeFspCommission) {
    this.payeeFspCommission = payeeFspCommission;
    return this;
  }

  

  
  @JsonProperty("payeeFspCommission")
  public MojaloopMoney getPayeeFspCommission() {
    return payeeFspCommission;
  }

  public void setPayeeFspCommission(MojaloopMoney payeeFspCommission) {
    this.payeeFspCommission = payeeFspCommission;
  }

/**
   * An ISO-8601 formatted timestamp.
   **/
  public Quote expiration(String expiration) {
    this.expiration = expiration;
    return this;
  }

  

  
  @JsonProperty("expiration")
  @NotNull
 @Pattern(regexp="^(?:[1-9]\\d{3}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1\\d|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|(?:[1-9]\\d(?:0[48]|[2468][048]|[13579][26])|(?:[2468][048]|[13579][26])00)-02-29)T(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d(?:(\\.\\d{3}))(?:Z|[+-][01]\\d:[0-5]\\d)$")  public String getExpiration() {
    return expiration;
  }

  public void setExpiration(String expiration) {
    this.expiration = expiration;
  }

/**
   **/
  public Quote geoCode(GeoCode geoCode) {
    this.geoCode = geoCode;
    return this;
  }

  

  
  @JsonProperty("geoCode")
  public GeoCode getGeoCode() {
    return geoCode;
  }

  public void setGeoCode(GeoCode geoCode) {
    this.geoCode = geoCode;
  }

/**
   * Information for recipient (transport layer information).
   **/
  public Quote ilpPacket(String ilpPacket) {
    this.ilpPacket = ilpPacket;
    return this;
  }

  

  
  @JsonProperty("ilpPacket")
  @NotNull
 @Pattern(regexp="^[A-Za-z0-9-_]+[=]{0,2}$") @Size(min=1,max=32768)  public String getIlpPacket() {
    return ilpPacket;
  }

  public void setIlpPacket(String ilpPacket) {
    this.ilpPacket = ilpPacket;
  }

/**
   * Condition that must be attached to the transfer by the Payer.
   **/
  public Quote condition(String condition) {
    this.condition = condition;
    return this;
  }

  

  
  @JsonProperty("condition")
  @NotNull
 @Pattern(regexp="^[A-Za-z0-9-_]{43}$") @Size(max=48)  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

/**
   **/
  public Quote extensionList(ExtensionListComplex extensionList) {
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
    Quote quote = (Quote) o;
    return Objects.equals(this.transferAmount, quote.transferAmount) &&
        Objects.equals(this.payeeReceiveAmount, quote.payeeReceiveAmount) &&
        Objects.equals(this.payeeFspFee, quote.payeeFspFee) &&
        Objects.equals(this.payeeFspCommission, quote.payeeFspCommission) &&
        Objects.equals(this.expiration, quote.expiration) &&
        Objects.equals(this.geoCode, quote.geoCode) &&
        Objects.equals(this.ilpPacket, quote.ilpPacket) &&
        Objects.equals(this.condition, quote.condition) &&
        Objects.equals(this.extensionList, quote.extensionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transferAmount, payeeReceiveAmount, payeeFspFee, payeeFspCommission, expiration, geoCode, ilpPacket, condition, extensionList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Quote {\n");
    
    sb.append("    transferAmount: ").append(toIndentedString(transferAmount)).append("\n");
    sb.append("    payeeReceiveAmount: ").append(toIndentedString(payeeReceiveAmount)).append("\n");
    sb.append("    payeeFspFee: ").append(toIndentedString(payeeFspFee)).append("\n");
    sb.append("    payeeFspCommission: ").append(toIndentedString(payeeFspCommission)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    geoCode: ").append(toIndentedString(geoCode)).append("\n");
    sb.append("    ilpPacket: ").append(toIndentedString(ilpPacket)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
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

