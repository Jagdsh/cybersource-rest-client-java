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
import org.joda.time.DateTime;

/**
 * ReportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-09T11:41:34.789+05:30")
public class ReportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries {
  @SerializedName("currencyCode")
  private String currencyCode = null;

  @SerializedName("paymentSubTypeDescription")
  private String paymentSubTypeDescription = null;

  @SerializedName("startTime")
  private DateTime startTime = null;

  @SerializedName("endTime")
  private DateTime endTime = null;

  @SerializedName("salesCount")
  private Integer salesCount = null;

  @SerializedName("salesAmount")
  private String salesAmount = null;

  @SerializedName("creditCount")
  private Integer creditCount = null;

  @SerializedName("creditAmount")
  private String creditAmount = null;

  @SerializedName("accountName")
  private String accountName = null;

  @SerializedName("accountId")
  private String accountId = null;

  @SerializedName("merchantId")
  private String merchantId = null;

  @SerializedName("merchantName")
  private String merchantName = null;

  public ReportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(example = "USD", value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public ReportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries paymentSubTypeDescription(String paymentSubTypeDescription) {
    this.paymentSubTypeDescription = paymentSubTypeDescription;
    return this;
  }

   /**
   * Get paymentSubTypeDescription
   * @return paymentSubTypeDescription
  **/
  @ApiModelProperty(example = "Diners Club", value = "")
  public String getPaymentSubTypeDescription() {
    return paymentSubTypeDescription;
  }

  public void setPaymentSubTypeDescription(String paymentSubTypeDescription) {
    this.paymentSubTypeDescription = paymentSubTypeDescription;
  }

  public ReportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries startTime(DateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(value = "")
  public DateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(DateTime startTime) {
    this.startTime = startTime;
  }

  public ReportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries endTime(DateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(value = "")
  public DateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(DateTime endTime) {
    this.endTime = endTime;
  }

  public ReportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries salesCount(Integer salesCount) {
    this.salesCount = salesCount;
    return this;
  }

   /**
   * Get salesCount
   * @return salesCount
  **/
  @ApiModelProperty(example = "10", value = "")
  public Integer getSalesCount() {
    return salesCount;
  }

  public void setSalesCount(Integer salesCount) {
    this.salesCount = salesCount;
  }

  public ReportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries salesAmount(String salesAmount) {
    this.salesAmount = salesAmount;
    return this;
  }

   /**
   * Get salesAmount
   * @return salesAmount
  **/
  @ApiModelProperty(example = "5000.01", value = "")
  public String getSalesAmount() {
    return salesAmount;
  }

  public void setSalesAmount(String salesAmount) {
    this.salesAmount = salesAmount;
  }

  public ReportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries creditCount(Integer creditCount) {
    this.creditCount = creditCount;
    return this;
  }

   /**
   * Get creditCount
   * @return creditCount
  **/
  @ApiModelProperty(example = "10", value = "")
  public Integer getCreditCount() {
    return creditCount;
  }

  public void setCreditCount(Integer creditCount) {
    this.creditCount = creditCount;
  }

  public ReportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries creditAmount(String creditAmount) {
    this.creditAmount = creditAmount;
    return this;
  }

   /**
   * Get creditAmount
   * @return creditAmount
  **/
  @ApiModelProperty(example = "5000.01", value = "")
  public String getCreditAmount() {
    return creditAmount;
  }

  public void setCreditAmount(String creditAmount) {
    this.creditAmount = creditAmount;
  }

  public ReportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @ApiModelProperty(example = "ubmerchant296", value = "")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public ReportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(example = "ubmerchant296_acct", value = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public ReportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Get merchantId
   * @return merchantId
  **/
  @ApiModelProperty(example = "ubmerchant296_3", value = "")
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public ReportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries merchantName(String merchantName) {
    this.merchantName = merchantName;
    return this;
  }

   /**
   * Get merchantName
   * @return merchantName
  **/
  @ApiModelProperty(example = "ubmerchant296_3", value = "")
  public String getMerchantName() {
    return merchantName;
  }

  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries reportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries = (ReportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries) o;
    return Objects.equals(this.currencyCode, reportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries.currencyCode) &&
        Objects.equals(this.paymentSubTypeDescription, reportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries.paymentSubTypeDescription) &&
        Objects.equals(this.startTime, reportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries.startTime) &&
        Objects.equals(this.endTime, reportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries.endTime) &&
        Objects.equals(this.salesCount, reportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries.salesCount) &&
        Objects.equals(this.salesAmount, reportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries.salesAmount) &&
        Objects.equals(this.creditCount, reportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries.creditCount) &&
        Objects.equals(this.creditAmount, reportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries.creditAmount) &&
        Objects.equals(this.accountName, reportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries.accountName) &&
        Objects.equals(this.accountId, reportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries.accountId) &&
        Objects.equals(this.merchantId, reportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries.merchantId) &&
        Objects.equals(this.merchantName, reportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries.merchantName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, paymentSubTypeDescription, startTime, endTime, salesCount, salesAmount, creditCount, creditAmount, accountName, accountId, merchantId, merchantName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    paymentSubTypeDescription: ").append(toIndentedString(paymentSubTypeDescription)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    salesCount: ").append(toIndentedString(salesCount)).append("\n");
    sb.append("    salesAmount: ").append(toIndentedString(salesAmount)).append("\n");
    sb.append("    creditCount: ").append(toIndentedString(creditCount)).append("\n");
    sb.append("    creditAmount: ").append(toIndentedString(creditAmount)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
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

