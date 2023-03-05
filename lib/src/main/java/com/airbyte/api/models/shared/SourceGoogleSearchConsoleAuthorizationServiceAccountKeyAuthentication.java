package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceGoogleSearchConsoleAuthorizationServiceAccountKeyAuthentication {
    @JsonProperty("auth_type")
    public SourceGoogleSearchConsoleAuthorizationServiceAccountKeyAuthenticationAuthTypeEnum authType;
    public SourceGoogleSearchConsoleAuthorizationServiceAccountKeyAuthentication withAuthType(SourceGoogleSearchConsoleAuthorizationServiceAccountKeyAuthenticationAuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
    @JsonProperty("email")
    public String email;
    public SourceGoogleSearchConsoleAuthorizationServiceAccountKeyAuthentication withEmail(String email) {
        this.email = email;
        return this;
    }
    
    @JsonProperty("service_account_info")
    public String serviceAccountInfo;
    public SourceGoogleSearchConsoleAuthorizationServiceAccountKeyAuthentication withServiceAccountInfo(String serviceAccountInfo) {
        this.serviceAccountInfo = serviceAccountInfo;
        return this;
    }
    
}
