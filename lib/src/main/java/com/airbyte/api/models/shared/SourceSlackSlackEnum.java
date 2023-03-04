package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceSlackSlackEnum {
    SLACK("slack");

    @JsonValue
    public final String value;

    private SourceSlackSlackEnum(String value) {
        this.value = value;
    }
}
