package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMixpanelCredentialsProjectSecret
 * Choose how to authenticate to Mixpanel
**/
public class SourceMixpanelCredentialsProjectSecret {
    @JsonProperty("api_secret")
    public String apiSecret;
    public SourceMixpanelCredentialsProjectSecret withApiSecret(String apiSecret) {
        this.apiSecret = apiSecret;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("option_title")
    public SourceMixpanelCredentialsProjectSecretOptionTitleEnum optionTitle;
    public SourceMixpanelCredentialsProjectSecret withOptionTitle(SourceMixpanelCredentialsProjectSecretOptionTitleEnum optionTitle) {
        this.optionTitle = optionTitle;
        return this;
    }
    
}
