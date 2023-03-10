package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceLinkedinAdsCredentialsOAuth20AuthMethodEnum {
    O_AUTH20("oAuth2.0");

    @JsonValue
    public final String value;

    private SourceLinkedinAdsCredentialsOAuth20AuthMethodEnum(String value) {
        this.value = value;
    }
}
