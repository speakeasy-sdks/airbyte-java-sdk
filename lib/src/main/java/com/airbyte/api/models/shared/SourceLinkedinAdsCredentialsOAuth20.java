package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceLinkedinAdsCredentialsOAuth20 {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_method")
    public SourceLinkedinAdsCredentialsOAuth20AuthMethodEnum authMethod;
    public SourceLinkedinAdsCredentialsOAuth20 withAuthMethod(SourceLinkedinAdsCredentialsOAuth20AuthMethodEnum authMethod) {
        this.authMethod = authMethod;
        return this;
    }
    
    @JsonProperty("client_id")
    public String clientId;
    public SourceLinkedinAdsCredentialsOAuth20 withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourceLinkedinAdsCredentialsOAuth20 withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    @JsonProperty("refresh_token")
    public String refreshToken;
    public SourceLinkedinAdsCredentialsOAuth20 withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
}
