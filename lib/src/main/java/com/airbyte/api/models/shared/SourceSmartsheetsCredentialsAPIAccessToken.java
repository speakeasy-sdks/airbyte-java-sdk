package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceSmartsheetsCredentialsAPIAccessToken {
    @JsonProperty("access_token")
    public String accessToken;
    public SourceSmartsheetsCredentialsAPIAccessToken withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    public SourceSmartsheetsCredentialsAPIAccessTokenAuthTypeEnum authType;
    public SourceSmartsheetsCredentialsAPIAccessToken withAuthType(SourceSmartsheetsCredentialsAPIAccessTokenAuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
}
