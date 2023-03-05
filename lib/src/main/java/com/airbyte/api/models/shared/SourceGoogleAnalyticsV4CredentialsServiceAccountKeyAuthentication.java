package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceGoogleAnalyticsV4CredentialsServiceAccountKeyAuthentication
 * Credentials for the service
**/
public class SourceGoogleAnalyticsV4CredentialsServiceAccountKeyAuthentication {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    public SourceGoogleAnalyticsV4CredentialsServiceAccountKeyAuthenticationAuthTypeEnum authType;
    public SourceGoogleAnalyticsV4CredentialsServiceAccountKeyAuthentication withAuthType(SourceGoogleAnalyticsV4CredentialsServiceAccountKeyAuthenticationAuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
    @JsonProperty("credentials_json")
    public String credentialsJson;
    public SourceGoogleAnalyticsV4CredentialsServiceAccountKeyAuthentication withCredentialsJson(String credentialsJson) {
        this.credentialsJson = credentialsJson;
        return this;
    }
    
}
