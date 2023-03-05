package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationPostgresSslModeVerifyFullModeEnum {
    VERIFY_FULL("verify-full");

    @JsonValue
    public final String value;

    private DestinationPostgresSslModeVerifyFullModeEnum(String value) {
        this.value = value;
    }
}
