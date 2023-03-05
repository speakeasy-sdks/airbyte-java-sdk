package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceGithubCredentialsPersonalAccessToken
 * Choose how to authenticate to GitHub
**/
public class SourceGithubCredentialsPersonalAccessToken {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("option_title")
    public SourceGithubCredentialsPersonalAccessTokenOptionTitleEnum optionTitle;
    public SourceGithubCredentialsPersonalAccessToken withOptionTitle(SourceGithubCredentialsPersonalAccessTokenOptionTitleEnum optionTitle) {
        this.optionTitle = optionTitle;
        return this;
    }
    
    @JsonProperty("personal_access_token")
    public String personalAccessToken;
    public SourceGithubCredentialsPersonalAccessToken withPersonalAccessToken(String personalAccessToken) {
        this.personalAccessToken = personalAccessToken;
        return this;
    }
    
}
