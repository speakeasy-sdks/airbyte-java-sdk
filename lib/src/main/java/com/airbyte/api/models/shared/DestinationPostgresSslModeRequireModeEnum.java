package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationPostgresSslModeRequireModeEnum {
    REQUIRE("require");

    @JsonValue
    public final String value;

    private DestinationPostgresSslModeRequireModeEnum(String value) {
        this.value = value;
    }
}
