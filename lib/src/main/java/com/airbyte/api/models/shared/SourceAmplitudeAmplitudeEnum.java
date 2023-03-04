package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceAmplitudeAmplitudeEnum {
    AMPLITUDE("amplitude");

    @JsonValue
    public final String value;

    private SourceAmplitudeAmplitudeEnum(String value) {
        this.value = value;
    }
}
