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
import Model.TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedProcessingInformationBankTransferOptions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedProcessingInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-09T11:41:34.789+05:30")
public class TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedProcessingInformation {
  @SerializedName("billPaymentProgramEnabled")
  private Boolean billPaymentProgramEnabled = false;

  @SerializedName("bankTransferOptions")
  private TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedProcessingInformationBankTransferOptions bankTransferOptions = null;

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedProcessingInformation billPaymentProgramEnabled(Boolean billPaymentProgramEnabled) {
    this.billPaymentProgramEnabled = billPaymentProgramEnabled;
    return this;
  }

   /**
   * Indicates that the payments for this customer profile are for the Bill Payment program. Possible values:   * false: Not a Visa Bill Payment.   * true: Visa Bill Payment. 
   * @return billPaymentProgramEnabled
  **/
  @ApiModelProperty(example = "true", value = "Indicates that the payments for this customer profile are for the Bill Payment program. Possible values:   * false: Not a Visa Bill Payment.   * true: Visa Bill Payment. ")
  public Boolean getBillPaymentProgramEnabled() {
    return billPaymentProgramEnabled;
  }

  public void setBillPaymentProgramEnabled(Boolean billPaymentProgramEnabled) {
    this.billPaymentProgramEnabled = billPaymentProgramEnabled;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedProcessingInformation bankTransferOptions(TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedProcessingInformationBankTransferOptions bankTransferOptions) {
    this.bankTransferOptions = bankTransferOptions;
    return this;
  }

   /**
   * Get bankTransferOptions
   * @return bankTransferOptions
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedProcessingInformationBankTransferOptions getBankTransferOptions() {
    return bankTransferOptions;
  }

  public void setBankTransferOptions(TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedProcessingInformationBankTransferOptions bankTransferOptions) {
    this.bankTransferOptions = bankTransferOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedProcessingInformation tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedProcessingInformation = (TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedProcessingInformation) o;
    return Objects.equals(this.billPaymentProgramEnabled, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedProcessingInformation.billPaymentProgramEnabled) &&
        Objects.equals(this.bankTransferOptions, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedProcessingInformation.bankTransferOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billPaymentProgramEnabled, bankTransferOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedProcessingInformation {\n");
    
    sb.append("    billPaymentProgramEnabled: ").append(toIndentedString(billPaymentProgramEnabled)).append("\n");
    sb.append("    bankTransferOptions: ").append(toIndentedString(bankTransferOptions)).append("\n");
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

