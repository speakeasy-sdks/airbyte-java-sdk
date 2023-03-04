package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceRailzRailzEnum {
    RAILZ("railz");

    @JsonValue
    public final String value;

    private SourceRailzRailzEnum(String value) {
        this.value = value;
    }
}
