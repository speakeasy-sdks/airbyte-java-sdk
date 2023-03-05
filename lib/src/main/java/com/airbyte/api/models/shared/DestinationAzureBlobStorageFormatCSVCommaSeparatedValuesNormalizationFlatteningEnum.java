package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationAzureBlobStorageFormatCSVCommaSeparatedValuesNormalizationFlatteningEnum {
    NO_FLATTENING("No flattening"),
    ROOT_LEVEL_FLATTENING("Root level flattening");

    @JsonValue
    public final String value;

    private DestinationAzureBlobStorageFormatCSVCommaSeparatedValuesNormalizationFlatteningEnum(String value) {
        this.value = value;
    }
}
