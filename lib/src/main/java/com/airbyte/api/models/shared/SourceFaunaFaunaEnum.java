package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceFaunaFaunaEnum {
    FAUNA("fauna");

    @JsonValue
    public final String value;

    private SourceFaunaFaunaEnum(String value) {
        this.value = value;
    }
}
