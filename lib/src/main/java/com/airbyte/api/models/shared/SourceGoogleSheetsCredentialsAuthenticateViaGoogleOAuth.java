package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceGoogleSheetsCredentialsAuthenticateViaGoogleOAuth
 * Credentials for connecting to the Google Sheets API
**/
public class SourceGoogleSheetsCredentialsAuthenticateViaGoogleOAuth {
    @JsonProperty("auth_type")
    public SourceGoogleSheetsCredentialsAuthenticateViaGoogleOAuthAuthTypeEnum authType;
    public SourceGoogleSheetsCredentialsAuthenticateViaGoogleOAuth withAuthType(SourceGoogleSheetsCredentialsAuthenticateViaGoogleOAuthAuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
    @JsonProperty("client_id")
    public String clientId;
    public SourceGoogleSheetsCredentialsAuthenticateViaGoogleOAuth withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourceGoogleSheetsCredentialsAuthenticateViaGoogleOAuth withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    @JsonProperty("refresh_token")
    public String refreshToken;
    public SourceGoogleSheetsCredentialsAuthenticateViaGoogleOAuth withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
}
