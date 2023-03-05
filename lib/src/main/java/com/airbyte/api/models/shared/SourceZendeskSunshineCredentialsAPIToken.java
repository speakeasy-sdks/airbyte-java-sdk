package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceZendeskSunshineCredentialsAPIToken {
    @JsonProperty("api_token")
    public String apiToken;
    public SourceZendeskSunshineCredentialsAPIToken withApiToken(String apiToken) {
        this.apiToken = apiToken;
        return this;
    }
    
    @JsonProperty("auth_method")
    public SourceZendeskSunshineCredentialsAPITokenAuthMethodEnum authMethod;
    public SourceZendeskSunshineCredentialsAPIToken withAuthMethod(SourceZendeskSunshineCredentialsAPITokenAuthMethodEnum authMethod) {
        this.authMethod = authMethod;
        return this;
    }
    
    @JsonProperty("email")
    public String email;
    public SourceZendeskSunshineCredentialsAPIToken withEmail(String email) {
        this.email = email;
        return this;
    }
    
}
