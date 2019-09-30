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

/**
 * ReportingV3NetFundingsGet200ResponseTotalPurchases
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-26T18:32:32.437+05:30")
public class ReportingV3NetFundingsGet200ResponseTotalPurchases {
  @SerializedName("currency")
  private String currency = null;

  @SerializedName("value")
  private String value = null;

  public ReportingV3NetFundingsGet200ResponseTotalPurchases currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Valid ISO 4217 ALPHA-3 currency code
   * @return currency
  **/
  @ApiModelProperty(example = "USD", required = true, value = "Valid ISO 4217 ALPHA-3 currency code")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public ReportingV3NetFundingsGet200ResponseTotalPurchases value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(example = "10.01", required = true, value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3NetFundingsGet200ResponseTotalPurchases reportingV3NetFundingsGet200ResponseTotalPurchases = (ReportingV3NetFundingsGet200ResponseTotalPurchases) o;
    return Objects.equals(this.currency, reportingV3NetFundingsGet200ResponseTotalPurchases.currency) &&
        Objects.equals(this.value, reportingV3NetFundingsGet200ResponseTotalPurchases.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3NetFundingsGet200ResponseTotalPurchases {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
