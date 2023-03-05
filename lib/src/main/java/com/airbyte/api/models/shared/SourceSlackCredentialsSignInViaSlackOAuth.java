package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceSlackCredentialsSignInViaSlackOAuth
 * Choose how to authenticate into Slack
**/
public class SourceSlackCredentialsSignInViaSlackOAuth {
    @JsonProperty("access_token")
    public String accessToken;
    public SourceSlackCredentialsSignInViaSlackOAuth withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("client_id")
    public String clientId;
    public SourceSlackCredentialsSignInViaSlackOAuth withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourceSlackCredentialsSignInViaSlackOAuth withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    @JsonProperty("option_title")
    public SourceSlackCredentialsSignInViaSlackOAuthOptionTitleEnum optionTitle;
    public SourceSlackCredentialsSignInViaSlackOAuth withOptionTitle(SourceSlackCredentialsSignInViaSlackOAuthOptionTitleEnum optionTitle) {
        this.optionTitle = optionTitle;
        return this;
    }
    
}
