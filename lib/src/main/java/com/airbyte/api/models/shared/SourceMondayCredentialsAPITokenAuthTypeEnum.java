package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceMondayCredentialsAPITokenAuthTypeEnum {
    API_TOKEN("api_token");

    @JsonValue
    public final String value;

    private SourceMondayCredentialsAPITokenAuthTypeEnum(String value) {
        this.value = value;
    }
}
