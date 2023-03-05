package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceGoogleAnalyticsDataApiCredentialsAuthenticateViaGoogleOauth
 * Credentials for the service
**/
public class SourceGoogleAnalyticsDataApiCredentialsAuthenticateViaGoogleOauth {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access_token")
    public String accessToken;
    public SourceGoogleAnalyticsDataApiCredentialsAuthenticateViaGoogleOauth withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    public SourceGoogleAnalyticsDataApiCredentialsAuthenticateViaGoogleOauthAuthTypeEnum authType;
    public SourceGoogleAnalyticsDataApiCredentialsAuthenticateViaGoogleOauth withAuthType(SourceGoogleAnalyticsDataApiCredentialsAuthenticateViaGoogleOauthAuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
    @JsonProperty("client_id")
    public String clientId;
    public SourceGoogleAnalyticsDataApiCredentialsAuthenticateViaGoogleOauth withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourceGoogleAnalyticsDataApiCredentialsAuthenticateViaGoogleOauth withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    @JsonProperty("refresh_token")
    public String refreshToken;
    public SourceGoogleAnalyticsDataApiCredentialsAuthenticateViaGoogleOauth withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
}
