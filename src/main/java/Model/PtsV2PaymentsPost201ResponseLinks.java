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
import Model.PtsV2PaymentsPost201ResponseLinksSelf;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2PaymentsPost201ResponseLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-27T16:17:50.788+05:30")
public class PtsV2PaymentsPost201ResponseLinks {
  @SerializedName("self")
  private PtsV2PaymentsPost201ResponseLinksSelf self = null;

  @SerializedName("reversal")
  private PtsV2PaymentsPost201ResponseLinksSelf reversal = null;

  @SerializedName("capture")
  private PtsV2PaymentsPost201ResponseLinksSelf capture = null;

  @SerializedName("customer")
  private PtsV2PaymentsPost201ResponseLinksSelf customer = null;

  @SerializedName("paymentInstrument")
  private PtsV2PaymentsPost201ResponseLinksSelf paymentInstrument = null;

  @SerializedName("shippingAddress")
  private PtsV2PaymentsPost201ResponseLinksSelf shippingAddress = null;

  @SerializedName("instrumentIdentifier")
  private PtsV2PaymentsPost201ResponseLinksSelf instrumentIdentifier = null;

  public PtsV2PaymentsPost201ResponseLinks self(PtsV2PaymentsPost201ResponseLinksSelf self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseLinksSelf getSelf() {
    return self;
  }

  public void setSelf(PtsV2PaymentsPost201ResponseLinksSelf self) {
    this.self = self;
  }

  public PtsV2PaymentsPost201ResponseLinks reversal(PtsV2PaymentsPost201ResponseLinksSelf reversal) {
    this.reversal = reversal;
    return this;
  }

   /**
   * Get reversal
   * @return reversal
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseLinksSelf getReversal() {
    return reversal;
  }

  public void setReversal(PtsV2PaymentsPost201ResponseLinksSelf reversal) {
    this.reversal = reversal;
  }

  public PtsV2PaymentsPost201ResponseLinks capture(PtsV2PaymentsPost201ResponseLinksSelf capture) {
    this.capture = capture;
    return this;
  }

   /**
   * Get capture
   * @return capture
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseLinksSelf getCapture() {
    return capture;
  }

  public void setCapture(PtsV2PaymentsPost201ResponseLinksSelf capture) {
    this.capture = capture;
  }

  public PtsV2PaymentsPost201ResponseLinks customer(PtsV2PaymentsPost201ResponseLinksSelf customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseLinksSelf getCustomer() {
    return customer;
  }

  public void setCustomer(PtsV2PaymentsPost201ResponseLinksSelf customer) {
    this.customer = customer;
  }

  public PtsV2PaymentsPost201ResponseLinks paymentInstrument(PtsV2PaymentsPost201ResponseLinksSelf paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
    return this;
  }

   /**
   * Get paymentInstrument
   * @return paymentInstrument
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseLinksSelf getPaymentInstrument() {
    return paymentInstrument;
  }

  public void setPaymentInstrument(PtsV2PaymentsPost201ResponseLinksSelf paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
  }

  public PtsV2PaymentsPost201ResponseLinks shippingAddress(PtsV2PaymentsPost201ResponseLinksSelf shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Get shippingAddress
   * @return shippingAddress
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseLinksSelf getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(PtsV2PaymentsPost201ResponseLinksSelf shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public PtsV2PaymentsPost201ResponseLinks instrumentIdentifier(PtsV2PaymentsPost201ResponseLinksSelf instrumentIdentifier) {
    this.instrumentIdentifier = instrumentIdentifier;
    return this;
  }

   /**
   * Get instrumentIdentifier
   * @return instrumentIdentifier
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseLinksSelf getInstrumentIdentifier() {
    return instrumentIdentifier;
  }

  public void setInstrumentIdentifier(PtsV2PaymentsPost201ResponseLinksSelf instrumentIdentifier) {
    this.instrumentIdentifier = instrumentIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseLinks ptsV2PaymentsPost201ResponseLinks = (PtsV2PaymentsPost201ResponseLinks) o;
    return Objects.equals(this.self, ptsV2PaymentsPost201ResponseLinks.self) &&
        Objects.equals(this.reversal, ptsV2PaymentsPost201ResponseLinks.reversal) &&
        Objects.equals(this.capture, ptsV2PaymentsPost201ResponseLinks.capture) &&
        Objects.equals(this.customer, ptsV2PaymentsPost201ResponseLinks.customer) &&
        Objects.equals(this.paymentInstrument, ptsV2PaymentsPost201ResponseLinks.paymentInstrument) &&
        Objects.equals(this.shippingAddress, ptsV2PaymentsPost201ResponseLinks.shippingAddress) &&
        Objects.equals(this.instrumentIdentifier, ptsV2PaymentsPost201ResponseLinks.instrumentIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, reversal, capture, customer, paymentInstrument, shippingAddress, instrumentIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    reversal: ").append(toIndentedString(reversal)).append("\n");
    sb.append("    capture: ").append(toIndentedString(capture)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    paymentInstrument: ").append(toIndentedString(paymentInstrument)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    instrumentIdentifier: ").append(toIndentedString(instrumentIdentifier)).append("\n");
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

