package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationRedisSslModeDisableModeEnum {
    DISABLE("disable");

    @JsonValue
    public final String value;

    private DestinationRedisSslModeDisableModeEnum(String value) {
        this.value = value;
    }
}
