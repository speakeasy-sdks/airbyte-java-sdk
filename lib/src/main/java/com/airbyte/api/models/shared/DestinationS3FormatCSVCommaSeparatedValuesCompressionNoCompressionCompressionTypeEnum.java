package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationS3FormatCSVCommaSeparatedValuesCompressionNoCompressionCompressionTypeEnum {
    NO_COMPRESSION("No Compression");

    @JsonValue
    public final String value;

    private DestinationS3FormatCSVCommaSeparatedValuesCompressionNoCompressionCompressionTypeEnum(String value) {
        this.value = value;
    }
}
