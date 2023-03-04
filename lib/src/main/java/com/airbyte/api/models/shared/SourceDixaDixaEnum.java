package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceDixaDixaEnum {
    DIXA("dixa");

    @JsonValue
    public final String value;

    private SourceDixaDixaEnum(String value) {
        this.value = value;
    }
}
