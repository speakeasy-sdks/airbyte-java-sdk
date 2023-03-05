package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceSquareCredentialsOauthAuthentication
 * Choose how to authenticate to Square.
**/
public class SourceSquareCredentialsOauthAuthentication {
    @JsonProperty("client_id")
    public String clientId;
    public SourceSquareCredentialsOauthAuthentication withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourceSquareCredentialsOauthAuthentication withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials_title")
    public SourceSquareCredentialsOauthAuthenticationCredentialsTitleEnum credentialsTitle;
    public SourceSquareCredentialsOauthAuthentication withCredentialsTitle(SourceSquareCredentialsOauthAuthenticationCredentialsTitleEnum credentialsTitle) {
        this.credentialsTitle = credentialsTitle;
        return this;
    }
    
    @JsonProperty("refresh_token")
    public String refreshToken;
    public SourceSquareCredentialsOauthAuthentication withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
}
