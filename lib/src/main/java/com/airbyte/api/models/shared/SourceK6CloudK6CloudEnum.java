package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceK6CloudK6CloudEnum {
    K6_CLOUD("k6-cloud");

    @JsonValue
    public final String value;

    private SourceK6CloudK6CloudEnum(String value) {
        this.value = value;
    }
}
