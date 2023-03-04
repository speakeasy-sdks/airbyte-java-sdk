package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceGridlyGridlyEnum {
    GRIDLY("gridly");

    @JsonValue
    public final String value;

    private SourceGridlyGridlyEnum(String value) {
        this.value = value;
    }
}
