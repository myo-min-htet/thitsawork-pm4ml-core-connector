package com.modusbox.client.model;

import com.modusbox.client.model.AmountType;
import com.modusbox.client.model.Currency;
import com.modusbox.client.model.ExtensionItem;
import com.modusbox.client.model.TransactionType;
import com.modusbox.client.model.TransferError;
import com.modusbox.client.model.TransferParty;
import com.modusbox.client.model.TransferResponseFulfil;
import com.modusbox.client.model.TransferResponseGetPartiesRequest;
import com.modusbox.client.model.TransferResponseGetPartiesResponse;
import com.modusbox.client.model.TransferResponseQuoteRequest;
import com.modusbox.client.model.TransferResponseQuoteResponse;
import com.modusbox.client.model.TransferStatus;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public class TransferResponse   {
  
  private @Valid String transferId;
  private @Valid String homeTransactionId;
  private @Valid TransferParty from;
  private @Valid TransferParty to;
  private @Valid AmountType amountType;
  private @Valid Currency currency;
  private @Valid String amount;
  private @Valid TransactionType transactionType;
  private @Valid String note;
  private @Valid TransferStatus currentState;
  private @Valid List<ExtensionItem> quoteRequestExtensions = new ArrayList<ExtensionItem>();
  private @Valid List<ExtensionItem> transferRequestExtensions = new ArrayList<ExtensionItem>();
  private @Valid String initiatedTimestamp;

public enum DirectionEnum {

    OUTBOUND(String.valueOf("OUTBOUND"));


    private String value;

    DirectionEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static DirectionEnum fromValue(String value) {
        for (DirectionEnum b : DirectionEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid DirectionEnum direction;
  private @Valid TransferResponseGetPartiesRequest getPartiesRequest;
  private @Valid TransferResponseGetPartiesResponse getPartiesResponse;

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
  private @Valid String quoteId;
  private @Valid TransferResponseQuoteRequest quoteRequest;
  private @Valid TransferResponseQuoteResponse quoteResponse;
  private @Valid String quoteResponseSource;

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
  private @Valid TransferResponseQuoteRequest prepare;
  private @Valid TransferResponseFulfil fulfil;
  private @Valid TransferError lastError;

  /**
   * A Mojaloop API identifier (UUID).
   **/
  public TransferResponse transferId(String transferId) {
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
   * Transaction ID from the DFSP backend, used to reconcile transactions between the Switch and DFSP backend systems.
   **/
  public TransferResponse homeTransactionId(String homeTransactionId) {
    this.homeTransactionId = homeTransactionId;
    return this;
  }

  

  
  @JsonProperty("homeTransactionId")
 @Size(max=255)  public String getHomeTransactionId() {
    return homeTransactionId;
  }

  public void setHomeTransactionId(String homeTransactionId) {
    this.homeTransactionId = homeTransactionId;
  }

/**
   **/
  public TransferResponse from(TransferParty from) {
    this.from = from;
    return this;
  }

  

  
  @JsonProperty("from")
  @NotNull
  public TransferParty getFrom() {
    return from;
  }

  public void setFrom(TransferParty from) {
    this.from = from;
  }

/**
   **/
  public TransferResponse to(TransferParty to) {
    this.to = to;
    return this;
  }

  

  
  @JsonProperty("to")
  @NotNull
  public TransferParty getTo() {
    return to;
  }

  public void setTo(TransferParty to) {
    this.to = to;
  }

/**
   **/
  public TransferResponse amountType(AmountType amountType) {
    this.amountType = amountType;
    return this;
  }

  

  
  @JsonProperty("amountType")
  @NotNull
  public AmountType getAmountType() {
    return amountType;
  }

  public void setAmountType(AmountType amountType) {
    this.amountType = amountType;
  }

/**
   **/
  public TransferResponse currency(Currency currency) {
    this.currency = currency;
    return this;
  }

  

  
  @JsonProperty("currency")
  @NotNull
  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

/**
   **/
  public TransferResponse amount(String amount) {
    this.amount = amount;
    return this;
  }

  

  
  @JsonProperty("amount")
  @NotNull
 @Pattern(regexp="^([0]|([1-9][0-9]{0,17}))([.][0-9]{0,3}[1-9])?$")  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

/**
   **/
  public TransferResponse transactionType(TransactionType transactionType) {
    this.transactionType = transactionType;
    return this;
  }

  

  
  @JsonProperty("transactionType")
  @NotNull
  public TransactionType getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(TransactionType transactionType) {
    this.transactionType = transactionType;
  }

/**
   **/
  public TransferResponse note(String note) {
    this.note = note;
    return this;
  }

  

  
  @JsonProperty("note")
 @Size(max=128)  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

/**
   **/
  public TransferResponse currentState(TransferStatus currentState) {
    this.currentState = currentState;
    return this;
  }

  

  
  @JsonProperty("currentState")
  public TransferStatus getCurrentState() {
    return currentState;
  }

  public void setCurrentState(TransferStatus currentState) {
    this.currentState = currentState;
  }

/**
   **/
  public TransferResponse quoteRequestExtensions(List<ExtensionItem> quoteRequestExtensions) {
    this.quoteRequestExtensions = quoteRequestExtensions;
    return this;
  }

  

  
  @JsonProperty("quoteRequestExtensions")
 @Size(min=0,max=16)  public List<ExtensionItem> getQuoteRequestExtensions() {
    return quoteRequestExtensions;
  }

  public void setQuoteRequestExtensions(List<ExtensionItem> quoteRequestExtensions) {
    this.quoteRequestExtensions = quoteRequestExtensions;
  }

/**
   **/
  public TransferResponse transferRequestExtensions(List<ExtensionItem> transferRequestExtensions) {
    this.transferRequestExtensions = transferRequestExtensions;
    return this;
  }

  

  
  @JsonProperty("transferRequestExtensions")
 @Size(min=0,max=16)  public List<ExtensionItem> getTransferRequestExtensions() {
    return transferRequestExtensions;
  }

  public void setTransferRequestExtensions(List<ExtensionItem> transferRequestExtensions) {
    this.transferRequestExtensions = transferRequestExtensions;
  }

/**
   * An ISO-8601 formatted timestamp.
   **/
  public TransferResponse initiatedTimestamp(String initiatedTimestamp) {
    this.initiatedTimestamp = initiatedTimestamp;
    return this;
  }

  

  
  @JsonProperty("initiatedTimestamp")
 @Pattern(regexp="^(?:[1-9]\\d{3}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1\\d|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|(?:[1-9]\\d(?:0[48]|[2468][048]|[13579][26])|(?:[2468][048]|[13579][26])00)-02-29)T(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d(?:(\\.\\d{3}))(?:Z|[+-][01]\\d:[0-5]\\d)$")  public String getInitiatedTimestamp() {
    return initiatedTimestamp;
  }

  public void setInitiatedTimestamp(String initiatedTimestamp) {
    this.initiatedTimestamp = initiatedTimestamp;
  }

/**
   **/
  public TransferResponse direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

  

  
  @JsonProperty("direction")
  public DirectionEnum getDirection() {
    return direction;
  }

  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

/**
   **/
  public TransferResponse getPartiesRequest(TransferResponseGetPartiesRequest getPartiesRequest) {
    this.getPartiesRequest = getPartiesRequest;
    return this;
  }

  

  
  @JsonProperty("getPartiesRequest")
  public TransferResponseGetPartiesRequest getGetPartiesRequest() {
    return getPartiesRequest;
  }

  public void setGetPartiesRequest(TransferResponseGetPartiesRequest getPartiesRequest) {
    this.getPartiesRequest = getPartiesRequest;
  }

/**
   **/
  public TransferResponse getPartiesResponse(TransferResponseGetPartiesResponse getPartiesResponse) {
    this.getPartiesResponse = getPartiesResponse;
    return this;
  }

  

  
  @JsonProperty("getPartiesResponse")
  public TransferResponseGetPartiesResponse getGetPartiesResponse() {
    return getPartiesResponse;
  }

  public void setGetPartiesResponse(TransferResponseGetPartiesResponse getPartiesResponse) {
    this.getPartiesResponse = getPartiesResponse;
  }

/**
   **/
  public TransferResponse acceptParty(AcceptPartyEnum acceptParty) {
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
   * A Mojaloop API identifier (UUID).
   **/
  public TransferResponse quoteId(String quoteId) {
    this.quoteId = quoteId;
    return this;
  }

  

  
  @JsonProperty("quoteId")
 @Pattern(regexp="^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$")  public String getQuoteId() {
    return quoteId;
  }

  public void setQuoteId(String quoteId) {
    this.quoteId = quoteId;
  }

/**
   **/
  public TransferResponse quoteRequest(TransferResponseQuoteRequest quoteRequest) {
    this.quoteRequest = quoteRequest;
    return this;
  }

  

  
  @JsonProperty("quoteRequest")
  public TransferResponseQuoteRequest getQuoteRequest() {
    return quoteRequest;
  }

  public void setQuoteRequest(TransferResponseQuoteRequest quoteRequest) {
    this.quoteRequest = quoteRequest;
  }

/**
   **/
  public TransferResponse quoteResponse(TransferResponseQuoteResponse quoteResponse) {
    this.quoteResponse = quoteResponse;
    return this;
  }

  

  
  @JsonProperty("quoteResponse")
  public TransferResponseQuoteResponse getQuoteResponse() {
    return quoteResponse;
  }

  public void setQuoteResponse(TransferResponseQuoteResponse quoteResponse) {
    this.quoteResponse = quoteResponse;
  }

/**
   * FSP with which the party is associated.
   **/
  public TransferResponse quoteResponseSource(String quoteResponseSource) {
    this.quoteResponseSource = quoteResponseSource;
    return this;
  }

  

  
  @JsonProperty("quoteResponseSource")
 @Size(min=1,max=32)  public String getQuoteResponseSource() {
    return quoteResponseSource;
  }

  public void setQuoteResponseSource(String quoteResponseSource) {
    this.quoteResponseSource = quoteResponseSource;
  }

/**
   **/
  public TransferResponse acceptQuote(AcceptQuoteEnum acceptQuote) {
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
  public TransferResponse prepare(TransferResponseQuoteRequest prepare) {
    this.prepare = prepare;
    return this;
  }

  

  
  @JsonProperty("prepare")
  public TransferResponseQuoteRequest getPrepare() {
    return prepare;
  }

  public void setPrepare(TransferResponseQuoteRequest prepare) {
    this.prepare = prepare;
  }

/**
   **/
  public TransferResponse fulfil(TransferResponseFulfil fulfil) {
    this.fulfil = fulfil;
    return this;
  }

  

  
  @JsonProperty("fulfil")
  public TransferResponseFulfil getFulfil() {
    return fulfil;
  }

  public void setFulfil(TransferResponseFulfil fulfil) {
    this.fulfil = fulfil;
  }

/**
   **/
  public TransferResponse lastError(TransferError lastError) {
    this.lastError = lastError;
    return this;
  }

  

  
  @JsonProperty("lastError")
  public TransferError getLastError() {
    return lastError;
  }

  public void setLastError(TransferError lastError) {
    this.lastError = lastError;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferResponse transferResponse = (TransferResponse) o;
    return Objects.equals(this.transferId, transferResponse.transferId) &&
        Objects.equals(this.homeTransactionId, transferResponse.homeTransactionId) &&
        Objects.equals(this.from, transferResponse.from) &&
        Objects.equals(this.to, transferResponse.to) &&
        Objects.equals(this.amountType, transferResponse.amountType) &&
        Objects.equals(this.currency, transferResponse.currency) &&
        Objects.equals(this.amount, transferResponse.amount) &&
        Objects.equals(this.transactionType, transferResponse.transactionType) &&
        Objects.equals(this.note, transferResponse.note) &&
        Objects.equals(this.currentState, transferResponse.currentState) &&
        Objects.equals(this.quoteRequestExtensions, transferResponse.quoteRequestExtensions) &&
        Objects.equals(this.transferRequestExtensions, transferResponse.transferRequestExtensions) &&
        Objects.equals(this.initiatedTimestamp, transferResponse.initiatedTimestamp) &&
        Objects.equals(this.direction, transferResponse.direction) &&
        Objects.equals(this.getPartiesRequest, transferResponse.getPartiesRequest) &&
        Objects.equals(this.getPartiesResponse, transferResponse.getPartiesResponse) &&
        Objects.equals(this.acceptParty, transferResponse.acceptParty) &&
        Objects.equals(this.quoteId, transferResponse.quoteId) &&
        Objects.equals(this.quoteRequest, transferResponse.quoteRequest) &&
        Objects.equals(this.quoteResponse, transferResponse.quoteResponse) &&
        Objects.equals(this.quoteResponseSource, transferResponse.quoteResponseSource) &&
        Objects.equals(this.acceptQuote, transferResponse.acceptQuote) &&
        Objects.equals(this.prepare, transferResponse.prepare) &&
        Objects.equals(this.fulfil, transferResponse.fulfil) &&
        Objects.equals(this.lastError, transferResponse.lastError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transferId, homeTransactionId, from, to, amountType, currency, amount, transactionType, note, currentState, quoteRequestExtensions, transferRequestExtensions, initiatedTimestamp, direction, getPartiesRequest, getPartiesResponse, acceptParty, quoteId, quoteRequest, quoteResponse, quoteResponseSource, acceptQuote, prepare, fulfil, lastError);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferResponse {\n");
    
    sb.append("    transferId: ").append(toIndentedString(transferId)).append("\n");
    sb.append("    homeTransactionId: ").append(toIndentedString(homeTransactionId)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    amountType: ").append(toIndentedString(amountType)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    currentState: ").append(toIndentedString(currentState)).append("\n");
    sb.append("    quoteRequestExtensions: ").append(toIndentedString(quoteRequestExtensions)).append("\n");
    sb.append("    transferRequestExtensions: ").append(toIndentedString(transferRequestExtensions)).append("\n");
    sb.append("    initiatedTimestamp: ").append(toIndentedString(initiatedTimestamp)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    getPartiesRequest: ").append(toIndentedString(getPartiesRequest)).append("\n");
    sb.append("    getPartiesResponse: ").append(toIndentedString(getPartiesResponse)).append("\n");
    sb.append("    acceptParty: ").append(toIndentedString(acceptParty)).append("\n");
    sb.append("    quoteId: ").append(toIndentedString(quoteId)).append("\n");
    sb.append("    quoteRequest: ").append(toIndentedString(quoteRequest)).append("\n");
    sb.append("    quoteResponse: ").append(toIndentedString(quoteResponse)).append("\n");
    sb.append("    quoteResponseSource: ").append(toIndentedString(quoteResponseSource)).append("\n");
    sb.append("    acceptQuote: ").append(toIndentedString(acceptQuote)).append("\n");
    sb.append("    prepare: ").append(toIndentedString(prepare)).append("\n");
    sb.append("    fulfil: ").append(toIndentedString(fulfil)).append("\n");
    sb.append("    lastError: ").append(toIndentedString(lastError)).append("\n");
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

