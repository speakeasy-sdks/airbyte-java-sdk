package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceDelightedDelightedEnum {
    DELIGHTED("delighted");

    @JsonValue
    public final String value;

    private SourceDelightedDelightedEnum(String value) {
        this.value = value;
    }
}
