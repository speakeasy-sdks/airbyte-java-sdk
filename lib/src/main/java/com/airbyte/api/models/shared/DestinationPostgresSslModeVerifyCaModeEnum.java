package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationPostgresSslModeVerifyCaModeEnum {
    VERIFY_CA("verify-ca");

    @JsonValue
    public final String value;

    private DestinationPostgresSslModeVerifyCaModeEnum(String value) {
        this.value = value;
    }
}
