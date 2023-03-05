package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceMailchimpCredentialsAPIKey {
    @JsonProperty("apikey")
    public String apikey;
    public SourceMailchimpCredentialsAPIKey withApikey(String apikey) {
        this.apikey = apikey;
        return this;
    }
    
    @JsonProperty("auth_type")
    public SourceMailchimpCredentialsAPIKeyAuthTypeEnum authType;
    public SourceMailchimpCredentialsAPIKey withAuthType(SourceMailchimpCredentialsAPIKeyAuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
}
