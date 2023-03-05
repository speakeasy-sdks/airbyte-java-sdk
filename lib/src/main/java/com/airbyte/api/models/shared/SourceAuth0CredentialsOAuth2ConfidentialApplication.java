package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceAuth0CredentialsOAuth2ConfidentialApplication {
    @JsonProperty("audience")
    public String audience;
    public SourceAuth0CredentialsOAuth2ConfidentialApplication withAudience(String audience) {
        this.audience = audience;
        return this;
    }
    
    @JsonProperty("auth_type")
    public SourceAuth0CredentialsOAuth2ConfidentialApplicationAuthenticationMethodEnum authType;
    public SourceAuth0CredentialsOAuth2ConfidentialApplication withAuthType(SourceAuth0CredentialsOAuth2ConfidentialApplicationAuthenticationMethodEnum authType) {
        this.authType = authType;
        return this;
    }
    
    @JsonProperty("client_id")
    public String clientId;
    public SourceAuth0CredentialsOAuth2ConfidentialApplication withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourceAuth0CredentialsOAuth2ConfidentialApplication withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
}
