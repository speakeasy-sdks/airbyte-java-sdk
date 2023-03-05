package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceOktaCredentialsAPIToken {
    @JsonProperty("api_token")
    public String apiToken;
    public SourceOktaCredentialsAPIToken withApiToken(String apiToken) {
        this.apiToken = apiToken;
        return this;
    }
    
    @JsonProperty("auth_type")
    public SourceOktaCredentialsAPITokenAuthTypeEnum authType;
    public SourceOktaCredentialsAPIToken withAuthType(SourceOktaCredentialsAPITokenAuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
}
