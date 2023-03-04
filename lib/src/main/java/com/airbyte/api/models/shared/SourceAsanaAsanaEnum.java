package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceAsanaAsanaEnum {
    ASANA("asana");

    @JsonValue
    public final String value;

    private SourceAsanaAsanaEnum(String value) {
        this.value = value;
    }
}
