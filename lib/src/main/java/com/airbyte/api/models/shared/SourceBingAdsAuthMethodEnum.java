package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceBingAdsAuthMethodEnum {
    OAUTH20("oauth2.0");

    @JsonValue
    public final String value;

    private SourceBingAdsAuthMethodEnum(String value) {
        this.value = value;
    }
}
