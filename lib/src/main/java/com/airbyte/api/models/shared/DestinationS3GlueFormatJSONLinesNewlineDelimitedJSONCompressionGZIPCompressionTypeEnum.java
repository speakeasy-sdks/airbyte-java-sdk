package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONCompressionGZIPCompressionTypeEnum {
    GZIP("GZIP");

    @JsonValue
    public final String value;

    private DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONCompressionGZIPCompressionTypeEnum(String value) {
        this.value = value;
    }
}
