package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceCodaCodaEnum {
    CODA("coda");

    @JsonValue
    public final String value;

    private SourceCodaCodaEnum(String value) {
        this.value = value;
    }
}
