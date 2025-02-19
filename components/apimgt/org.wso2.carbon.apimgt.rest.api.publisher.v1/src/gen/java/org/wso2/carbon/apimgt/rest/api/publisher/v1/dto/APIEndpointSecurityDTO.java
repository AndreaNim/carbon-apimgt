package org.wso2.carbon.apimgt.rest.api.publisher.v1.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class APIEndpointSecurityDTO   {
  

@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

    @XmlEnumValue("basic") BASIC(String.valueOf("basic")), @XmlEnumValue("digest") DIGEST(String.valueOf("digest")), @XmlEnumValue("kerberos") KERBEROS(String.valueOf("kerberos"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String v) {
        for (TypeEnum b : TypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

    private TypeEnum type = null;
    private String targetSpn = null;
    private String username = null;
    private String password = null;

  /**
   * Accepts one of the following, basic or digest.
   **/
  public APIEndpointSecurityDTO type(TypeEnum type) {
    this.type = type;
    return this;
  }

  @ApiModelProperty(example = "basic", value = "Accepts one of the following, basic or digest.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  public APIEndpointSecurityDTO targetSpn(String targetSpn) {
    this.targetSpn = targetSpn;
    return this;
  }

  @ApiModelProperty(example = "HTTP/idp.example.com@EXAMPLE.COM", value = "")
  @JsonProperty("targetSpn")
  public String getTargetSpn() {
    return targetSpn;
  }
  public void setTargetSpn(String targetSpn) {
    this.targetSpn = targetSpn;
  }

  /**
   **/
  public APIEndpointSecurityDTO username(String username) {
    this.username = username;
    return this;
  }

  @ApiModelProperty(example = "admin", value = "")
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   **/
  public APIEndpointSecurityDTO password(String password) {
    this.password = password;
    return this;
  }

  @ApiModelProperty(example = "password", value = "")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIEndpointSecurityDTO apIEndpointSecurity = (APIEndpointSecurityDTO) o;
    return Objects.equals(type, apIEndpointSecurity.type) &&
        Objects.equals(targetSpn, apIEndpointSecurity.targetSpn) &&
        Objects.equals(username, apIEndpointSecurity.username) &&
        Objects.equals(password, apIEndpointSecurity.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, targetSpn, username, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIEndpointSecurityDTO {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    targetSpn: ").append(toIndentedString(targetSpn)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

