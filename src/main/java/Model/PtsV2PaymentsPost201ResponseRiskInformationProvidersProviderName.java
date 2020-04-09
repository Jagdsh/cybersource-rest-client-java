/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Name of the 3rd party provider, for example, Emailage.  For all possible values, see the &#x60;decision_provider_#_name&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Decision Manager Using the SCMP API Developer Guide_ (PDF link). 
 */
@ApiModel(description = "Name of the 3rd party provider, for example, Emailage.  For all possible values, see the `decision_provider_#_name` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Decision Manager Using the SCMP API Developer Guide_ (PDF link). ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-09T11:41:34.789+05:30")
public class PtsV2PaymentsPost201ResponseRiskInformationProvidersProviderName {
  @SerializedName("fieldName")
  private List<String> fieldName = null;

  @SerializedName("fieldValue")
  private List<String> fieldValue = null;

  public PtsV2PaymentsPost201ResponseRiskInformationProvidersProviderName fieldName(List<String> fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationProvidersProviderName addFieldNameItem(String fieldNameItem) {
    if (this.fieldName == null) {
      this.fieldName = new ArrayList<String>();
    }
    this.fieldName.add(fieldNameItem);
    return this;
  }

   /**
   * Get fieldName
   * @return fieldName
  **/
  @ApiModelProperty(value = "")
  public List<String> getFieldName() {
    return fieldName;
  }

  public void setFieldName(List<String> fieldName) {
    this.fieldName = fieldName;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationProvidersProviderName fieldValue(List<String> fieldValue) {
    this.fieldValue = fieldValue;
    return this;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationProvidersProviderName addFieldValueItem(String fieldValueItem) {
    if (this.fieldValue == null) {
      this.fieldValue = new ArrayList<String>();
    }
    this.fieldValue.add(fieldValueItem);
    return this;
  }

   /**
   * Get fieldValue
   * @return fieldValue
  **/
  @ApiModelProperty(value = "")
  public List<String> getFieldValue() {
    return fieldValue;
  }

  public void setFieldValue(List<String> fieldValue) {
    this.fieldValue = fieldValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseRiskInformationProvidersProviderName ptsV2PaymentsPost201ResponseRiskInformationProvidersProviderName = (PtsV2PaymentsPost201ResponseRiskInformationProvidersProviderName) o;
    return Objects.equals(this.fieldName, ptsV2PaymentsPost201ResponseRiskInformationProvidersProviderName.fieldName) &&
        Objects.equals(this.fieldValue, ptsV2PaymentsPost201ResponseRiskInformationProvidersProviderName.fieldValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, fieldValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseRiskInformationProvidersProviderName {\n");
    
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    fieldValue: ").append(toIndentedString(fieldValue)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

