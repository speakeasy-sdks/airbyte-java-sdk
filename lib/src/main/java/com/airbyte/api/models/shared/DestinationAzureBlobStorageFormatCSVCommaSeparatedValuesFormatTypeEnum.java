package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationAzureBlobStorageFormatCSVCommaSeparatedValuesFormatTypeEnum {
    CSV("CSV");

    @JsonValue
    public final String value;

    private DestinationAzureBlobStorageFormatCSVCommaSeparatedValuesFormatTypeEnum(String value) {
        this.value = value;
    }
}
