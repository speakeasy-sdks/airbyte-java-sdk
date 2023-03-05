package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourcePinterestCredentialsAccessToken {
    @JsonProperty("access_token")
    public String accessToken;
    public SourcePinterestCredentialsAccessToken withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("auth_method")
    public SourcePinterestCredentialsAccessTokenAuthMethodEnum authMethod;
    public SourcePinterestCredentialsAccessToken withAuthMethod(SourcePinterestCredentialsAccessTokenAuthMethodEnum authMethod) {
        this.authMethod = authMethod;
        return this;
    }
    
}
