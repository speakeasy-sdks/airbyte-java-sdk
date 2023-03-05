package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceGoogleAnalyticsV4CredentialsAuthenticateViaGoogleOauth
 * Credentials for the service
**/
public class SourceGoogleAnalyticsV4CredentialsAuthenticateViaGoogleOauth {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access_token")
    public String accessToken;
    public SourceGoogleAnalyticsV4CredentialsAuthenticateViaGoogleOauth withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    public SourceGoogleAnalyticsV4CredentialsAuthenticateViaGoogleOauthAuthTypeEnum authType;
    public SourceGoogleAnalyticsV4CredentialsAuthenticateViaGoogleOauth withAuthType(SourceGoogleAnalyticsV4CredentialsAuthenticateViaGoogleOauthAuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
    @JsonProperty("client_id")
    public String clientId;
    public SourceGoogleAnalyticsV4CredentialsAuthenticateViaGoogleOauth withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourceGoogleAnalyticsV4CredentialsAuthenticateViaGoogleOauth withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    @JsonProperty("refresh_token")
    public String refreshToken;
    public SourceGoogleAnalyticsV4CredentialsAuthenticateViaGoogleOauth withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
}
