package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceGoogleAnalyticsDataApiCredentialsServiceAccountKeyAuthentication
 * Credentials for the service
**/
public class SourceGoogleAnalyticsDataApiCredentialsServiceAccountKeyAuthentication {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    public SourceGoogleAnalyticsDataApiCredentialsServiceAccountKeyAuthenticationAuthTypeEnum authType;
    public SourceGoogleAnalyticsDataApiCredentialsServiceAccountKeyAuthentication withAuthType(SourceGoogleAnalyticsDataApiCredentialsServiceAccountKeyAuthenticationAuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
    @JsonProperty("credentials_json")
    public String credentialsJson;
    public SourceGoogleAnalyticsDataApiCredentialsServiceAccountKeyAuthentication withCredentialsJson(String credentialsJson) {
        this.credentialsJson = credentialsJson;
        return this;
    }
    
}
