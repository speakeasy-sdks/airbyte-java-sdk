package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationGcsFormatAvroApacheAvroCompressionCodecZstandardCodecEnum {
    ZSTANDARD("zstandard");

    @JsonValue
    public final String value;

    private DestinationGcsFormatAvroApacheAvroCompressionCodecZstandardCodecEnum(String value) {
        this.value = value;
    }
}
