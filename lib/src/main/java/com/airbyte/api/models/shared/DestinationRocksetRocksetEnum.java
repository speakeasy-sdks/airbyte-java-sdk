package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationRocksetRocksetEnum {
    ROCKSET("rockset");

    @JsonValue
    public final String value;

    private DestinationRocksetRocksetEnum(String value) {
        this.value = value;
    }
}
