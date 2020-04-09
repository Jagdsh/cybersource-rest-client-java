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
import Model.Ptsv2paymentsPaymentInformationCustomer;
import Model.TssV2TransactionsPost201ResponseEmbeddedPaymentInformationCard;
import Model.TssV2TransactionsPost201ResponseEmbeddedPaymentInformationPaymentType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TssV2TransactionsPost201ResponseEmbeddedPaymentInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-09T11:41:34.789+05:30")
public class TssV2TransactionsPost201ResponseEmbeddedPaymentInformation {
  @SerializedName("paymentType")
  private TssV2TransactionsPost201ResponseEmbeddedPaymentInformationPaymentType paymentType = null;

  @SerializedName("customer")
  private Ptsv2paymentsPaymentInformationCustomer customer = null;

  @SerializedName("card")
  private TssV2TransactionsPost201ResponseEmbeddedPaymentInformationCard card = null;

  public TssV2TransactionsPost201ResponseEmbeddedPaymentInformation paymentType(TssV2TransactionsPost201ResponseEmbeddedPaymentInformationPaymentType paymentType) {
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Get paymentType
   * @return paymentType
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsPost201ResponseEmbeddedPaymentInformationPaymentType getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(TssV2TransactionsPost201ResponseEmbeddedPaymentInformationPaymentType paymentType) {
    this.paymentType = paymentType;
  }

  public TssV2TransactionsPost201ResponseEmbeddedPaymentInformation customer(Ptsv2paymentsPaymentInformationCustomer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsPaymentInformationCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(Ptsv2paymentsPaymentInformationCustomer customer) {
    this.customer = customer;
  }

  public TssV2TransactionsPost201ResponseEmbeddedPaymentInformation card(TssV2TransactionsPost201ResponseEmbeddedPaymentInformationCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsPost201ResponseEmbeddedPaymentInformationCard getCard() {
    return card;
  }

  public void setCard(TssV2TransactionsPost201ResponseEmbeddedPaymentInformationCard card) {
    this.card = card;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsPost201ResponseEmbeddedPaymentInformation tssV2TransactionsPost201ResponseEmbeddedPaymentInformation = (TssV2TransactionsPost201ResponseEmbeddedPaymentInformation) o;
    return Objects.equals(this.paymentType, tssV2TransactionsPost201ResponseEmbeddedPaymentInformation.paymentType) &&
        Objects.equals(this.customer, tssV2TransactionsPost201ResponseEmbeddedPaymentInformation.customer) &&
        Objects.equals(this.card, tssV2TransactionsPost201ResponseEmbeddedPaymentInformation.card);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentType, customer, card);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsPost201ResponseEmbeddedPaymentInformation {\n");
    
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
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

