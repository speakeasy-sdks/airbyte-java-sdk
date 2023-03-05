package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceHubspotCredentialsOAuth
 * Choose how to authenticate to HubSpot.
**/
public class SourceHubspotCredentialsOAuth {
    @JsonProperty("client_id")
    public String clientId;
    public SourceHubspotCredentialsOAuth withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourceHubspotCredentialsOAuth withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    @JsonProperty("credentials_title")
    public SourceHubspotCredentialsOAuthCredentialsEnum credentialsTitle;
    public SourceHubspotCredentialsOAuth withCredentialsTitle(SourceHubspotCredentialsOAuthCredentialsEnum credentialsTitle) {
        this.credentialsTitle = credentialsTitle;
        return this;
    }
    
    @JsonProperty("refresh_token")
    public String refreshToken;
    public SourceHubspotCredentialsOAuth withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
}
