package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceOrbitOrbitEnum {
    ORBIT("orbit");

    @JsonValue
    public final String value;

    private SourceOrbitOrbitEnum(String value) {
        this.value = value;
    }
}
