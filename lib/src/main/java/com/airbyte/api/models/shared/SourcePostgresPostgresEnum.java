package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourcePostgresPostgresEnum {
    POSTGRES("postgres");

    @JsonValue
    public final String value;

    private SourcePostgresPostgresEnum(String value) {
        this.value = value;
    }
}
