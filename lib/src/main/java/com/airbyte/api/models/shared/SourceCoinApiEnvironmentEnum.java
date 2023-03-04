package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceCoinApiEnvironmentEnum {
    SANDBOX("sandbox"),
    PRODUCTION("production");

    @JsonValue
    public final String value;

    private SourceCoinApiEnvironmentEnum(String value) {
        this.value = value;
    }
}
