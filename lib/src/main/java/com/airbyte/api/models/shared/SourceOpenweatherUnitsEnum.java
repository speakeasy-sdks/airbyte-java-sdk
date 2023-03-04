package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceOpenweatherUnitsEnum {
    STANDARD("standard"),
    METRIC("metric"),
    IMPERIAL("imperial");

    @JsonValue
    public final String value;

    private SourceOpenweatherUnitsEnum(String value) {
        this.value = value;
    }
}
