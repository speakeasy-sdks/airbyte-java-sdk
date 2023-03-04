package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceFireboltFireboltEnum {
    FIREBOLT("firebolt");

    @JsonValue
    public final String value;

    private SourceFireboltFireboltEnum(String value) {
        this.value = value;
    }
}
