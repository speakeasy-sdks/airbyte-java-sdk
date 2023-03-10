package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceSnowflakeCredentialsOAuth20 {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access_token")
    public String accessToken;
    public SourceSnowflakeCredentialsOAuth20 withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("auth_type")
    public SourceSnowflakeCredentialsOAuth20AuthTypeEnum authType;
    public SourceSnowflakeCredentialsOAuth20 withAuthType(SourceSnowflakeCredentialsOAuth20AuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
    @JsonProperty("client_id")
    public String clientId;
    public SourceSnowflakeCredentialsOAuth20 withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourceSnowflakeCredentialsOAuth20 withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("refresh_token")
    public String refreshToken;
    public SourceSnowflakeCredentialsOAuth20 withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
}
