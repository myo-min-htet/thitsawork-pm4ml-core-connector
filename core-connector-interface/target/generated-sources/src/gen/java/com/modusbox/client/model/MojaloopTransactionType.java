package com.modusbox.client.model;

import com.modusbox.client.model.Initiator;
import com.modusbox.client.model.InitiatorType;
import com.modusbox.client.model.TransactionScenario;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Data model for the complex type mojaloopTransactionType.
 **/

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public class MojaloopTransactionType   {
  
  private @Valid TransactionScenario scenario;
  private @Valid String subScenario;
  private @Valid Initiator initiator;
  private @Valid InitiatorType initiatorType;

  /**
   **/
  public MojaloopTransactionType scenario(TransactionScenario scenario) {
    this.scenario = scenario;
    return this;
  }

  

  
  @JsonProperty("scenario")
  @NotNull
  public TransactionScenario getScenario() {
    return scenario;
  }

  public void setScenario(TransactionScenario scenario) {
    this.scenario = scenario;
  }

/**
   * Possible sub-scenario, defined locally within the scheme (UndefinedEnum Type).
   **/
  public MojaloopTransactionType subScenario(String subScenario) {
    this.subScenario = subScenario;
    return this;
  }

  

  
  @JsonProperty("subScenario")
 @Pattern(regexp="^[A-Z_]{1,32}$")  public String getSubScenario() {
    return subScenario;
  }

  public void setSubScenario(String subScenario) {
    this.subScenario = subScenario;
  }

/**
   **/
  public MojaloopTransactionType initiator(Initiator initiator) {
    this.initiator = initiator;
    return this;
  }

  

  
  @JsonProperty("initiator")
  @NotNull
  public Initiator getInitiator() {
    return initiator;
  }

  public void setInitiator(Initiator initiator) {
    this.initiator = initiator;
  }

/**
   **/
  public MojaloopTransactionType initiatorType(InitiatorType initiatorType) {
    this.initiatorType = initiatorType;
    return this;
  }

  

  
  @JsonProperty("initiatorType")
  @NotNull
  public InitiatorType getInitiatorType() {
    return initiatorType;
  }

  public void setInitiatorType(InitiatorType initiatorType) {
    this.initiatorType = initiatorType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MojaloopTransactionType mojaloopTransactionType = (MojaloopTransactionType) o;
    return Objects.equals(this.scenario, mojaloopTransactionType.scenario) &&
        Objects.equals(this.subScenario, mojaloopTransactionType.subScenario) &&
        Objects.equals(this.initiator, mojaloopTransactionType.initiator) &&
        Objects.equals(this.initiatorType, mojaloopTransactionType.initiatorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scenario, subScenario, initiator, initiatorType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MojaloopTransactionType {\n");
    
    sb.append("    scenario: ").append(toIndentedString(scenario)).append("\n");
    sb.append("    subScenario: ").append(toIndentedString(subScenario)).append("\n");
    sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
    sb.append("    initiatorType: ").append(toIndentedString(initiatorType)).append("\n");
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

