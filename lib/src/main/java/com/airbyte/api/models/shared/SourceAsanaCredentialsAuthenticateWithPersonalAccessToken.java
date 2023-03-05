package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceAsanaCredentialsAuthenticateWithPersonalAccessToken
 * Choose how to authenticate to Github
**/
public class SourceAsanaCredentialsAuthenticateWithPersonalAccessToken {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("option_title")
    public SourceAsanaCredentialsAuthenticateWithPersonalAccessTokenCredentialsTitleEnum optionTitle;
    public SourceAsanaCredentialsAuthenticateWithPersonalAccessToken withOptionTitle(SourceAsanaCredentialsAuthenticateWithPersonalAccessTokenCredentialsTitleEnum optionTitle) {
        this.optionTitle = optionTitle;
        return this;
    }
    
    @JsonProperty("personal_access_token")
    public String personalAccessToken;
    public SourceAsanaCredentialsAuthenticateWithPersonalAccessToken withPersonalAccessToken(String personalAccessToken) {
        this.personalAccessToken = personalAccessToken;
        return this;
    }
    
}
