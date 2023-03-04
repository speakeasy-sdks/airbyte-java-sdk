package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceVantageVantageEnum {
    VANTAGE("vantage");

    @JsonValue
    public final String value;

    private SourceVantageVantageEnum(String value) {
        this.value = value;
    }
}
