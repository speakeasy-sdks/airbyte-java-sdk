package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceKlarnaKlarnaEnum {
    KLARNA("klarna");

    @JsonValue
    public final String value;

    private SourceKlarnaKlarnaEnum(String value) {
        this.value = value;
    }
}
