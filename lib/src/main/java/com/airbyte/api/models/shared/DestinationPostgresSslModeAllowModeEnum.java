package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationPostgresSslModeAllowModeEnum {
    ALLOW("allow");

    @JsonValue
    public final String value;

    private DestinationPostgresSslModeAllowModeEnum(String value) {
        this.value = value;
    }
}
