package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceNotionCredentialsOAuth20
 * Pick an authentication method.
**/
public class SourceNotionCredentialsOAuth20 {
    @JsonProperty("access_token")
    public String accessToken;
    public SourceNotionCredentialsOAuth20 withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("auth_type")
    public SourceNotionCredentialsOAuth20AuthTypeEnum authType;
    public SourceNotionCredentialsOAuth20 withAuthType(SourceNotionCredentialsOAuth20AuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
    @JsonProperty("client_id")
    public String clientId;
    public SourceNotionCredentialsOAuth20 withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourceNotionCredentialsOAuth20 withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
}
