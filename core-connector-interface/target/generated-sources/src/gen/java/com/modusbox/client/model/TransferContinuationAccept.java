package com.modusbox.client.model;

import com.modusbox.client.model.TransferParty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public class TransferContinuationAccept   {
  

public enum AcceptQuoteEnum {

    TRUE(Boolean.valueOf("true")), FALSE(Boolean.valueOf("false"));


    private Boolean value;

    AcceptQuoteEnum (Boolean v) {
        value = v;
    }

    public Boolean value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static AcceptQuoteEnum fromValue(Boolean value) {
        for (AcceptQuoteEnum b : AcceptQuoteEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid AcceptQuoteEnum acceptQuote;

public enum AcceptPartyEnum {

    TRUE(Boolean.valueOf("true")), FALSE(Boolean.valueOf("false"));


    private Boolean value;

    AcceptPartyEnum (Boolean v) {
        value = v;
    }

    public Boolean value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static AcceptPartyEnum fromValue(Boolean value) {
        for (AcceptPartyEnum b : AcceptPartyEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid AcceptPartyEnum acceptParty;
  private @Valid String amount;
  private @Valid TransferParty to;

  /**
   **/
  public TransferContinuationAccept acceptQuote(AcceptQuoteEnum acceptQuote) {
    this.acceptQuote = acceptQuote;
    return this;
  }

  

  
  @JsonProperty("acceptQuote")
  public AcceptQuoteEnum getAcceptQuote() {
    return acceptQuote;
  }

  public void setAcceptQuote(AcceptQuoteEnum acceptQuote) {
    this.acceptQuote = acceptQuote;
  }

/**
   **/
  public TransferContinuationAccept acceptParty(AcceptPartyEnum acceptParty) {
    this.acceptParty = acceptParty;
    return this;
  }

  

  
  @JsonProperty("acceptParty")
  public AcceptPartyEnum getAcceptParty() {
    return acceptParty;
  }

  public void setAcceptParty(AcceptPartyEnum acceptParty) {
    this.acceptParty = acceptParty;
  }

/**
   **/
  public TransferContinuationAccept amount(String amount) {
    this.amount = amount;
    return this;
  }

  

  
  @JsonProperty("amount")
 @Pattern(regexp="^([0]|([1-9][0-9]{0,17}))([.][0-9]{0,3}[1-9])?$")  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

/**
   **/
  public TransferContinuationAccept to(TransferParty to) {
    this.to = to;
    return this;
  }

  

  
  @JsonProperty("to")
  public TransferParty getTo() {
    return to;
  }

  public void setTo(TransferParty to) {
    this.to = to;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferContinuationAccept transferContinuationAccept = (TransferContinuationAccept) o;
    return Objects.equals(this.acceptQuote, transferContinuationAccept.acceptQuote) &&
        Objects.equals(this.acceptParty, transferContinuationAccept.acceptParty) &&
        Objects.equals(this.amount, transferContinuationAccept.amount) &&
        Objects.equals(this.to, transferContinuationAccept.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptQuote, acceptParty, amount, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferContinuationAccept {\n");
    
    sb.append("    acceptQuote: ").append(toIndentedString(acceptQuote)).append("\n");
    sb.append("    acceptParty: ").append(toIndentedString(acceptParty)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

