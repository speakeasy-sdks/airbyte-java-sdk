package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationS3FormatAvroApacheAvroCompressionCodecSnappyCodecEnum {
    SNAPPY("snappy");

    @JsonValue
    public final String value;

    private DestinationS3FormatAvroApacheAvroCompressionCodecSnappyCodecEnum(String value) {
        this.value = value;
    }
}
