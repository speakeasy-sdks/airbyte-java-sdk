package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationKeenKeenEnum {
    KEEN("keen");

    @JsonValue
    public final String value;

    private DestinationKeenKeenEnum(String value) {
        this.value = value;
    }
}
