package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceLinnworksLinnworksEnum {
    LINNWORKS("linnworks");

    @JsonValue
    public final String value;

    private SourceLinnworksLinnworksEnum(String value) {
        this.value = value;
    }
}
