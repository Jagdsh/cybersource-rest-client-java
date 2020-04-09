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
 * PtsV2PaymentsPost201ResponseRiskInformationTravelLastDestination
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-09T11:41:34.789+05:30")
public class PtsV2PaymentsPost201ResponseRiskInformationTravelLastDestination {
  @SerializedName("country")
  private String country = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("latitude")
  private String latitude = null;

  @SerializedName("longitude")
  private String longitude = null;

  public PtsV2PaymentsPost201ResponseRiskInformationTravelLastDestination country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country of last destination on the route.
   * @return country
  **/
  @ApiModelProperty(value = "Country of last destination on the route.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationTravelLastDestination locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * City of last destination on the route.
   * @return locality
  **/
  @ApiModelProperty(value = "City of last destination on the route.")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationTravelLastDestination latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Latitude of last destination on the route.
   * @return latitude
  **/
  @ApiModelProperty(value = "Latitude of last destination on the route.")
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationTravelLastDestination longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Longitude of last destination on the route.
   * @return longitude
  **/
  @ApiModelProperty(value = "Longitude of last destination on the route.")
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseRiskInformationTravelLastDestination ptsV2PaymentsPost201ResponseRiskInformationTravelLastDestination = (PtsV2PaymentsPost201ResponseRiskInformationTravelLastDestination) o;
    return Objects.equals(this.country, ptsV2PaymentsPost201ResponseRiskInformationTravelLastDestination.country) &&
        Objects.equals(this.locality, ptsV2PaymentsPost201ResponseRiskInformationTravelLastDestination.locality) &&
        Objects.equals(this.latitude, ptsV2PaymentsPost201ResponseRiskInformationTravelLastDestination.latitude) &&
        Objects.equals(this.longitude, ptsV2PaymentsPost201ResponseRiskInformationTravelLastDestination.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, locality, latitude, longitude);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseRiskInformationTravelLastDestination {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

