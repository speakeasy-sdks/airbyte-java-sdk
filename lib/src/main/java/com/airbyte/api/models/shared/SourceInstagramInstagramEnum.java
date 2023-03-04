package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceInstagramInstagramEnum {
    INSTAGRAM("instagram");

    @JsonValue
    public final String value;

    private SourceInstagramInstagramEnum(String value) {
        this.value = value;
    }
}
