package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceTempoTempoEnum {
    TEMPO("tempo");

    @JsonValue
    public final String value;

    private SourceTempoTempoEnum(String value) {
        this.value = value;
    }
}
