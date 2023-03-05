package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationS3FormatAvroApacheAvroCompressionCodecZstandardCodecEnum {
    ZSTANDARD("zstandard");

    @JsonValue
    public final String value;

    private DestinationS3FormatAvroApacheAvroCompressionCodecZstandardCodecEnum(String value) {
        this.value = value;
    }
}
