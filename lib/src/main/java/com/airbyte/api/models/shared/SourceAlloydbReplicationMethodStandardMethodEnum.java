package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceAlloydbReplicationMethodStandardMethodEnum {
    STANDARD("Standard");

    @JsonValue
    public final String value;

    private SourceAlloydbReplicationMethodStandardMethodEnum(String value) {
        this.value = value;
    }
}
