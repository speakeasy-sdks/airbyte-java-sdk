package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceFacebookMarketingFacebookMarketingEnum {
    FACEBOOK_MARKETING("facebook-marketing");

    @JsonValue
    public final String value;

    private SourceFacebookMarketingFacebookMarketingEnum(String value) {
        this.value = value;
    }
}
