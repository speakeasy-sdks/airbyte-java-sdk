package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceYouniumYouniumEnum {
    YOUNIUM("younium");

    @JsonValue
    public final String value;

    private SourceYouniumYouniumEnum(String value) {
        this.value = value;
    }
}
