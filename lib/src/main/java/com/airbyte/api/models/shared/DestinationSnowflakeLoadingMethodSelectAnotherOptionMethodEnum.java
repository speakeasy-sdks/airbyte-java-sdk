package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationSnowflakeLoadingMethodSelectAnotherOptionMethodEnum {
    STANDARD("Standard");

    @JsonValue
    public final String value;

    private DestinationSnowflakeLoadingMethodSelectAnotherOptionMethodEnum(String value) {
        this.value = value;
    }
}
