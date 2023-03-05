package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceNotionCredentialsAccessToken
 * Pick an authentication method.
**/
public class SourceNotionCredentialsAccessToken {
    @JsonProperty("auth_type")
    public SourceNotionCredentialsAccessTokenAuthTypeEnum authType;
    public SourceNotionCredentialsAccessToken withAuthType(SourceNotionCredentialsAccessTokenAuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
    @JsonProperty("token")
    public String token;
    public SourceNotionCredentialsAccessToken withToken(String token) {
        this.token = token;
        return this;
    }
    
}
