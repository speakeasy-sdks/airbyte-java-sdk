package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceSquareCredentialsAPIKey
 * Choose how to authenticate to Square.
**/
public class SourceSquareCredentialsAPIKey {
    @JsonProperty("api_key")
    public String apiKey;
    public SourceSquareCredentialsAPIKey withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials_title")
    public SourceSquareCredentialsAPIKeyCredentialsTitleEnum credentialsTitle;
    public SourceSquareCredentialsAPIKey withCredentialsTitle(SourceSquareCredentialsAPIKeyCredentialsTitleEnum credentialsTitle) {
        this.credentialsTitle = credentialsTitle;
        return this;
    }
    
}
