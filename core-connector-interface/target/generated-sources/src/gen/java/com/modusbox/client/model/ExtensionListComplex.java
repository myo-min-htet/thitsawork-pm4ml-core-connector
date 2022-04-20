package com.modusbox.client.model;

import com.modusbox.client.model.ExtensionItem;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Data model for the complex type ExtensionList
 **/

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-04-20T12:34:57.970747200+06:30[Asia/Rangoon]")public class ExtensionListComplex   {
  
  private @Valid List<ExtensionItem> extension = new ArrayList<ExtensionItem>();

  /**
   * Number of Extension elements
   **/
  public ExtensionListComplex extension(List<ExtensionItem> extension) {
    this.extension = extension;
    return this;
  }

  

  
  @JsonProperty("extension")
  @NotNull
 @Size(min=1,max=16)  public List<ExtensionItem> getExtension() {
    return extension;
  }

  public void setExtension(List<ExtensionItem> extension) {
    this.extension = extension;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensionListComplex extensionListComplex = (ExtensionListComplex) o;
    return Objects.equals(this.extension, extensionListComplex.extension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionListComplex {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
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

