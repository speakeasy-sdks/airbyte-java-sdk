package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceAsanaCredentialsAuthenticateViaAsanaOauth
 * Choose how to authenticate to Github
**/
public class SourceAsanaCredentialsAuthenticateViaAsanaOauth {
    @JsonProperty("client_id")
    public String clientId;
    public SourceAsanaCredentialsAuthenticateViaAsanaOauth withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourceAsanaCredentialsAuthenticateViaAsanaOauth withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("option_title")
    public SourceAsanaCredentialsAuthenticateViaAsanaOauthCredentialsTitleEnum optionTitle;
    public SourceAsanaCredentialsAuthenticateViaAsanaOauth withOptionTitle(SourceAsanaCredentialsAuthenticateViaAsanaOauthCredentialsTitleEnum optionTitle) {
        this.optionTitle = optionTitle;
        return this;
    }
    
    @JsonProperty("refresh_token")
    public String refreshToken;
    public SourceAsanaCredentialsAuthenticateViaAsanaOauth withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
}
