package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceSlackCredentialsAPIToken
 * Choose how to authenticate into Slack
**/
public class SourceSlackCredentialsAPIToken {
    @JsonProperty("api_token")
    public String apiToken;
    public SourceSlackCredentialsAPIToken withApiToken(String apiToken) {
        this.apiToken = apiToken;
        return this;
    }
    
    @JsonProperty("option_title")
    public SourceSlackCredentialsAPITokenOptionTitleEnum optionTitle;
    public SourceSlackCredentialsAPIToken withOptionTitle(SourceSlackCredentialsAPITokenOptionTitleEnum optionTitle) {
        this.optionTitle = optionTitle;
        return this;
    }
    
}
