package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceSmartsheetsCredentialsAPIAccessTokenAuthTypeEnum {
    ACCESS_TOKEN("access_token");

    @JsonValue
    public final String value;

    private SourceSmartsheetsCredentialsAPIAccessTokenAuthTypeEnum(String value) {
        this.value = value;
    }
}
