package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceSmartsheetsCredentialsOAuth20AuthTypeEnum {
    OAUTH20("oauth2.0");

    @JsonValue
    public final String value;

    private SourceSmartsheetsCredentialsOAuth20AuthTypeEnum(String value) {
        this.value = value;
    }
}
