package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceShopifyCredentialsOAuth20
 * OAuth2.0
**/
public class SourceShopifyCredentialsOAuth20 {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access_token")
    public String accessToken;
    public SourceShopifyCredentialsOAuth20 withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("auth_method")
    public SourceShopifyCredentialsOAuth20AuthMethodEnum authMethod;
    public SourceShopifyCredentialsOAuth20 withAuthMethod(SourceShopifyCredentialsOAuth20AuthMethodEnum authMethod) {
        this.authMethod = authMethod;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_id")
    public String clientId;
    public SourceShopifyCredentialsOAuth20 withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourceShopifyCredentialsOAuth20 withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
}
