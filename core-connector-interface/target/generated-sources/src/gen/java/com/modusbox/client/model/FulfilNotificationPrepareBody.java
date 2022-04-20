package com.modusbox.client.model;

import com.modusbox.client.model.ExtensionListComplex;
import com.modusbox.client.model.MojaloopMoney;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public class FulfilNotificationPrepareBody   {
  
  private @Valid String transferId;
  private @Valid String payeeFsp;
  private @Valid String payerFsp;
  private @Valid MojaloopMoney amount;
  private @Valid String ilpPacket;
  private @Valid String condition;
  private @Valid String expiration;
  private @Valid ExtensionListComplex extensionList;

  /**
   * A Mojaloop API transfer identifier (UUID).
   **/
  public FulfilNotificationPrepareBody transferId(String transferId) {
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
   * FSP with which the party is associated.
   **/
  public FulfilNotificationPrepareBody payeeFsp(String payeeFsp) {
    this.payeeFsp = payeeFsp;
    return this;
  }

  

  
  @JsonProperty("payeeFsp")
 @Size(min=1,max=32)  public String getPayeeFsp() {
    return payeeFsp;
  }

  public void setPayeeFsp(String payeeFsp) {
    this.payeeFsp = payeeFsp;
  }

/**
   * FSP with which the party is associated.
   **/
  public FulfilNotificationPrepareBody payerFsp(String payerFsp) {
    this.payerFsp = payerFsp;
    return this;
  }

  

  
  @JsonProperty("payerFsp")
 @Size(min=1,max=32)  public String getPayerFsp() {
    return payerFsp;
  }

  public void setPayerFsp(String payerFsp) {
    this.payerFsp = payerFsp;
  }

/**
   **/
  public FulfilNotificationPrepareBody amount(MojaloopMoney amount) {
    this.amount = amount;
    return this;
  }

  

  
  @JsonProperty("amount")
  @NotNull
  public MojaloopMoney getAmount() {
    return amount;
  }

  public void setAmount(MojaloopMoney amount) {
    this.amount = amount;
  }

/**
   * Information for recipient (transport layer information).
   **/
  public FulfilNotificationPrepareBody ilpPacket(String ilpPacket) {
    this.ilpPacket = ilpPacket;
    return this;
  }

  

  
  @JsonProperty("ilpPacket")
 @Pattern(regexp="^[A-Za-z0-9-_]+[=]{0,2}$") @Size(min=1,max=32768)  public String getIlpPacket() {
    return ilpPacket;
  }

  public void setIlpPacket(String ilpPacket) {
    this.ilpPacket = ilpPacket;
  }

/**
   * Condition that must be attached to the transfer by the Payer.
   **/
  public FulfilNotificationPrepareBody condition(String condition) {
    this.condition = condition;
    return this;
  }

  

  
  @JsonProperty("condition")
 @Pattern(regexp="^[A-Za-z0-9-_]{43}$") @Size(max=48)  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

/**
   * An ISO-8601 formatted timestamp.
   **/
  public FulfilNotificationPrepareBody expiration(String expiration) {
    this.expiration = expiration;
    return this;
  }

  

  
  @JsonProperty("expiration")
 @Pattern(regexp="^(?:[1-9]\\d{3}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1\\d|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|(?:[1-9]\\d(?:0[48]|[2468][048]|[13579][26])|(?:[2468][048]|[13579][26])00)-02-29)T(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d(?:(\\.\\d{3}))(?:Z|[+-][01]\\d:[0-5]\\d)$")  public String getExpiration() {
    return expiration;
  }

  public void setExpiration(String expiration) {
    this.expiration = expiration;
  }

/**
   **/
  public FulfilNotificationPrepareBody extensionList(ExtensionListComplex extensionList) {
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
    FulfilNotificationPrepareBody fulfilNotificationPrepareBody = (FulfilNotificationPrepareBody) o;
    return Objects.equals(this.transferId, fulfilNotificationPrepareBody.transferId) &&
        Objects.equals(this.payeeFsp, fulfilNotificationPrepareBody.payeeFsp) &&
        Objects.equals(this.payerFsp, fulfilNotificationPrepareBody.payerFsp) &&
        Objects.equals(this.amount, fulfilNotificationPrepareBody.amount) &&
        Objects.equals(this.ilpPacket, fulfilNotificationPrepareBody.ilpPacket) &&
        Objects.equals(this.condition, fulfilNotificationPrepareBody.condition) &&
        Objects.equals(this.expiration, fulfilNotificationPrepareBody.expiration) &&
        Objects.equals(this.extensionList, fulfilNotificationPrepareBody.extensionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transferId, payeeFsp, payerFsp, amount, ilpPacket, condition, expiration, extensionList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfilNotificationPrepareBody {\n");
    
    sb.append("    transferId: ").append(toIndentedString(transferId)).append("\n");
    sb.append("    payeeFsp: ").append(toIndentedString(payeeFsp)).append("\n");
    sb.append("    payerFsp: ").append(toIndentedString(payerFsp)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    ilpPacket: ").append(toIndentedString(ilpPacket)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
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

