package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceMondayMondayEnum {
    MONDAY("monday");

    @JsonValue
    public final String value;

    private SourceMondayMondayEnum(String value) {
        this.value = value;
    }
}
