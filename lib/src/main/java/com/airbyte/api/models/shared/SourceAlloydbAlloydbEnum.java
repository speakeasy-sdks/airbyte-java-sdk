package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceAlloydbAlloydbEnum {
    ALLOYDB("alloydb");

    @JsonValue
    public final String value;

    private SourceAlloydbAlloydbEnum(String value) {
        this.value = value;
    }
}
