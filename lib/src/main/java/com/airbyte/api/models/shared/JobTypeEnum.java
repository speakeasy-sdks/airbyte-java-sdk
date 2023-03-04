package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum JobTypeEnum {
    SYNC("sync"),
    RESET("reset");

    @JsonValue
    public final String value;

    private JobTypeEnum(String value) {
        this.value = value;
    }
}
