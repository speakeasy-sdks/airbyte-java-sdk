package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceMondayCredentialsAPIToken {
    @JsonProperty("api_token")
    public String apiToken;
    public SourceMondayCredentialsAPIToken withApiToken(String apiToken) {
        this.apiToken = apiToken;
        return this;
    }
    
    @JsonProperty("auth_type")
    public SourceMondayCredentialsAPITokenAuthTypeEnum authType;
    public SourceMondayCredentialsAPIToken withAuthType(SourceMondayCredentialsAPITokenAuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
}
