package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMixpanelCredentialsServiceAccount
 * Choose how to authenticate to Mixpanel
**/
public class SourceMixpanelCredentialsServiceAccount {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("option_title")
    public SourceMixpanelCredentialsServiceAccountOptionTitleEnum optionTitle;
    public SourceMixpanelCredentialsServiceAccount withOptionTitle(SourceMixpanelCredentialsServiceAccountOptionTitleEnum optionTitle) {
        this.optionTitle = optionTitle;
        return this;
    }
    
    @JsonProperty("secret")
    public String secret;
    public SourceMixpanelCredentialsServiceAccount withSecret(String secret) {
        this.secret = secret;
        return this;
    }
    
    @JsonProperty("username")
    public String username;
    public SourceMixpanelCredentialsServiceAccount withUsername(String username) {
        this.username = username;
        return this;
    }
    
}
