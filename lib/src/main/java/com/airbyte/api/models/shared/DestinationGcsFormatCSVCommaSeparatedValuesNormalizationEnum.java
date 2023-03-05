package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationGcsFormatCSVCommaSeparatedValuesNormalizationEnum {
    NO_FLATTENING("No flattening"),
    ROOT_LEVEL_FLATTENING("Root level flattening");

    @JsonValue
    public final String value;

    private DestinationGcsFormatCSVCommaSeparatedValuesNormalizationEnum(String value) {
        this.value = value;
    }
}
