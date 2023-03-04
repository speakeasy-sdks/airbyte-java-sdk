package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceClickupApiClickupApiEnum {
    CLICKUP_API("clickup-api");

    @JsonValue
    public final String value;

    private SourceClickupApiClickupApiEnum(String value) {
        this.value = value;
    }
}
