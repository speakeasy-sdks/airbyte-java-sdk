package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceQualarooQualarooEnum {
    QUALAROO("qualaroo");

    @JsonValue
    public final String value;

    private SourceQualarooQualarooEnum(String value) {
        this.value = value;
    }
}
