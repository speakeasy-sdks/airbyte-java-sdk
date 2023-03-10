package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceOpenweatherOpenweatherEnum {
    OPENWEATHER("openweather");

    @JsonValue
    public final String value;

    private SourceOpenweatherOpenweatherEnum(String value) {
        this.value = value;
    }
}
