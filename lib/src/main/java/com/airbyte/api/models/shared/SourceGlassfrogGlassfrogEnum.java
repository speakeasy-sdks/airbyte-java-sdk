package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceGlassfrogGlassfrogEnum {
    GLASSFROG("glassfrog");

    @JsonValue
    public final String value;

    private SourceGlassfrogGlassfrogEnum(String value) {
        this.value = value;
    }
}
