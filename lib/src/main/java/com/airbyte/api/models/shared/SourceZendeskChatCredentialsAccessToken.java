package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceZendeskChatCredentialsAccessToken {
    @JsonProperty("access_token")
    public String accessToken;
    public SourceZendeskChatCredentialsAccessToken withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("credentials")
    public SourceZendeskChatCredentialsAccessTokenCredentialsEnum credentials;
    public SourceZendeskChatCredentialsAccessToken withCredentials(SourceZendeskChatCredentialsAccessTokenCredentialsEnum credentials) {
        this.credentials = credentials;
        return this;
    }
    
}
