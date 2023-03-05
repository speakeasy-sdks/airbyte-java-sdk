package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceLinkedinAdsCredentialsAccessToken {
    @JsonProperty("access_token")
    public String accessToken;
    public SourceLinkedinAdsCredentialsAccessToken withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_method")
    public SourceLinkedinAdsCredentialsAccessTokenAuthMethodEnum authMethod;
    public SourceLinkedinAdsCredentialsAccessToken withAuthMethod(SourceLinkedinAdsCredentialsAccessTokenAuthMethodEnum authMethod) {
        this.authMethod = authMethod;
        return this;
    }
    
}
