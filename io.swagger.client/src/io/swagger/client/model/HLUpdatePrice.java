/*
 * LoopBack Application
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;

import org.threeten.bp.OffsetDateTime;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A transaction named HLUpdatePrice
 */
@ApiModel(description = "A transaction named HLUpdatePrice")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-20T16:55:17.138Z")
public class HLUpdatePrice {
  @SerializedName("$class")
  private String propertyClass = "org.powermatcher.HLUpdatePrice";

  @SerializedName("newValue")
  private Double newValue = null;

  @SerializedName("currentPrice")
  private XAny currentPrice = null;

  @SerializedName("transactionId")
  private String transactionId = null;

  @SerializedName("timestamp")
  private OffsetDateTime timestamp = null;

  public HLUpdatePrice propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

   /**
   * The class identifier for this type
   * @return propertyClass
  **/
  @ApiModelProperty(value = "The class identifier for this type")
  public String getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }

  public HLUpdatePrice newValue(Double newValue) {
    this.newValue = newValue;
    return this;
  }

   /**
   * Get newValue
   * @return newValue
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getNewValue() {
    return newValue;
  }

  public void setNewValue(Double newValue) {
    this.newValue = newValue;
  }

  public HLUpdatePrice currentPrice(XAny currentPrice) {
    this.currentPrice = currentPrice;
    return this;
  }

   /**
   * The identifier of an instance of currentPrice
   * @return currentPrice
  **/
  @ApiModelProperty(required = true, value = "The identifier of an instance of currentPrice")
  public XAny getCurrentPrice() {
    return currentPrice;
  }

  public void setCurrentPrice(XAny currentPrice) {
    this.currentPrice = currentPrice;
  }

  public HLUpdatePrice transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * The instance identifier for this type
   * @return transactionId
  **/
  @ApiModelProperty(value = "The instance identifier for this type")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public HLUpdatePrice timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HLUpdatePrice hlUpdatePrice = (HLUpdatePrice) o;
    return Objects.equals(this.propertyClass, hlUpdatePrice.propertyClass) &&
        Objects.equals(this.newValue, hlUpdatePrice.newValue) &&
        Objects.equals(this.currentPrice, hlUpdatePrice.currentPrice) &&
        Objects.equals(this.transactionId, hlUpdatePrice.transactionId) &&
        Objects.equals(this.timestamp, hlUpdatePrice.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyClass, newValue, currentPrice, transactionId, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HLUpdatePrice {\n");
    
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
    sb.append("    currentPrice: ").append(toIndentedString(currentPrice)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
