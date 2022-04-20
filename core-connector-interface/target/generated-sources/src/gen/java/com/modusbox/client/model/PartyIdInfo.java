package com.modusbox.client.model;

import com.modusbox.client.model.ExtensionListComplex;
import com.modusbox.client.model.IdType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Data model for the complex type PartyIdInfo.
 **/

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public class PartyIdInfo   {
  
  private @Valid IdType partyIdType;
  private @Valid String partyIdentifier;
  private @Valid String partySubIdOrType;
  private @Valid String fspId;
  private @Valid ExtensionListComplex extensionList;

  /**
   **/
  public PartyIdInfo partyIdType(IdType partyIdType) {
    this.partyIdType = partyIdType;
    return this;
  }

  

  
  @JsonProperty("partyIdType")
  @NotNull
  public IdType getPartyIdType() {
    return partyIdType;
  }

  public void setPartyIdType(IdType partyIdType) {
    this.partyIdType = partyIdType;
  }

/**
   * An identifier for the Party.
   **/
  public PartyIdInfo partyIdentifier(String partyIdentifier) {
    this.partyIdentifier = partyIdentifier;
    return this;
  }

  

  
  @JsonProperty("partyIdentifier")
  @NotNull
 @Size(min=1,max=128)  public String getPartyIdentifier() {
    return partyIdentifier;
  }

  public void setPartyIdentifier(String partyIdentifier) {
    this.partyIdentifier = partyIdentifier;
  }

/**
   * A sub-identifier or sub-type for the Party.
   **/
  public PartyIdInfo partySubIdOrType(String partySubIdOrType) {
    this.partySubIdOrType = partySubIdOrType;
    return this;
  }

  

  
  @JsonProperty("partySubIdOrType")
 @Size(min=1,max=128)  public String getPartySubIdOrType() {
    return partySubIdOrType;
  }

  public void setPartySubIdOrType(String partySubIdOrType) {
    this.partySubIdOrType = partySubIdOrType;
  }

/**
   * FSP with which the party is associated.
   **/
  public PartyIdInfo fspId(String fspId) {
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
  public PartyIdInfo extensionList(ExtensionListComplex extensionList) {
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
    PartyIdInfo partyIdInfo = (PartyIdInfo) o;
    return Objects.equals(this.partyIdType, partyIdInfo.partyIdType) &&
        Objects.equals(this.partyIdentifier, partyIdInfo.partyIdentifier) &&
        Objects.equals(this.partySubIdOrType, partyIdInfo.partySubIdOrType) &&
        Objects.equals(this.fspId, partyIdInfo.fspId) &&
        Objects.equals(this.extensionList, partyIdInfo.extensionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyIdType, partyIdentifier, partySubIdOrType, fspId, extensionList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyIdInfo {\n");
    
    sb.append("    partyIdType: ").append(toIndentedString(partyIdType)).append("\n");
    sb.append("    partyIdentifier: ").append(toIndentedString(partyIdentifier)).append("\n");
    sb.append("    partySubIdOrType: ").append(toIndentedString(partySubIdOrType)).append("\n");
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

