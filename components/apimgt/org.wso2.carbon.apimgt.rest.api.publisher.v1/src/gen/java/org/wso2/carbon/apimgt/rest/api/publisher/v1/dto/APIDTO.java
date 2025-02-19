package org.wso2.carbon.apimgt.rest.api.publisher.v1.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.APIBusinessInformationDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.APICorsConfigurationDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.APIEndpointDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.APIEndpointSecurityDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.APIMaxTpsDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.APIMonetizationInfoDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.APIOperationsDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.APIThreatProtectionPoliciesDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.LabelDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.MediationPolicyDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.ScopeDTO;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class APIDTO   {
  
    private String id = null;
    private String name = null;
    private String description = null;
    private String context = null;
    private String version = null;
    private String provider = null;
    private String lifeCycleStatus = null;
    private String wsdlUri = null;
    private String responseCaching = null;
    private Integer cacheTimeout = null;
    private String destinationStatsEnabled = null;
    private Boolean hasThumbnail = null;
    private Boolean isDefaultVersion = null;

@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

    @XmlEnumValue("HTTP") HTTP(String.valueOf("HTTP")), @XmlEnumValue("WS") WS(String.valueOf("WS")), @XmlEnumValue("SOAPTOREST") SOAPTOREST(String.valueOf("SOAPTOREST"));


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

    private TypeEnum type = TypeEnum.HTTP;
    private List<String> transport = new ArrayList<>();
    private List<String> tags = new ArrayList<>();
    private List<String> policies = new ArrayList<>();
    private String apiThrottlingPolicy = null;
    private String authorizationHeader = null;
    private List<String> securityScheme = new ArrayList<>();
    private APIMaxTpsDTO maxTps = null;

@XmlType(name="VisibilityEnum")
@XmlEnum(String.class)
public enum VisibilityEnum {

    @XmlEnumValue("PUBLIC") PUBLIC(String.valueOf("PUBLIC")), @XmlEnumValue("PRIVATE") PRIVATE(String.valueOf("PRIVATE")), @XmlEnumValue("RESTRICTED") RESTRICTED(String.valueOf("RESTRICTED"));


    private String value;

    VisibilityEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VisibilityEnum fromValue(String v) {
        for (VisibilityEnum b : VisibilityEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

    private VisibilityEnum visibility = null;
    private List<String> visibleRoles = new ArrayList<>();
    private List<String> visibleTenants = new ArrayList<>();
    private APIEndpointSecurityDTO endpointSecurity = null;
    private List<String> gatewayEnvironments = new ArrayList<>();
    private List<LabelDTO> labels = new ArrayList<>();
    private List<MediationPolicyDTO> mediationPolicies = new ArrayList<>();

@XmlType(name="SubscriptionAvailabilityEnum")
@XmlEnum(String.class)
public enum SubscriptionAvailabilityEnum {

    @XmlEnumValue("current_tenant") CURRENT_TENANT(String.valueOf("current_tenant")), @XmlEnumValue("all_tenants") ALL_TENANTS(String.valueOf("all_tenants")), @XmlEnumValue("specific_tenants") SPECIFIC_TENANTS(String.valueOf("specific_tenants"));


    private String value;

    SubscriptionAvailabilityEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SubscriptionAvailabilityEnum fromValue(String v) {
        for (SubscriptionAvailabilityEnum b : SubscriptionAvailabilityEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

    private SubscriptionAvailabilityEnum subscriptionAvailability = null;
    private List<String> subscriptionAvailableTenants = new ArrayList<>();
    private Map<String, String> additionalProperties = new HashMap<>();
    private APIMonetizationInfoDTO monetization = null;

@XmlType(name="AccessControlEnum")
@XmlEnum(String.class)
public enum AccessControlEnum {

    @XmlEnumValue("NONE") NONE(String.valueOf("NONE")), @XmlEnumValue("RESTRICTED") RESTRICTED(String.valueOf("RESTRICTED"));


    private String value;

    AccessControlEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AccessControlEnum fromValue(String v) {
        for (AccessControlEnum b : AccessControlEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

    private AccessControlEnum accessControl = null;
    private List<String> accessControlRoles = new ArrayList<>();
    private APIBusinessInformationDTO businessInformation = null;
    private APICorsConfigurationDTO corsConfiguration = null;
    private String workflowStatus = null;
    private String createdTime = null;
    private String lastUpdatedTime = null;
    private List<APIEndpointDTO> endpoint = new ArrayList<>();
    private List<ScopeDTO> scopes = new ArrayList<>();
    private List<APIOperationsDTO> operations = new ArrayList<>();
    private APIThreatProtectionPoliciesDTO threatProtectionPolicies = null;

  /**
   * UUID of the api registry artifact 
   **/
  public APIDTO id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "01234567-0123-0123-0123-012345678901", value = "UUID of the api registry artifact ")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public APIDTO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "CalculatorAPI", required = true, value = "")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public APIDTO description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "A calculator API that supports basic operations", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  public APIDTO context(String context) {
    this.context = context;
    return this;
  }

  
  @ApiModelProperty(example = "CalculatorAPI", required = true, value = "")
  @JsonProperty("context")
  @NotNull
  public String getContext() {
    return context;
  }
  public void setContext(String context) {
    this.context = context;
  }

  /**
   **/
  public APIDTO version(String version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(example = "1.0.0", required = true, value = "")
  @JsonProperty("version")
  @NotNull
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * If the provider value is not given user invoking the api will be used as the provider. 
   **/
  public APIDTO provider(String provider) {
    this.provider = provider;
    return this;
  }

  
  @ApiModelProperty(example = "admin", value = "If the provider value is not given user invoking the api will be used as the provider. ")
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }
  public void setProvider(String provider) {
    this.provider = provider;
  }

  /**
   **/
  public APIDTO lifeCycleStatus(String lifeCycleStatus) {
    this.lifeCycleStatus = lifeCycleStatus;
    return this;
  }

  
  @ApiModelProperty(example = "CREATED", value = "")
  @JsonProperty("lifeCycleStatus")
  public String getLifeCycleStatus() {
    return lifeCycleStatus;
  }
  public void setLifeCycleStatus(String lifeCycleStatus) {
    this.lifeCycleStatus = lifeCycleStatus;
  }

  /**
   * WSDL URL if the API is based on a WSDL endpoint 
   **/
  public APIDTO wsdlUri(String wsdlUri) {
    this.wsdlUri = wsdlUri;
    return this;
  }

  
  @ApiModelProperty(example = "http://www.webservicex.com/globalweather.asmx?wsdl", value = "WSDL URL if the API is based on a WSDL endpoint ")
  @JsonProperty("wsdlUri")
  public String getWsdlUri() {
    return wsdlUri;
  }
  public void setWsdlUri(String wsdlUri) {
    this.wsdlUri = wsdlUri;
  }

  /**
   **/
  public APIDTO responseCaching(String responseCaching) {
    this.responseCaching = responseCaching;
    return this;
  }

  
  @ApiModelProperty(example = "Disabled", value = "")
  @JsonProperty("responseCaching")
  public String getResponseCaching() {
    return responseCaching;
  }
  public void setResponseCaching(String responseCaching) {
    this.responseCaching = responseCaching;
  }

  /**
   **/
  public APIDTO cacheTimeout(Integer cacheTimeout) {
    this.cacheTimeout = cacheTimeout;
    return this;
  }

  
  @ApiModelProperty(example = "300", value = "")
  @JsonProperty("cacheTimeout")
  public Integer getCacheTimeout() {
    return cacheTimeout;
  }
  public void setCacheTimeout(Integer cacheTimeout) {
    this.cacheTimeout = cacheTimeout;
  }

  /**
   **/
  public APIDTO destinationStatsEnabled(String destinationStatsEnabled) {
    this.destinationStatsEnabled = destinationStatsEnabled;
    return this;
  }

  
  @ApiModelProperty(example = "Disabled", value = "")
  @JsonProperty("destinationStatsEnabled")
  public String getDestinationStatsEnabled() {
    return destinationStatsEnabled;
  }
  public void setDestinationStatsEnabled(String destinationStatsEnabled) {
    this.destinationStatsEnabled = destinationStatsEnabled;
  }

  /**
   **/
  public APIDTO hasThumbnail(Boolean hasThumbnail) {
    this.hasThumbnail = hasThumbnail;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "")
  @JsonProperty("hasThumbnail")
  public Boolean isHasThumbnail() {
    return hasThumbnail;
  }
  public void setHasThumbnail(Boolean hasThumbnail) {
    this.hasThumbnail = hasThumbnail;
  }

  /**
   **/
  public APIDTO isDefaultVersion(Boolean isDefaultVersion) {
    this.isDefaultVersion = isDefaultVersion;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "")
  @JsonProperty("isDefaultVersion")
  public Boolean isIsDefaultVersion() {
    return isDefaultVersion;
  }
  public void setIsDefaultVersion(Boolean isDefaultVersion) {
    this.isDefaultVersion = isDefaultVersion;
  }

  /**
   * The api creation type to be used. Accepted values are HTTP, WS, SOAPTOREST
   **/
  public APIDTO type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "HTTP", value = "The api creation type to be used. Accepted values are HTTP, WS, SOAPTOREST")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Supported transports for the API (http and/or https). 
   **/
  public APIDTO transport(List<String> transport) {
    this.transport = transport;
    return this;
  }

  
  @ApiModelProperty(example = "[\"http\",\"https\"]", value = "Supported transports for the API (http and/or https). ")
  @JsonProperty("transport")
  public List<String> getTransport() {
    return transport;
  }
  public void setTransport(List<String> transport) {
    this.transport = transport;
  }

  /**
   **/
  public APIDTO tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  
  @ApiModelProperty(example = "[\"substract\",\"add\"]", value = "")
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   **/
  public APIDTO policies(List<String> policies) {
    this.policies = policies;
    return this;
  }

  
  @ApiModelProperty(example = "[\"Unlimited\"]", value = "")
  @JsonProperty("policies")
  public List<String> getPolicies() {
    return policies;
  }
  public void setPolicies(List<String> policies) {
    this.policies = policies;
  }

  /**
   * The API level throttling policy selected for the particular API
   **/
  public APIDTO apiThrottlingPolicy(String apiThrottlingPolicy) {
    this.apiThrottlingPolicy = apiThrottlingPolicy;
    return this;
  }

  
  @ApiModelProperty(example = "Unlimited", value = "The API level throttling policy selected for the particular API")
  @JsonProperty("apiThrottlingPolicy")
  public String getApiThrottlingPolicy() {
    return apiThrottlingPolicy;
  }
  public void setApiThrottlingPolicy(String apiThrottlingPolicy) {
    this.apiThrottlingPolicy = apiThrottlingPolicy;
  }

  /**
   * Name of the Authorization header used for invoking the API. If it is not set, Authorization header name specified in tenant or system level will be used. 
   **/
  public APIDTO authorizationHeader(String authorizationHeader) {
    this.authorizationHeader = authorizationHeader;
    return this;
  }

  
  @ApiModelProperty(value = "Name of the Authorization header used for invoking the API. If it is not set, Authorization header name specified in tenant or system level will be used. ")
  @JsonProperty("authorizationHeader")
  public String getAuthorizationHeader() {
    return authorizationHeader;
  }
  public void setAuthorizationHeader(String authorizationHeader) {
    this.authorizationHeader = authorizationHeader;
  }

  /**
   * Types of API security, the current API secured with. It can be either OAuth2 or mutual SSL or both. If it is not set OAuth2 will be set as the security for the current API. 
   **/
  public APIDTO securityScheme(List<String> securityScheme) {
    this.securityScheme = securityScheme;
    return this;
  }

  
  @ApiModelProperty(value = "Types of API security, the current API secured with. It can be either OAuth2 or mutual SSL or both. If it is not set OAuth2 will be set as the security for the current API. ")
  @JsonProperty("securityScheme")
  public List<String> getSecurityScheme() {
    return securityScheme;
  }
  public void setSecurityScheme(List<String> securityScheme) {
    this.securityScheme = securityScheme;
  }

  /**
   **/
  public APIDTO maxTps(APIMaxTpsDTO maxTps) {
    this.maxTps = maxTps;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("maxTps")
  public APIMaxTpsDTO getMaxTps() {
    return maxTps;
  }
  public void setMaxTps(APIMaxTpsDTO maxTps) {
    this.maxTps = maxTps;
  }

  /**
   * The visibility level of the API. Accepts one of the following. PUBLIC, PRIVATE, RESTRICTED.
   **/
  public APIDTO visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

  
  @ApiModelProperty(example = "PUBLIC", value = "The visibility level of the API. Accepts one of the following. PUBLIC, PRIVATE, RESTRICTED.")
  @JsonProperty("visibility")
  public VisibilityEnum getVisibility() {
    return visibility;
  }
  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  /**
   * The user roles that are able to access the API in Store
   **/
  public APIDTO visibleRoles(List<String> visibleRoles) {
    this.visibleRoles = visibleRoles;
    return this;
  }

  
  @ApiModelProperty(example = "[]", value = "The user roles that are able to access the API in Store")
  @JsonProperty("visibleRoles")
  public List<String> getVisibleRoles() {
    return visibleRoles;
  }
  public void setVisibleRoles(List<String> visibleRoles) {
    this.visibleRoles = visibleRoles;
  }

  /**
   **/
  public APIDTO visibleTenants(List<String> visibleTenants) {
    this.visibleTenants = visibleTenants;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("visibleTenants")
  public List<String> getVisibleTenants() {
    return visibleTenants;
  }
  public void setVisibleTenants(List<String> visibleTenants) {
    this.visibleTenants = visibleTenants;
  }

  /**
   **/
  public APIDTO endpointSecurity(APIEndpointSecurityDTO endpointSecurity) {
    this.endpointSecurity = endpointSecurity;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("endpointSecurity")
  public APIEndpointSecurityDTO getEndpointSecurity() {
    return endpointSecurity;
  }
  public void setEndpointSecurity(APIEndpointSecurityDTO endpointSecurity) {
    this.endpointSecurity = endpointSecurity;
  }

  /**
   * List of gateway environments the API is available 
   **/
  public APIDTO gatewayEnvironments(List<String> gatewayEnvironments) {
    this.gatewayEnvironments = gatewayEnvironments;
    return this;
  }

  
  @ApiModelProperty(example = "[\"Production and Sandbox\"]", value = "List of gateway environments the API is available ")
  @JsonProperty("gatewayEnvironments")
  public List<String> getGatewayEnvironments() {
    return gatewayEnvironments;
  }
  public void setGatewayEnvironments(List<String> gatewayEnvironments) {
    this.gatewayEnvironments = gatewayEnvironments;
  }

  /**
   * Labels of micro-gateway environments attached to the API. 
   **/
  public APIDTO labels(List<LabelDTO> labels) {
    this.labels = labels;
    return this;
  }

  
  @ApiModelProperty(value = "Labels of micro-gateway environments attached to the API. ")
  @JsonProperty("labels")
  public List<LabelDTO> getLabels() {
    return labels;
  }
  public void setLabels(List<LabelDTO> labels) {
    this.labels = labels;
  }

  /**
   **/
  public APIDTO mediationPolicies(List<MediationPolicyDTO> mediationPolicies) {
    this.mediationPolicies = mediationPolicies;
    return this;
  }

  
  @ApiModelProperty(example = "\"\\\"sequences\\\": [ {\\\"name\\\": \\\"json_to_xml_in_message\\\",\\\"config\\\": null,\\\"type\\\": \\\"in\\\"}, {\\\"name\\\": \\\"xml_to_json_out_message\\\",\\\"config\\\": null,\\\"type\\\": \\\"out\\\"}, {\\\"name\\\": \\\"json_fault\\\",\\\"config\\\": null,\\\"type\\\": \\\"fault\\\"} ],\"", value = "")
  @JsonProperty("mediationPolicies")
  public List<MediationPolicyDTO> getMediationPolicies() {
    return mediationPolicies;
  }
  public void setMediationPolicies(List<MediationPolicyDTO> mediationPolicies) {
    this.mediationPolicies = mediationPolicies;
  }

  /**
   * The subscription availability. Accepts one of the following. current_tenant, all_tenants or specific_tenants.
   **/
  public APIDTO subscriptionAvailability(SubscriptionAvailabilityEnum subscriptionAvailability) {
    this.subscriptionAvailability = subscriptionAvailability;
    return this;
  }

  
  @ApiModelProperty(example = "current_tenant", value = "The subscription availability. Accepts one of the following. current_tenant, all_tenants or specific_tenants.")
  @JsonProperty("subscriptionAvailability")
  public SubscriptionAvailabilityEnum getSubscriptionAvailability() {
    return subscriptionAvailability;
  }
  public void setSubscriptionAvailability(SubscriptionAvailabilityEnum subscriptionAvailability) {
    this.subscriptionAvailability = subscriptionAvailability;
  }

  /**
   **/
  public APIDTO subscriptionAvailableTenants(List<String> subscriptionAvailableTenants) {
    this.subscriptionAvailableTenants = subscriptionAvailableTenants;
    return this;
  }

  
  @ApiModelProperty(example = "[\"tenant1\",\"tenant2\"]", value = "")
  @JsonProperty("subscriptionAvailableTenants")
  public List<String> getSubscriptionAvailableTenants() {
    return subscriptionAvailableTenants;
  }
  public void setSubscriptionAvailableTenants(List<String> subscriptionAvailableTenants) {
    this.subscriptionAvailableTenants = subscriptionAvailableTenants;
  }

  /**
   * Map of custom properties of API
   **/
  public APIDTO additionalProperties(Map<String, String> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  
  @ApiModelProperty(value = "Map of custom properties of API")
  @JsonProperty("additionalProperties")
  public Map<String, String> getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Map<String, String> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  /**
   **/
  public APIDTO monetization(APIMonetizationInfoDTO monetization) {
    this.monetization = monetization;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("monetization")
  public APIMonetizationInfoDTO getMonetization() {
    return monetization;
  }
  public void setMonetization(APIMonetizationInfoDTO monetization) {
    this.monetization = monetization;
  }

  /**
   * Is the API is restricted to certain set of publishers or creators or is it visible to all the publishers and creators. If the accessControl restriction is none, this API can be modified by all the publishers and creators, if not it can only be viewable/modifiable by certain set of publishers and creators,  based on the restriction. 
   **/
  public APIDTO accessControl(AccessControlEnum accessControl) {
    this.accessControl = accessControl;
    return this;
  }

  
  @ApiModelProperty(value = "Is the API is restricted to certain set of publishers or creators or is it visible to all the publishers and creators. If the accessControl restriction is none, this API can be modified by all the publishers and creators, if not it can only be viewable/modifiable by certain set of publishers and creators,  based on the restriction. ")
  @JsonProperty("accessControl")
  public AccessControlEnum getAccessControl() {
    return accessControl;
  }
  public void setAccessControl(AccessControlEnum accessControl) {
    this.accessControl = accessControl;
  }

  /**
   * The user roles that are able to view/modify as API publisher or creator.
   **/
  public APIDTO accessControlRoles(List<String> accessControlRoles) {
    this.accessControlRoles = accessControlRoles;
    return this;
  }

  
  @ApiModelProperty(example = "[\"admin\"]", value = "The user roles that are able to view/modify as API publisher or creator.")
  @JsonProperty("accessControlRoles")
  public List<String> getAccessControlRoles() {
    return accessControlRoles;
  }
  public void setAccessControlRoles(List<String> accessControlRoles) {
    this.accessControlRoles = accessControlRoles;
  }

  /**
   **/
  public APIDTO businessInformation(APIBusinessInformationDTO businessInformation) {
    this.businessInformation = businessInformation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("businessInformation")
  public APIBusinessInformationDTO getBusinessInformation() {
    return businessInformation;
  }
  public void setBusinessInformation(APIBusinessInformationDTO businessInformation) {
    this.businessInformation = businessInformation;
  }

  /**
   **/
  public APIDTO corsConfiguration(APICorsConfigurationDTO corsConfiguration) {
    this.corsConfiguration = corsConfiguration;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("corsConfiguration")
  public APICorsConfigurationDTO getCorsConfiguration() {
    return corsConfiguration;
  }
  public void setCorsConfiguration(APICorsConfigurationDTO corsConfiguration) {
    this.corsConfiguration = corsConfiguration;
  }

  /**
   **/
  public APIDTO workflowStatus(String workflowStatus) {
    this.workflowStatus = workflowStatus;
    return this;
  }

  
  @ApiModelProperty(example = "APPROVED", value = "")
  @JsonProperty("workflowStatus")
  public String getWorkflowStatus() {
    return workflowStatus;
  }
  public void setWorkflowStatus(String workflowStatus) {
    this.workflowStatus = workflowStatus;
  }

  /**
   **/
  public APIDTO createdTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  
  @ApiModelProperty(example = "2017-02-20T13:57:16.229+0000", value = "")
  @JsonProperty("createdTime")
  public String getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }

  /**
   **/
  public APIDTO lastUpdatedTime(String lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
    return this;
  }

  
  @ApiModelProperty(example = "2017-02-20T13:57:16.229+0000", value = "")
  @JsonProperty("lastUpdatedTime")
  public String getLastUpdatedTime() {
    return lastUpdatedTime;
  }
  public void setLastUpdatedTime(String lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

  /**
   **/
  public APIDTO endpoint(List<APIEndpointDTO> endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("endpoint")
  public List<APIEndpointDTO> getEndpoint() {
    return endpoint;
  }
  public void setEndpoint(List<APIEndpointDTO> endpoint) {
    this.endpoint = endpoint;
  }

  /**
   **/
  public APIDTO scopes(List<ScopeDTO> scopes) {
    this.scopes = scopes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scopes")
  public List<ScopeDTO> getScopes() {
    return scopes;
  }
  public void setScopes(List<ScopeDTO> scopes) {
    this.scopes = scopes;
  }

  /**
   **/
  public APIDTO operations(List<APIOperationsDTO> operations) {
    this.operations = operations;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("operations")
  public List<APIOperationsDTO> getOperations() {
    return operations;
  }
  public void setOperations(List<APIOperationsDTO> operations) {
    this.operations = operations;
  }

  /**
   **/
  public APIDTO threatProtectionPolicies(APIThreatProtectionPoliciesDTO threatProtectionPolicies) {
    this.threatProtectionPolicies = threatProtectionPolicies;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("threatProtectionPolicies")
  public APIThreatProtectionPoliciesDTO getThreatProtectionPolicies() {
    return threatProtectionPolicies;
  }
  public void setThreatProtectionPolicies(APIThreatProtectionPoliciesDTO threatProtectionPolicies) {
    this.threatProtectionPolicies = threatProtectionPolicies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIDTO API = (APIDTO) o;
    return Objects.equals(id, API.id) &&
        Objects.equals(name, API.name) &&
        Objects.equals(description, API.description) &&
        Objects.equals(context, API.context) &&
        Objects.equals(version, API.version) &&
        Objects.equals(provider, API.provider) &&
        Objects.equals(lifeCycleStatus, API.lifeCycleStatus) &&
        Objects.equals(wsdlUri, API.wsdlUri) &&
        Objects.equals(responseCaching, API.responseCaching) &&
        Objects.equals(cacheTimeout, API.cacheTimeout) &&
        Objects.equals(destinationStatsEnabled, API.destinationStatsEnabled) &&
        Objects.equals(hasThumbnail, API.hasThumbnail) &&
        Objects.equals(isDefaultVersion, API.isDefaultVersion) &&
        Objects.equals(type, API.type) &&
        Objects.equals(transport, API.transport) &&
        Objects.equals(tags, API.tags) &&
        Objects.equals(policies, API.policies) &&
        Objects.equals(apiThrottlingPolicy, API.apiThrottlingPolicy) &&
        Objects.equals(authorizationHeader, API.authorizationHeader) &&
        Objects.equals(securityScheme, API.securityScheme) &&
        Objects.equals(maxTps, API.maxTps) &&
        Objects.equals(visibility, API.visibility) &&
        Objects.equals(visibleRoles, API.visibleRoles) &&
        Objects.equals(visibleTenants, API.visibleTenants) &&
        Objects.equals(endpointSecurity, API.endpointSecurity) &&
        Objects.equals(gatewayEnvironments, API.gatewayEnvironments) &&
        Objects.equals(labels, API.labels) &&
        Objects.equals(mediationPolicies, API.mediationPolicies) &&
        Objects.equals(subscriptionAvailability, API.subscriptionAvailability) &&
        Objects.equals(subscriptionAvailableTenants, API.subscriptionAvailableTenants) &&
        Objects.equals(additionalProperties, API.additionalProperties) &&
        Objects.equals(monetization, API.monetization) &&
        Objects.equals(accessControl, API.accessControl) &&
        Objects.equals(accessControlRoles, API.accessControlRoles) &&
        Objects.equals(businessInformation, API.businessInformation) &&
        Objects.equals(corsConfiguration, API.corsConfiguration) &&
        Objects.equals(workflowStatus, API.workflowStatus) &&
        Objects.equals(createdTime, API.createdTime) &&
        Objects.equals(lastUpdatedTime, API.lastUpdatedTime) &&
        Objects.equals(endpoint, API.endpoint) &&
        Objects.equals(scopes, API.scopes) &&
        Objects.equals(operations, API.operations) &&
        Objects.equals(threatProtectionPolicies, API.threatProtectionPolicies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, context, version, provider, lifeCycleStatus, wsdlUri, responseCaching, cacheTimeout, destinationStatsEnabled, hasThumbnail, isDefaultVersion, type, transport, tags, policies, apiThrottlingPolicy, authorizationHeader, securityScheme, maxTps, visibility, visibleRoles, visibleTenants, endpointSecurity, gatewayEnvironments, labels, mediationPolicies, subscriptionAvailability, subscriptionAvailableTenants, additionalProperties, monetization, accessControl, accessControlRoles, businessInformation, corsConfiguration, workflowStatus, createdTime, lastUpdatedTime, endpoint, scopes, operations, threatProtectionPolicies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    lifeCycleStatus: ").append(toIndentedString(lifeCycleStatus)).append("\n");
    sb.append("    wsdlUri: ").append(toIndentedString(wsdlUri)).append("\n");
    sb.append("    responseCaching: ").append(toIndentedString(responseCaching)).append("\n");
    sb.append("    cacheTimeout: ").append(toIndentedString(cacheTimeout)).append("\n");
    sb.append("    destinationStatsEnabled: ").append(toIndentedString(destinationStatsEnabled)).append("\n");
    sb.append("    hasThumbnail: ").append(toIndentedString(hasThumbnail)).append("\n");
    sb.append("    isDefaultVersion: ").append(toIndentedString(isDefaultVersion)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    transport: ").append(toIndentedString(transport)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
    sb.append("    apiThrottlingPolicy: ").append(toIndentedString(apiThrottlingPolicy)).append("\n");
    sb.append("    authorizationHeader: ").append(toIndentedString(authorizationHeader)).append("\n");
    sb.append("    securityScheme: ").append(toIndentedString(securityScheme)).append("\n");
    sb.append("    maxTps: ").append(toIndentedString(maxTps)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    visibleRoles: ").append(toIndentedString(visibleRoles)).append("\n");
    sb.append("    visibleTenants: ").append(toIndentedString(visibleTenants)).append("\n");
    sb.append("    endpointSecurity: ").append(toIndentedString(endpointSecurity)).append("\n");
    sb.append("    gatewayEnvironments: ").append(toIndentedString(gatewayEnvironments)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    mediationPolicies: ").append(toIndentedString(mediationPolicies)).append("\n");
    sb.append("    subscriptionAvailability: ").append(toIndentedString(subscriptionAvailability)).append("\n");
    sb.append("    subscriptionAvailableTenants: ").append(toIndentedString(subscriptionAvailableTenants)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    monetization: ").append(toIndentedString(monetization)).append("\n");
    sb.append("    accessControl: ").append(toIndentedString(accessControl)).append("\n");
    sb.append("    accessControlRoles: ").append(toIndentedString(accessControlRoles)).append("\n");
    sb.append("    businessInformation: ").append(toIndentedString(businessInformation)).append("\n");
    sb.append("    corsConfiguration: ").append(toIndentedString(corsConfiguration)).append("\n");
    sb.append("    workflowStatus: ").append(toIndentedString(workflowStatus)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    lastUpdatedTime: ").append(toIndentedString(lastUpdatedTime)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    threatProtectionPolicies: ").append(toIndentedString(threatProtectionPolicies)).append("\n");
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

