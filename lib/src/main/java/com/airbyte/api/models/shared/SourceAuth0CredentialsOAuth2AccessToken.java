package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceAuth0CredentialsOAuth2AccessToken {
    @JsonProperty("access_token")
    public String accessToken;
    public SourceAuth0CredentialsOAuth2AccessToken withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("auth_type")
    public SourceAuth0CredentialsOAuth2AccessTokenAuthenticationMethodEnum authType;
    public SourceAuth0CredentialsOAuth2AccessToken withAuthType(SourceAuth0CredentialsOAuth2AccessTokenAuthenticationMethodEnum authType) {
        this.authType = authType;
        return this;
    }
    
}
