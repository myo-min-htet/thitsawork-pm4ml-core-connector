package com.modusbox.client.model;

import com.modusbox.client.model.PartyIdInfo;
import com.modusbox.client.model.PartyPersonalInfo;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Data model for the complex type Party.
 **/

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public class Party   {
  
  private @Valid PartyIdInfo partyIdInfo;
  private @Valid String merchantClassificationCode;
  private @Valid String name;
  private @Valid PartyPersonalInfo personalInfo;

  /**
   **/
  public Party partyIdInfo(PartyIdInfo partyIdInfo) {
    this.partyIdInfo = partyIdInfo;
    return this;
  }

  

  
  @JsonProperty("partyIdInfo")
  @NotNull
  public PartyIdInfo getPartyIdInfo() {
    return partyIdInfo;
  }

  public void setPartyIdInfo(PartyIdInfo partyIdInfo) {
    this.partyIdInfo = partyIdInfo;
  }

/**
   * Up to 4 digits specifying the sender&#39;s merchant classification, if known and applicable.
   **/
  public Party merchantClassificationCode(String merchantClassificationCode) {
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
   **/
  public Party name(String name) {
    this.name = name;
    return this;
  }

  

  
  @JsonProperty("name")
 @Size(min=1,max=128)  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

/**
   **/
  public Party personalInfo(PartyPersonalInfo personalInfo) {
    this.personalInfo = personalInfo;
    return this;
  }

  

  
  @JsonProperty("personalInfo")
  public PartyPersonalInfo getPersonalInfo() {
    return personalInfo;
  }

  public void setPersonalInfo(PartyPersonalInfo personalInfo) {
    this.personalInfo = personalInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Party party = (Party) o;
    return Objects.equals(this.partyIdInfo, party.partyIdInfo) &&
        Objects.equals(this.merchantClassificationCode, party.merchantClassificationCode) &&
        Objects.equals(this.name, party.name) &&
        Objects.equals(this.personalInfo, party.personalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyIdInfo, merchantClassificationCode, name, personalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Party {\n");
    
    sb.append("    partyIdInfo: ").append(toIndentedString(partyIdInfo)).append("\n");
    sb.append("    merchantClassificationCode: ").append(toIndentedString(merchantClassificationCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    personalInfo: ").append(toIndentedString(personalInfo)).append("\n");
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

