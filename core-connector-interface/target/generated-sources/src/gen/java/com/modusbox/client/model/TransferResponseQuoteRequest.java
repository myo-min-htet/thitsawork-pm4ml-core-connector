package com.modusbox.client.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public class TransferResponseQuoteRequest   {
  
  private @Valid String method;
  private @Valid String host;
  private @Valid String port;
  private @Valid String path;
  private @Valid Object headers;
  private @Valid String agent;
  private @Valid String body;

  /**
   **/
  public TransferResponseQuoteRequest method(String method) {
    this.method = method;
    return this;
  }

  

  
  @JsonProperty("method")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

/**
   **/
  public TransferResponseQuoteRequest host(String host) {
    this.host = host;
    return this;
  }

  

  
  @JsonProperty("host")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

/**
   **/
  public TransferResponseQuoteRequest port(String port) {
    this.port = port;
    return this;
  }

  

  
  @JsonProperty("port")
  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }

/**
   **/
  public TransferResponseQuoteRequest path(String path) {
    this.path = path;
    return this;
  }

  

  
  @JsonProperty("path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

/**
   **/
  public TransferResponseQuoteRequest headers(Object headers) {
    this.headers = headers;
    return this;
  }

  

  
  @JsonProperty("headers")
  public Object getHeaders() {
    return headers;
  }

  public void setHeaders(Object headers) {
    this.headers = headers;
  }

/**
   **/
  public TransferResponseQuoteRequest agent(String agent) {
    this.agent = agent;
    return this;
  }

  

  
  @JsonProperty("agent")
  public String getAgent() {
    return agent;
  }

  public void setAgent(String agent) {
    this.agent = agent;
  }

/**
   **/
  public TransferResponseQuoteRequest body(String body) {
    this.body = body;
    return this;
  }

  

  
  @JsonProperty("body")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferResponseQuoteRequest transferResponseQuoteRequest = (TransferResponseQuoteRequest) o;
    return Objects.equals(this.method, transferResponseQuoteRequest.method) &&
        Objects.equals(this.host, transferResponseQuoteRequest.host) &&
        Objects.equals(this.port, transferResponseQuoteRequest.port) &&
        Objects.equals(this.path, transferResponseQuoteRequest.path) &&
        Objects.equals(this.headers, transferResponseQuoteRequest.headers) &&
        Objects.equals(this.agent, transferResponseQuoteRequest.agent) &&
        Objects.equals(this.body, transferResponseQuoteRequest.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, host, port, path, headers, agent, body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferResponseQuoteRequest {\n");
    
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

