package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceLinkedinAdsCredentialsAccessTokenAuthMethodEnum {
    ACCESS_TOKEN("access_token");

    @JsonValue
    public final String value;

    private SourceLinkedinAdsCredentialsAccessTokenAuthMethodEnum(String value) {
        this.value = value;
    }
}
