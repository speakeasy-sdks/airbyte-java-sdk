package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceSquareSquareEnum {
    SQUARE("square");

    @JsonValue
    public final String value;

    private SourceSquareSquareEnum(String value) {
        this.value = value;
    }
}
