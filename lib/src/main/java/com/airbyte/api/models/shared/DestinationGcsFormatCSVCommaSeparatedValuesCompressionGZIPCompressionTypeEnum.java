package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationGcsFormatCSVCommaSeparatedValuesCompressionGZIPCompressionTypeEnum {
    GZIP("GZIP");

    @JsonValue
    public final String value;

    private DestinationGcsFormatCSVCommaSeparatedValuesCompressionGZIPCompressionTypeEnum(String value) {
        this.value = value;
    }
}
