package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceMondayCredentialsOAuth20 {
    @JsonProperty("access_token")
    public String accessToken;
    public SourceMondayCredentialsOAuth20 withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("auth_type")
    public SourceMondayCredentialsOAuth20AuthTypeEnum authType;
    public SourceMondayCredentialsOAuth20 withAuthType(SourceMondayCredentialsOAuth20AuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
    @JsonProperty("client_id")
    public String clientId;
    public SourceMondayCredentialsOAuth20 withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourceMondayCredentialsOAuth20 withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subdomain")
    public String subdomain;
    public SourceMondayCredentialsOAuth20 withSubdomain(String subdomain) {
        this.subdomain = subdomain;
        return this;
    }
    
}
