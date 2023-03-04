package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceGetlagoGetlagoEnum {
    GETLAGO("getlago");

    @JsonValue
    public final String value;

    private SourceGetlagoGetlagoEnum(String value) {
        this.value = value;
    }
}
