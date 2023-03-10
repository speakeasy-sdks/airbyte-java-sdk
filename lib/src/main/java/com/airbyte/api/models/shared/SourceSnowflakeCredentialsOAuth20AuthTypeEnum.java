package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceSnowflakeCredentialsOAuth20AuthTypeEnum {
    O_AUTH("OAuth");

    @JsonValue
    public final String value;

    private SourceSnowflakeCredentialsOAuth20AuthTypeEnum(String value) {
        this.value = value;
    }
}
