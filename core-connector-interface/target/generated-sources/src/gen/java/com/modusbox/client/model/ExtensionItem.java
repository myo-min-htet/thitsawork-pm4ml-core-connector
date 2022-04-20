package com.modusbox.client.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public class ExtensionItem   {
  
  private @Valid String key;
  private @Valid String value;

  /**
   **/
  public ExtensionItem key(String key) {
    this.key = key;
    return this;
  }

  

  
  @JsonProperty("key")
 @Size(min=1,max=32)  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

/**
   **/
  public ExtensionItem value(String value) {
    this.value = value;
    return this;
  }

  

  
  @JsonProperty("value")
 @Size(min=1,max=128)  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensionItem extensionItem = (ExtensionItem) o;
    return Objects.equals(this.key, extensionItem.key) &&
        Objects.equals(this.value, extensionItem.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionItem {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

