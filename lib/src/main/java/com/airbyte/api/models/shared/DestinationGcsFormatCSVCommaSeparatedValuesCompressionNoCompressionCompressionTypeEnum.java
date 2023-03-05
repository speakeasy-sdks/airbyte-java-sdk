package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationGcsFormatCSVCommaSeparatedValuesCompressionNoCompressionCompressionTypeEnum {
    NO_COMPRESSION("No Compression");

    @JsonValue
    public final String value;

    private DestinationGcsFormatCSVCommaSeparatedValuesCompressionNoCompressionCompressionTypeEnum(String value) {
        this.value = value;
    }
}
