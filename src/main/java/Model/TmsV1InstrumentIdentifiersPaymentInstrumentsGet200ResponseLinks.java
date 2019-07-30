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
import Model.TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinksFirst;
import Model.TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinksLast;
import Model.TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinksNext;
import Model.TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinksPrev;
import Model.TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinksSelf;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-30T13:25:59.510+05:30")
public class TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinks {
  @SerializedName("self")
  private TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinksSelf self = null;

  @SerializedName("first")
  private TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinksFirst first = null;

  @SerializedName("prev")
  private TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinksPrev prev = null;

  @SerializedName("next")
  private TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinksNext next = null;

  @SerializedName("last")
  private TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinksLast last = null;

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinks self(TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinksSelf self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinksSelf getSelf() {
    return self;
  }

  public void setSelf(TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinksSelf self) {
    this.self = self;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinks first(TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinksFirst first) {
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinksFirst getFirst() {
    return first;
  }

  public void setFirst(TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinksFirst first) {
    this.first = first;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinks prev(TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinksPrev prev) {
    this.prev = prev;
    return this;
  }

   /**
   * Get prev
   * @return prev
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinksPrev getPrev() {
    return prev;
  }

  public void setPrev(TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinksPrev prev) {
    this.prev = prev;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinks next(TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinksNext next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinksNext getNext() {
    return next;
  }

  public void setNext(TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinksNext next) {
    this.next = next;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinks last(TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinksLast last) {
    this.last = last;
    return this;
  }

   /**
   * Get last
   * @return last
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinksLast getLast() {
    return last;
  }

  public void setLast(TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinksLast last) {
    this.last = last;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinks tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinks = (TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinks) o;
    return Objects.equals(this.self, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinks.self) &&
        Objects.equals(this.first, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinks.first) &&
        Objects.equals(this.prev, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinks.prev) &&
        Objects.equals(this.next, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinks.next) &&
        Objects.equals(this.last, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinks.last);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, first, prev, next, last);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
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

