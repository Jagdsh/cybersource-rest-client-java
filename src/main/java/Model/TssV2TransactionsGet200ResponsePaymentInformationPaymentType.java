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
import Model.TssV2TransactionsGet200ResponsePaymentInformationPaymentTypeFundingSource;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TssV2TransactionsGet200ResponsePaymentInformationPaymentType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-30T13:25:59.510+05:30")
public class TssV2TransactionsGet200ResponsePaymentInformationPaymentType {
  @SerializedName("name")
  private String name = null;

  @SerializedName("subTypeName")
  private String subTypeName = null;

  @SerializedName("fundingSource")
  private TssV2TransactionsGet200ResponsePaymentInformationPaymentTypeFundingSource fundingSource = null;

  @SerializedName("method")
  private String method = null;

  @SerializedName("authenticationMethod")
  private String authenticationMethod = null;

  public TssV2TransactionsGet200ResponsePaymentInformationPaymentType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A Payment Type is an agreed means for a payee to receive legal tender from a payer. The way one pays for a commercial financial transaction. Examples: Card, Bank Transfer, Digital, Direct Debit. 
   * @return name
  **/
  @ApiModelProperty(value = "A Payment Type is an agreed means for a payee to receive legal tender from a payer. The way one pays for a commercial financial transaction. Examples: Card, Bank Transfer, Digital, Direct Debit. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationPaymentType subTypeName(String subTypeName) {
    this.subTypeName = subTypeName;
    return this;
  }

   /**
   * SubType Name is detail information about Payment Type. Examples: For Card, if Credit or Debit or PrePaid. For Bank Transfer, if Online Bank Transfer or Wire Transfers. 
   * @return subTypeName
  **/
  @ApiModelProperty(value = "SubType Name is detail information about Payment Type. Examples: For Card, if Credit or Debit or PrePaid. For Bank Transfer, if Online Bank Transfer or Wire Transfers. ")
  public String getSubTypeName() {
    return subTypeName;
  }

  public void setSubTypeName(String subTypeName) {
    this.subTypeName = subTypeName;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationPaymentType fundingSource(TssV2TransactionsGet200ResponsePaymentInformationPaymentTypeFundingSource fundingSource) {
    this.fundingSource = fundingSource;
    return this;
  }

   /**
   * Get fundingSource
   * @return fundingSource
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponsePaymentInformationPaymentTypeFundingSource getFundingSource() {
    return fundingSource;
  }

  public void setFundingSource(TssV2TransactionsGet200ResponsePaymentInformationPaymentTypeFundingSource fundingSource) {
    this.fundingSource = fundingSource;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationPaymentType method(String method) {
    this.method = method;
    return this;
  }

   /**
   * A Payment Type is enabled through a Method. Examples: Visa, Master Card, ApplePay, iDeal
   * @return method
  **/
  @ApiModelProperty(value = "A Payment Type is enabled through a Method. Examples: Visa, Master Card, ApplePay, iDeal")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationPaymentType authenticationMethod(String authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
    return this;
  }

   /**
   * A Payment Type Authentication Method is the means used to verify that the presenter of the Payment Type credential is an authorized user of the Payment Instrument. Examples: 3DSecure – Verified by Visa, 3DSecure – MasteCard Secure Code 
   * @return authenticationMethod
  **/
  @ApiModelProperty(value = "A Payment Type Authentication Method is the means used to verify that the presenter of the Payment Type credential is an authorized user of the Payment Instrument. Examples: 3DSecure – Verified by Visa, 3DSecure – MasteCard Secure Code ")
  public String getAuthenticationMethod() {
    return authenticationMethod;
  }

  public void setAuthenticationMethod(String authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponsePaymentInformationPaymentType tssV2TransactionsGet200ResponsePaymentInformationPaymentType = (TssV2TransactionsGet200ResponsePaymentInformationPaymentType) o;
    return Objects.equals(this.name, tssV2TransactionsGet200ResponsePaymentInformationPaymentType.name) &&
        Objects.equals(this.subTypeName, tssV2TransactionsGet200ResponsePaymentInformationPaymentType.subTypeName) &&
        Objects.equals(this.fundingSource, tssV2TransactionsGet200ResponsePaymentInformationPaymentType.fundingSource) &&
        Objects.equals(this.method, tssV2TransactionsGet200ResponsePaymentInformationPaymentType.method) &&
        Objects.equals(this.authenticationMethod, tssV2TransactionsGet200ResponsePaymentInformationPaymentType.authenticationMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, subTypeName, fundingSource, method, authenticationMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponsePaymentInformationPaymentType {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subTypeName: ").append(toIndentedString(subTypeName)).append("\n");
    sb.append("    fundingSource: ").append(toIndentedString(fundingSource)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    authenticationMethod: ").append(toIndentedString(authenticationMethod)).append("\n");
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

