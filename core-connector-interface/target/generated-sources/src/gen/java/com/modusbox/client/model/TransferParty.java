package com.modusbox.client.model;

import com.modusbox.client.model.ExtensionItem;
import com.modusbox.client.model.IdType;
import com.modusbox.client.model.PayerType;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public class TransferParty   {
  
  private @Valid PayerType type;
  private @Valid IdType idType;
  private @Valid String idValue;
  private @Valid String idSubValue;
  private @Valid String displayName;
  private @Valid String firstName;
  private @Valid String middleName;
  private @Valid String lastName;
  private @Valid String dateOfBirth;
  private @Valid String merchantClassificationCode;
  private @Valid String fspId;
  private @Valid List<ExtensionItem> extensionList = new ArrayList<ExtensionItem>();

  /**
   **/
  public TransferParty type(PayerType type) {
    this.type = type;
    return this;
  }

  

  
  @JsonProperty("type")
  public PayerType getType() {
    return type;
  }

  public void setType(PayerType type) {
    this.type = type;
  }

/**
   **/
  public TransferParty idType(IdType idType) {
    this.idType = idType;
    return this;
  }

  

  
  @JsonProperty("idType")
  @NotNull
  public IdType getIdType() {
    return idType;
  }

  public void setIdType(IdType idType) {
    this.idType = idType;
  }

/**
   * Identifier of the party.
   **/
  public TransferParty idValue(String idValue) {
    this.idValue = idValue;
    return this;
  }

  

  
  @JsonProperty("idValue")
  @NotNull
 @Pattern(regexp="^[A-Za-z0-9]{4,125}$") @Size(min=4,max=125)  public String getIdValue() {
    return idValue;
  }

  public void setIdValue(String idValue) {
    this.idValue = idValue;
  }

/**
   * Either a sub-identifier of an &#x60;{idValue}&#x60;, or a sub-type of the &#x60;{idType}&#x60;, normally a &#x60;{personalIdType}&#x60;, for example a phone number associated with an account
   **/
  public TransferParty idSubValue(String idSubValue) {
    this.idSubValue = idSubValue;
    return this;
  }

  

  
  @JsonProperty("idSubValue")
 @Size(min=1,max=128)  public String getIdSubValue() {
    return idSubValue;
  }

  public void setIdSubValue(String idSubValue) {
    this.idSubValue = idSubValue;
  }

/**
   **/
  public TransferParty displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  

  
  @JsonProperty("displayName")
 @Size(min=1,max=128)  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

/**
   **/
  public TransferParty firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  

  
  @JsonProperty("firstName")
 @Size(min=1,max=128)  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

/**
   **/
  public TransferParty middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  

  
  @JsonProperty("middleName")
 @Size(min=1,max=128)  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

/**
   **/
  public TransferParty lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  

  
  @JsonProperty("lastName")
 @Size(min=1,max=128)  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

/**
   * Date in the form YYYY-MM-DD.
   **/
  public TransferParty dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  

  
  @JsonProperty("dateOfBirth")
 @Pattern(regexp="^(?:[1-9]\\d{3}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1\\d|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|(?:[1-9]\\d(?:0[48]|[2468][048]|[13579][26])|(?:[2468][048]|[13579][26])00)-02-29)$")  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

/**
   * Up to 4 digits specifying the sender&#39;s merchant classification, if known and applicable.
   **/
  public TransferParty merchantClassificationCode(String merchantClassificationCode) {
    this.merchantClassificationCode = merchantClassificationCode;
    return this;
  }

  

  
  @JsonProperty("merchantClassificationCode")
 @Pattern(regexp="^[\\d]{1,4}$")  public String getMerchantClassificationCode() {
    return merchantClassificationCode;
  }

  public void setMerchantClassificationCode(String merchantClassificationCode) {
    this.merchantClassificationCode = merchantClassificationCode;
  }

/**
   * FSP with which the party is associated.
   **/
  public TransferParty fspId(String fspId) {
    this.fspId = fspId;
    return this;
  }

  

  
  @JsonProperty("fspId")
 @Size(min=1,max=32)  public String getFspId() {
    return fspId;
  }

  public void setFspId(String fspId) {
    this.fspId = fspId;
  }

/**
   **/
  public TransferParty extensionList(List<ExtensionItem> extensionList) {
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
    TransferParty transferParty = (TransferParty) o;
    return Objects.equals(this.type, transferParty.type) &&
        Objects.equals(this.idType, transferParty.idType) &&
        Objects.equals(this.idValue, transferParty.idValue) &&
        Objects.equals(this.idSubValue, transferParty.idSubValue) &&
        Objects.equals(this.displayName, transferParty.displayName) &&
        Objects.equals(this.firstName, transferParty.firstName) &&
        Objects.equals(this.middleName, transferParty.middleName) &&
        Objects.equals(this.lastName, transferParty.lastName) &&
        Objects.equals(this.dateOfBirth, transferParty.dateOfBirth) &&
        Objects.equals(this.merchantClassificationCode, transferParty.merchantClassificationCode) &&
        Objects.equals(this.fspId, transferParty.fspId) &&
        Objects.equals(this.extensionList, transferParty.extensionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, idType, idValue, idSubValue, displayName, firstName, middleName, lastName, dateOfBirth, merchantClassificationCode, fspId, extensionList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferParty {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    idValue: ").append(toIndentedString(idValue)).append("\n");
    sb.append("    idSubValue: ").append(toIndentedString(idSubValue)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    merchantClassificationCode: ").append(toIndentedString(merchantClassificationCode)).append("\n");
    sb.append("    fspId: ").append(toIndentedString(fspId)).append("\n");
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

