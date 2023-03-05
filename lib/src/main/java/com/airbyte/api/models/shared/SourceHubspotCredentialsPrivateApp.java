package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceHubspotCredentialsPrivateApp
 * Choose how to authenticate to HubSpot.
**/
public class SourceHubspotCredentialsPrivateApp {
    @JsonProperty("access_token")
    public String accessToken;
    public SourceHubspotCredentialsPrivateApp withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("credentials_title")
    public SourceHubspotCredentialsPrivateAppCredentialsEnum credentialsTitle;
    public SourceHubspotCredentialsPrivateApp withCredentialsTitle(SourceHubspotCredentialsPrivateAppCredentialsEnum credentialsTitle) {
        this.credentialsTitle = credentialsTitle;
        return this;
    }
    
}
