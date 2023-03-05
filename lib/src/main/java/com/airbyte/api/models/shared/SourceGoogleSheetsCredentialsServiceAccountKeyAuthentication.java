package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceGoogleSheetsCredentialsServiceAccountKeyAuthentication
 * Credentials for connecting to the Google Sheets API
**/
public class SourceGoogleSheetsCredentialsServiceAccountKeyAuthentication {
    @JsonProperty("auth_type")
    public SourceGoogleSheetsCredentialsServiceAccountKeyAuthenticationAuthTypeEnum authType;
    public SourceGoogleSheetsCredentialsServiceAccountKeyAuthentication withAuthType(SourceGoogleSheetsCredentialsServiceAccountKeyAuthenticationAuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
    @JsonProperty("service_account_info")
    public String serviceAccountInfo;
    public SourceGoogleSheetsCredentialsServiceAccountKeyAuthentication withServiceAccountInfo(String serviceAccountInfo) {
        this.serviceAccountInfo = serviceAccountInfo;
        return this;
    }
    
}
