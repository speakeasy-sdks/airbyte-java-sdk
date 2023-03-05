package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationS3FormatCSVCommaSeparatedValuesCompressionGZIPCompressionTypeEnum {
    GZIP("GZIP");

    @JsonValue
    public final String value;

    private DestinationS3FormatCSVCommaSeparatedValuesCompressionGZIPCompressionTypeEnum(String value) {
        this.value = value;
    }
}
