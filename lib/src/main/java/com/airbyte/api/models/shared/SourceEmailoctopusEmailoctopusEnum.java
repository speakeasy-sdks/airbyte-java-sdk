package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceEmailoctopusEmailoctopusEnum {
    EMAILOCTOPUS("emailoctopus");

    @JsonValue
    public final String value;

    private SourceEmailoctopusEmailoctopusEnum(String value) {
        this.value = value;
    }
}
