package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceZenloopZenloopEnum {
    ZENLOOP("zenloop");

    @JsonValue
    public final String value;

    private SourceZenloopZenloopEnum(String value) {
        this.value = value;
    }
}
