package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationS3FormatCSVCommaSeparatedValuesFormatTypeEnum {
    CSV("CSV");

    @JsonValue
    public final String value;

    private DestinationS3FormatCSVCommaSeparatedValuesFormatTypeEnum(String value) {
        this.value = value;
    }
}
