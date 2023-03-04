package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceGoogleAdsGoogleCredentials {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access_token")
    public String accessToken;
    public SourceGoogleAdsGoogleCredentials withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("client_id")
    public String clientId;
    public SourceGoogleAdsGoogleCredentials withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourceGoogleAdsGoogleCredentials withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    @JsonProperty("developer_token")
    public String developerToken;
    public SourceGoogleAdsGoogleCredentials withDeveloperToken(String developerToken) {
        this.developerToken = developerToken;
        return this;
    }
    
    @JsonProperty("refresh_token")
    public String refreshToken;
    public SourceGoogleAdsGoogleCredentials withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
}
