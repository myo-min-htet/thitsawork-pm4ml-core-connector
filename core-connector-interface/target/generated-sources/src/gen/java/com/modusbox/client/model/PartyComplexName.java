package com.modusbox.client.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Data model for the complex type PartyComplexName.
 **/

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public class PartyComplexName   {
  
  private @Valid String firstName;
  private @Valid String middleName;
  private @Valid String lastName;

  /**
   **/
  public PartyComplexName firstName(String firstName) {
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
  public PartyComplexName middleName(String middleName) {
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
  public PartyComplexName lastName(String lastName) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyComplexName partyComplexName = (PartyComplexName) o;
    return Objects.equals(this.firstName, partyComplexName.firstName) &&
        Objects.equals(this.middleName, partyComplexName.middleName) &&
        Objects.equals(this.lastName, partyComplexName.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, middleName, lastName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyComplexName {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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

