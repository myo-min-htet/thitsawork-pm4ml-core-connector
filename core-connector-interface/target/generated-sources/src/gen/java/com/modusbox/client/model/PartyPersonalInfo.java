package com.modusbox.client.model;

import com.modusbox.client.model.PartyComplexName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Data model for the complex type PartyPersonalInfo.
 **/

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public class PartyPersonalInfo   {
  
  private @Valid PartyComplexName complexName;
  private @Valid String dateOfBirth;

  /**
   **/
  public PartyPersonalInfo complexName(PartyComplexName complexName) {
    this.complexName = complexName;
    return this;
  }

  

  
  @JsonProperty("complexName")
  public PartyComplexName getComplexName() {
    return complexName;
  }

  public void setComplexName(PartyComplexName complexName) {
    this.complexName = complexName;
  }

/**
   * Date in the form YYYY-MM-DD.
   **/
  public PartyPersonalInfo dateOfBirth(String dateOfBirth) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyPersonalInfo partyPersonalInfo = (PartyPersonalInfo) o;
    return Objects.equals(this.complexName, partyPersonalInfo.complexName) &&
        Objects.equals(this.dateOfBirth, partyPersonalInfo.dateOfBirth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complexName, dateOfBirth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyPersonalInfo {\n");
    
    sb.append("    complexName: ").append(toIndentedString(complexName)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
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

