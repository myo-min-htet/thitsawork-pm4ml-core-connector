package com.modusbox.client.model;

import com.modusbox.client.model.Initiator;
import com.modusbox.client.model.InitiatorType;
import com.modusbox.client.model.Scenario;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Object containing transfer object.
 **/

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public class TransactionTypeObject   {
  
  private @Valid Scenario scenario;
  private @Valid Initiator initiator;
  private @Valid InitiatorType initiatorType;

  /**
   **/
  public TransactionTypeObject scenario(Scenario scenario) {
    this.scenario = scenario;
    return this;
  }

  

  
  @JsonProperty("scenario")
  @NotNull
  public Scenario getScenario() {
    return scenario;
  }

  public void setScenario(Scenario scenario) {
    this.scenario = scenario;
  }

/**
   **/
  public TransactionTypeObject initiator(Initiator initiator) {
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
  public TransactionTypeObject initiatorType(InitiatorType initiatorType) {
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
    TransactionTypeObject transactionTypeObject = (TransactionTypeObject) o;
    return Objects.equals(this.scenario, transactionTypeObject.scenario) &&
        Objects.equals(this.initiator, transactionTypeObject.initiator) &&
        Objects.equals(this.initiatorType, transactionTypeObject.initiatorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scenario, initiator, initiatorType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionTypeObject {\n");
    
    sb.append("    scenario: ").append(toIndentedString(scenario)).append("\n");
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

