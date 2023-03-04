package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceTypeformTypeformEnum {
    TYPEFORM("typeform");

    @JsonValue
    public final String value;

    private SourceTypeformTypeformEnum(String value) {
        this.value = value;
    }
}
