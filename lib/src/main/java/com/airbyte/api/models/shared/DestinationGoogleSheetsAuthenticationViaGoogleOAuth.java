package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationGoogleSheetsAuthenticationViaGoogleOAuth
 * Google API Credentials for connecting to Google Sheets and Google Drive APIs
**/
public class DestinationGoogleSheetsAuthenticationViaGoogleOAuth {
    @JsonProperty("client_id")
    public String clientId;
    public DestinationGoogleSheetsAuthenticationViaGoogleOAuth withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    @JsonProperty("client_secret")
    public String clientSecret;
    public DestinationGoogleSheetsAuthenticationViaGoogleOAuth withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    @JsonProperty("refresh_token")
    public String refreshToken;
    public DestinationGoogleSheetsAuthenticationViaGoogleOAuth withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
}
