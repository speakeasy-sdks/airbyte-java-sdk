package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceZendeskSunshineCredentialsOAuth20 {
    @JsonProperty("access_token")
    public String accessToken;
    public SourceZendeskSunshineCredentialsOAuth20 withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("auth_method")
    public SourceZendeskSunshineCredentialsOAuth20AuthMethodEnum authMethod;
    public SourceZendeskSunshineCredentialsOAuth20 withAuthMethod(SourceZendeskSunshineCredentialsOAuth20AuthMethodEnum authMethod) {
        this.authMethod = authMethod;
        return this;
    }
    
    @JsonProperty("client_id")
    public String clientId;
    public SourceZendeskSunshineCredentialsOAuth20 withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourceZendeskSunshineCredentialsOAuth20 withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
}
