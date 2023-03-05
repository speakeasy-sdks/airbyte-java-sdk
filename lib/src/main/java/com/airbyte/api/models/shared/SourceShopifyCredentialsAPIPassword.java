package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceShopifyCredentialsAPIPassword
 * API Password Auth
**/
public class SourceShopifyCredentialsAPIPassword {
    @JsonProperty("api_password")
    public String apiPassword;
    public SourceShopifyCredentialsAPIPassword withApiPassword(String apiPassword) {
        this.apiPassword = apiPassword;
        return this;
    }
    
    @JsonProperty("auth_method")
    public SourceShopifyCredentialsAPIPasswordAuthMethodEnum authMethod;
    public SourceShopifyCredentialsAPIPassword withAuthMethod(SourceShopifyCredentialsAPIPasswordAuthMethodEnum authMethod) {
        this.authMethod = authMethod;
        return this;
    }
    
}
