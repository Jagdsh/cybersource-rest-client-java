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
import Model.InlineResponse2003KeyInformation;
import Model.Kmsv2keyssymClientReferenceInformation;
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
 * InlineResponse2003
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-27T16:17:50.788+05:30")
public class InlineResponse2003 {
  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  @SerializedName("clientReferenceInformation")
  private Kmsv2keyssymClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("keyInformation")
  private List<InlineResponse2003KeyInformation> keyInformation = null;

  public InlineResponse2003 submitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
    return this;
  }

   /**
   * Time of request in UTC. Format: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60; **Example** &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The &#x60;T&#x60; separates the date and the time. The &#x60;Z&#x60; indicates UTC.  Returned by authorization service.  #### PIN debit Time when the PIN debit credit, PIN debit purchase or PIN debit reversal was requested.  Returned by PIN debit credit, PIN debit purchase or PIN debit reversal. 
   * @return submitTimeUtc
  **/
  @ApiModelProperty(value = "Time of request in UTC. Format: `YYYY-MM-DDThh:mm:ssZ` **Example** `2016-08-11T22:47:57Z` equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The `T` separates the date and the time. The `Z` indicates UTC.  Returned by authorization service.  #### PIN debit Time when the PIN debit credit, PIN debit purchase or PIN debit reversal was requested.  Returned by PIN debit credit, PIN debit purchase or PIN debit reversal. ")
  public String getSubmitTimeUtc() {
    return submitTimeUtc;
  }

  public void setSubmitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
  }

  public InlineResponse2003 clientReferenceInformation(Kmsv2keyssymClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public Kmsv2keyssymClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(Kmsv2keyssymClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public InlineResponse2003 keyInformation(List<InlineResponse2003KeyInformation> keyInformation) {
    this.keyInformation = keyInformation;
    return this;
  }

  public InlineResponse2003 addKeyInformationItem(InlineResponse2003KeyInformation keyInformationItem) {
    if (this.keyInformation == null) {
      this.keyInformation = new ArrayList<InlineResponse2003KeyInformation>();
    }
    this.keyInformation.add(keyInformationItem);
    return this;
  }

   /**
   * Get keyInformation
   * @return keyInformation
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse2003KeyInformation> getKeyInformation() {
    return keyInformation;
  }

  public void setKeyInformation(List<InlineResponse2003KeyInformation> keyInformation) {
    this.keyInformation = keyInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003 inlineResponse2003 = (InlineResponse2003) o;
    return Objects.equals(this.submitTimeUtc, inlineResponse2003.submitTimeUtc) &&
        Objects.equals(this.clientReferenceInformation, inlineResponse2003.clientReferenceInformation) &&
        Objects.equals(this.keyInformation, inlineResponse2003.keyInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submitTimeUtc, clientReferenceInformation, keyInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003 {\n");
    
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    keyInformation: ").append(toIndentedString(keyInformation)).append("\n");
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

