package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceAirtableCredentialsAPIKey {
    @JsonProperty("api_key")
    public String apiKey;
    public SourceAirtableCredentialsAPIKey withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_method")
    public SourceAirtableCredentialsAPIKeyAuthMethodEnum authMethod;
    public SourceAirtableCredentialsAPIKey withAuthMethod(SourceAirtableCredentialsAPIKeyAuthMethodEnum authMethod) {
        this.authMethod = authMethod;
        return this;
    }
    
}
