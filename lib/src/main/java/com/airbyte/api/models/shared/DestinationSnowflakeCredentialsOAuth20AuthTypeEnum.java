package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationSnowflakeCredentialsOAuth20AuthTypeEnum {
    O_AUTH20("OAuth2.0");

    @JsonValue
    public final String value;

    private DestinationSnowflakeCredentialsOAuth20AuthTypeEnum(String value) {
        this.value = value;
    }
}
