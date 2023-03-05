package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationPostgresSslModeDisableModeEnum {
    DISABLE("disable");

    @JsonValue
    public final String value;

    private DestinationPostgresSslModeDisableModeEnum(String value) {
        this.value = value;
    }
}
