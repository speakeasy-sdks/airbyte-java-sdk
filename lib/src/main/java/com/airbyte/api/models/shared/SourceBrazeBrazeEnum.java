package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceBrazeBrazeEnum {
    BRAZE("braze");

    @JsonValue
    public final String value;

    private SourceBrazeBrazeEnum(String value) {
        this.value = value;
    }
}
