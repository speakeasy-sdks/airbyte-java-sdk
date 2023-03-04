package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceSmailySmailyEnum {
    SMAILY("smaily");

    @JsonValue
    public final String value;

    private SourceSmailySmailyEnum(String value) {
        this.value = value;
    }
}
