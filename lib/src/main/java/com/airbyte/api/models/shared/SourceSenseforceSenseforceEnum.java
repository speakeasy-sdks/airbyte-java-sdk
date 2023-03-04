package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceSenseforceSenseforceEnum {
    SENSEFORCE("senseforce");

    @JsonValue
    public final String value;

    private SourceSenseforceSenseforceEnum(String value) {
        this.value = value;
    }
}
