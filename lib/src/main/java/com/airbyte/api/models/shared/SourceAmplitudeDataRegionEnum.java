package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceAmplitudeDataRegionEnum {
    STANDARD_SERVER("Standard Server"),
    EU_RESIDENCY_SERVER("EU Residency Server");

    @JsonValue
    public final String value;

    private SourceAmplitudeDataRegionEnum(String value) {
        this.value = value;
    }
}
