package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceInsightlyInsightlyEnum {
    INSIGHTLY("insightly");

    @JsonValue
    public final String value;

    private SourceInsightlyInsightlyEnum(String value) {
        this.value = value;
    }
}
