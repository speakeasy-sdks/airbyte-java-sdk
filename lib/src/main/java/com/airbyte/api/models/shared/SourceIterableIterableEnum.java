package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceIterableIterableEnum {
    ITERABLE("iterable");

    @JsonValue
    public final String value;

    private SourceIterableIterableEnum(String value) {
        this.value = value;
    }
}
