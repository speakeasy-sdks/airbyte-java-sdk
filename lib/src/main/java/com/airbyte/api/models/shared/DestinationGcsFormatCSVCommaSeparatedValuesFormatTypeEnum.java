package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationGcsFormatCSVCommaSeparatedValuesFormatTypeEnum {
    CSV("CSV");

    @JsonValue
    public final String value;

    private DestinationGcsFormatCSVCommaSeparatedValuesFormatTypeEnum(String value) {
        this.value = value;
    }
}
