package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceRetentlyRetentlyEnum {
    RETENTLY("retently");

    @JsonValue
    public final String value;

    private SourceRetentlyRetentlyEnum(String value) {
        this.value = value;
    }
}
