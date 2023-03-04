package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceSecodaSecodaEnum {
    SECODA("secoda");

    @JsonValue
    public final String value;

    private SourceSecodaSecodaEnum(String value) {
        this.value = value;
    }
}
