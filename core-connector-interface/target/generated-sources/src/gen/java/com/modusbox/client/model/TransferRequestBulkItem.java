package com.modusbox.client.model;

import com.modusbox.client.model.Currency;
import com.modusbox.client.model.IdType;
import com.modusbox.client.model.InitiatorType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public class TransferRequestBulkItem   {
  
  private @Valid String paymentTransactionID;
  private @Valid String orderID;
  private @Valid String processGUID;
  private @Valid String fromFspID;
  private @Valid String fromFspCode;
  private @Valid String orgName;
  private @Valid String toFspID;
  private @Valid String toFspCode;
  private @Valid String hubID;
  private @Valid String accountNo;
  private @Valid String accountTypeEnumID;
  private @Valid IdType accountType;
  private @Valid String payeeName;
  private @Valid String payeeMainIdentifier;
  private @Valid String payeeTypeEnumID;
  private @Valid InitiatorType payeeType;
  private @Valid String mobileNo1;
  private @Valid String mobileNo2;
  private @Valid String amount;
  private @Valid Currency currency;
  private @Valid String referenceID;
  private @Valid String referenceNote;
  private @Valid String fees1;
  private @Valid String fees2;
  private @Valid String fees3;
  private @Valid String requestedDate;
  private @Valid String createdDtm;
  private @Valid String createdByID;

  /**
   * Transaction ID from the DFSP backend, used to reconcile transactions between the Switch and DFSP backend systems.
   **/
  public TransferRequestBulkItem paymentTransactionID(String paymentTransactionID) {
    this.paymentTransactionID = paymentTransactionID;
    return this;
  }

  

  
  @JsonProperty("paymentTransactionID")
  @NotNull
 @Size(max=255)  public String getPaymentTransactionID() {
    return paymentTransactionID;
  }

  public void setPaymentTransactionID(String paymentTransactionID) {
    this.paymentTransactionID = paymentTransactionID;
  }

/**
   * Transaction ID from the DFSP backend, used to reconcile transactions between the Switch and DFSP backend systems.
   **/
  public TransferRequestBulkItem orderID(String orderID) {
    this.orderID = orderID;
    return this;
  }

  

  
  @JsonProperty("orderID")
  @NotNull
 @Size(max=255)  public String getOrderID() {
    return orderID;
  }

  public void setOrderID(String orderID) {
    this.orderID = orderID;
  }

/**
   * A Mojaloop API identifier (UUID).
   **/
  public TransferRequestBulkItem processGUID(String processGUID) {
    this.processGUID = processGUID;
    return this;
  }

  

  
  @JsonProperty("processGUID")
  @NotNull
 @Pattern(regexp="^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$")  public String getProcessGUID() {
    return processGUID;
  }

  public void setProcessGUID(String processGUID) {
    this.processGUID = processGUID;
  }

/**
   * FSP with which the party is associated.
   **/
  public TransferRequestBulkItem fromFspID(String fromFspID) {
    this.fromFspID = fromFspID;
    return this;
  }

  

  
  @JsonProperty("fromFspID")
  @NotNull
 @Size(min=1,max=32)  public String getFromFspID() {
    return fromFspID;
  }

  public void setFromFspID(String fromFspID) {
    this.fromFspID = fromFspID;
  }

/**
   * FSP with which the party is associated.
   **/
  public TransferRequestBulkItem fromFspCode(String fromFspCode) {
    this.fromFspCode = fromFspCode;
    return this;
  }

  

  
  @JsonProperty("fromFspCode")
  @NotNull
 @Size(min=1,max=32)  public String getFromFspCode() {
    return fromFspCode;
  }

  public void setFromFspCode(String fromFspCode) {
    this.fromFspCode = fromFspCode;
  }

/**
   * FSP name which the party is associated.
   **/
  public TransferRequestBulkItem orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

  

  
  @JsonProperty("orgName")
 @Size(min=0,max=255)  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

/**
   * FSP with which the party is associated.
   **/
  public TransferRequestBulkItem toFspID(String toFspID) {
    this.toFspID = toFspID;
    return this;
  }

  

  
  @JsonProperty("toFspID")
  @NotNull
 @Size(min=1,max=32)  public String getToFspID() {
    return toFspID;
  }

  public void setToFspID(String toFspID) {
    this.toFspID = toFspID;
  }

/**
   * FSP with which the party is associated.
   **/
  public TransferRequestBulkItem toFspCode(String toFspCode) {
    this.toFspCode = toFspCode;
    return this;
  }

  

  
  @JsonProperty("toFspCode")
  @NotNull
 @Size(min=1,max=32)  public String getToFspCode() {
    return toFspCode;
  }

  public void setToFspCode(String toFspCode) {
    this.toFspCode = toFspCode;
  }

/**
   * Transaction ID from the DFSP backend, used to reconcile transactions between the Switch and DFSP backend systems.
   **/
  public TransferRequestBulkItem hubID(String hubID) {
    this.hubID = hubID;
    return this;
  }

  

  
  @JsonProperty("hubID")
  @NotNull
 @Size(max=255)  public String getHubID() {
    return hubID;
  }

  public void setHubID(String hubID) {
    this.hubID = hubID;
  }

/**
   * Identifier of the party.
   **/
  public TransferRequestBulkItem accountNo(String accountNo) {
    this.accountNo = accountNo;
    return this;
  }

  

  
  @JsonProperty("accountNo")
  @NotNull
 @Pattern(regexp="^[A-Za-z0-9]{4,125}$") @Size(min=4,max=125)  public String getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }

/**
   * Transaction ID from the DFSP backend, used to reconcile transactions between the Switch and DFSP backend systems.
   **/
  public TransferRequestBulkItem accountTypeEnumID(String accountTypeEnumID) {
    this.accountTypeEnumID = accountTypeEnumID;
    return this;
  }

  

  
  @JsonProperty("accountTypeEnumID")
 @Size(max=255)  public String getAccountTypeEnumID() {
    return accountTypeEnumID;
  }

  public void setAccountTypeEnumID(String accountTypeEnumID) {
    this.accountTypeEnumID = accountTypeEnumID;
  }

/**
   **/
  public TransferRequestBulkItem accountType(IdType accountType) {
    this.accountType = accountType;
    return this;
  }

  

  
  @JsonProperty("accountType")
  public IdType getAccountType() {
    return accountType;
  }

  public void setAccountType(IdType accountType) {
    this.accountType = accountType;
  }

/**
   **/
  public TransferRequestBulkItem payeeName(String payeeName) {
    this.payeeName = payeeName;
    return this;
  }

  

  
  @JsonProperty("payeeName")
 @Size(min=1,max=128)  public String getPayeeName() {
    return payeeName;
  }

  public void setPayeeName(String payeeName) {
    this.payeeName = payeeName;
  }

/**
   * Either a sub-identifier of an &#x60;{idValue}&#x60;, or a sub-type of the &#x60;{idType}&#x60;, normally a &#x60;{personalIdType}&#x60;, for example a phone number associated with an account
   **/
  public TransferRequestBulkItem payeeMainIdentifier(String payeeMainIdentifier) {
    this.payeeMainIdentifier = payeeMainIdentifier;
    return this;
  }

  

  
  @JsonProperty("payeeMainIdentifier")
 @Size(min=1,max=128)  public String getPayeeMainIdentifier() {
    return payeeMainIdentifier;
  }

  public void setPayeeMainIdentifier(String payeeMainIdentifier) {
    this.payeeMainIdentifier = payeeMainIdentifier;
  }

/**
   * Transaction ID from the DFSP backend, used to reconcile transactions between the Switch and DFSP backend systems.
   **/
  public TransferRequestBulkItem payeeTypeEnumID(String payeeTypeEnumID) {
    this.payeeTypeEnumID = payeeTypeEnumID;
    return this;
  }

  

  
  @JsonProperty("payeeTypeEnumID")
 @Size(max=255)  public String getPayeeTypeEnumID() {
    return payeeTypeEnumID;
  }

  public void setPayeeTypeEnumID(String payeeTypeEnumID) {
    this.payeeTypeEnumID = payeeTypeEnumID;
  }

/**
   **/
  public TransferRequestBulkItem payeeType(InitiatorType payeeType) {
    this.payeeType = payeeType;
    return this;
  }

  

  
  @JsonProperty("payeeType")
  public InitiatorType getPayeeType() {
    return payeeType;
  }

  public void setPayeeType(InitiatorType payeeType) {
    this.payeeType = payeeType;
  }

/**
   * Identifier of the party.
   **/
  public TransferRequestBulkItem mobileNo1(String mobileNo1) {
    this.mobileNo1 = mobileNo1;
    return this;
  }

  

  
  @JsonProperty("mobileNo1")
 @Pattern(regexp="^[A-Za-z0-9]{4,125}$") @Size(min=4,max=125)  public String getMobileNo1() {
    return mobileNo1;
  }

  public void setMobileNo1(String mobileNo1) {
    this.mobileNo1 = mobileNo1;
  }

/**
   * Identifier of the party.
   **/
  public TransferRequestBulkItem mobileNo2(String mobileNo2) {
    this.mobileNo2 = mobileNo2;
    return this;
  }

  

  
  @JsonProperty("mobileNo2")
 @Pattern(regexp="^[A-Za-z0-9]{4,125}$") @Size(min=4,max=125)  public String getMobileNo2() {
    return mobileNo2;
  }

  public void setMobileNo2(String mobileNo2) {
    this.mobileNo2 = mobileNo2;
  }

/**
   **/
  public TransferRequestBulkItem amount(String amount) {
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
  public TransferRequestBulkItem currency(Currency currency) {
    this.currency = currency;
    return this;
  }

  

  
  @JsonProperty("currency")
  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

/**
   * Transaction ID from the DFSP backend, used to reconcile transactions between the Switch and DFSP backend systems.
   **/
  public TransferRequestBulkItem referenceID(String referenceID) {
    this.referenceID = referenceID;
    return this;
  }

  

  
  @JsonProperty("referenceID")
 @Size(max=255)  public String getReferenceID() {
    return referenceID;
  }

  public void setReferenceID(String referenceID) {
    this.referenceID = referenceID;
  }

/**
   **/
  public TransferRequestBulkItem referenceNote(String referenceNote) {
    this.referenceNote = referenceNote;
    return this;
  }

  

  
  @JsonProperty("referenceNote")
 @Size(max=255)  public String getReferenceNote() {
    return referenceNote;
  }

  public void setReferenceNote(String referenceNote) {
    this.referenceNote = referenceNote;
  }

/**
   **/
  public TransferRequestBulkItem fees1(String fees1) {
    this.fees1 = fees1;
    return this;
  }

  

  
  @JsonProperty("fees1")
 @Pattern(regexp="^([0]|([1-9][0-9]{0,17}))([.][0-9]{0,3}[1-9])?$")  public String getFees1() {
    return fees1;
  }

  public void setFees1(String fees1) {
    this.fees1 = fees1;
  }

/**
   **/
  public TransferRequestBulkItem fees2(String fees2) {
    this.fees2 = fees2;
    return this;
  }

  

  
  @JsonProperty("fees2")
 @Pattern(regexp="^([0]|([1-9][0-9]{0,17}))([.][0-9]{0,3}[1-9])?$")  public String getFees2() {
    return fees2;
  }

  public void setFees2(String fees2) {
    this.fees2 = fees2;
  }

/**
   **/
  public TransferRequestBulkItem fees3(String fees3) {
    this.fees3 = fees3;
    return this;
  }

  

  
  @JsonProperty("fees3")
 @Pattern(regexp="^([0]|([1-9][0-9]{0,17}))([.][0-9]{0,3}[1-9])?$")  public String getFees3() {
    return fees3;
  }

  public void setFees3(String fees3) {
    this.fees3 = fees3;
  }

/**
   * An ISO-8601 formatted timestamp.
   **/
  public TransferRequestBulkItem requestedDate(String requestedDate) {
    this.requestedDate = requestedDate;
    return this;
  }

  

  
  @JsonProperty("requestedDate")
 @Pattern(regexp="^(?:[1-9]\\d{3}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1\\d|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|(?:[1-9]\\d(?:0[48]|[2468][048]|[13579][26])|(?:[2468][048]|[13579][26])00)-02-29)T(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d(?:(\\.\\d{3}))(?:Z|[+-][01]\\d:[0-5]\\d)$")  public String getRequestedDate() {
    return requestedDate;
  }

  public void setRequestedDate(String requestedDate) {
    this.requestedDate = requestedDate;
  }

/**
   * An ISO-8601 formatted timestamp.
   **/
  public TransferRequestBulkItem createdDtm(String createdDtm) {
    this.createdDtm = createdDtm;
    return this;
  }

  

  
  @JsonProperty("createdDtm")
 @Pattern(regexp="^(?:[1-9]\\d{3}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1\\d|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|(?:[1-9]\\d(?:0[48]|[2468][048]|[13579][26])|(?:[2468][048]|[13579][26])00)-02-29)T(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d(?:(\\.\\d{3}))(?:Z|[+-][01]\\d:[0-5]\\d)$")  public String getCreatedDtm() {
    return createdDtm;
  }

  public void setCreatedDtm(String createdDtm) {
    this.createdDtm = createdDtm;
  }

/**
   * A Mojaloop API identifier (UUID).
   **/
  public TransferRequestBulkItem createdByID(String createdByID) {
    this.createdByID = createdByID;
    return this;
  }

  

  
  @JsonProperty("createdByID")
 @Pattern(regexp="^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$")  public String getCreatedByID() {
    return createdByID;
  }

  public void setCreatedByID(String createdByID) {
    this.createdByID = createdByID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferRequestBulkItem transferRequestBulkItem = (TransferRequestBulkItem) o;
    return Objects.equals(this.paymentTransactionID, transferRequestBulkItem.paymentTransactionID) &&
        Objects.equals(this.orderID, transferRequestBulkItem.orderID) &&
        Objects.equals(this.processGUID, transferRequestBulkItem.processGUID) &&
        Objects.equals(this.fromFspID, transferRequestBulkItem.fromFspID) &&
        Objects.equals(this.fromFspCode, transferRequestBulkItem.fromFspCode) &&
        Objects.equals(this.orgName, transferRequestBulkItem.orgName) &&
        Objects.equals(this.toFspID, transferRequestBulkItem.toFspID) &&
        Objects.equals(this.toFspCode, transferRequestBulkItem.toFspCode) &&
        Objects.equals(this.hubID, transferRequestBulkItem.hubID) &&
        Objects.equals(this.accountNo, transferRequestBulkItem.accountNo) &&
        Objects.equals(this.accountTypeEnumID, transferRequestBulkItem.accountTypeEnumID) &&
        Objects.equals(this.accountType, transferRequestBulkItem.accountType) &&
        Objects.equals(this.payeeName, transferRequestBulkItem.payeeName) &&
        Objects.equals(this.payeeMainIdentifier, transferRequestBulkItem.payeeMainIdentifier) &&
        Objects.equals(this.payeeTypeEnumID, transferRequestBulkItem.payeeTypeEnumID) &&
        Objects.equals(this.payeeType, transferRequestBulkItem.payeeType) &&
        Objects.equals(this.mobileNo1, transferRequestBulkItem.mobileNo1) &&
        Objects.equals(this.mobileNo2, transferRequestBulkItem.mobileNo2) &&
        Objects.equals(this.amount, transferRequestBulkItem.amount) &&
        Objects.equals(this.currency, transferRequestBulkItem.currency) &&
        Objects.equals(this.referenceID, transferRequestBulkItem.referenceID) &&
        Objects.equals(this.referenceNote, transferRequestBulkItem.referenceNote) &&
        Objects.equals(this.fees1, transferRequestBulkItem.fees1) &&
        Objects.equals(this.fees2, transferRequestBulkItem.fees2) &&
        Objects.equals(this.fees3, transferRequestBulkItem.fees3) &&
        Objects.equals(this.requestedDate, transferRequestBulkItem.requestedDate) &&
        Objects.equals(this.createdDtm, transferRequestBulkItem.createdDtm) &&
        Objects.equals(this.createdByID, transferRequestBulkItem.createdByID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentTransactionID, orderID, processGUID, fromFspID, fromFspCode, orgName, toFspID, toFspCode, hubID, accountNo, accountTypeEnumID, accountType, payeeName, payeeMainIdentifier, payeeTypeEnumID, payeeType, mobileNo1, mobileNo2, amount, currency, referenceID, referenceNote, fees1, fees2, fees3, requestedDate, createdDtm, createdByID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferRequestBulkItem {\n");
    
    sb.append("    paymentTransactionID: ").append(toIndentedString(paymentTransactionID)).append("\n");
    sb.append("    orderID: ").append(toIndentedString(orderID)).append("\n");
    sb.append("    processGUID: ").append(toIndentedString(processGUID)).append("\n");
    sb.append("    fromFspID: ").append(toIndentedString(fromFspID)).append("\n");
    sb.append("    fromFspCode: ").append(toIndentedString(fromFspCode)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    toFspID: ").append(toIndentedString(toFspID)).append("\n");
    sb.append("    toFspCode: ").append(toIndentedString(toFspCode)).append("\n");
    sb.append("    hubID: ").append(toIndentedString(hubID)).append("\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    accountTypeEnumID: ").append(toIndentedString(accountTypeEnumID)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    payeeName: ").append(toIndentedString(payeeName)).append("\n");
    sb.append("    payeeMainIdentifier: ").append(toIndentedString(payeeMainIdentifier)).append("\n");
    sb.append("    payeeTypeEnumID: ").append(toIndentedString(payeeTypeEnumID)).append("\n");
    sb.append("    payeeType: ").append(toIndentedString(payeeType)).append("\n");
    sb.append("    mobileNo1: ").append(toIndentedString(mobileNo1)).append("\n");
    sb.append("    mobileNo2: ").append(toIndentedString(mobileNo2)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    referenceID: ").append(toIndentedString(referenceID)).append("\n");
    sb.append("    referenceNote: ").append(toIndentedString(referenceNote)).append("\n");
    sb.append("    fees1: ").append(toIndentedString(fees1)).append("\n");
    sb.append("    fees2: ").append(toIndentedString(fees2)).append("\n");
    sb.append("    fees3: ").append(toIndentedString(fees3)).append("\n");
    sb.append("    requestedDate: ").append(toIndentedString(requestedDate)).append("\n");
    sb.append("    createdDtm: ").append(toIndentedString(createdDtm)).append("\n");
    sb.append("    createdByID: ").append(toIndentedString(createdByID)).append("\n");
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

