package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationGcsFormatAvroApacheAvroCompressionCodecSnappyCodecEnum {
    SNAPPY("snappy");

    @JsonValue
    public final String value;

    private DestinationGcsFormatAvroApacheAvroCompressionCodecSnappyCodecEnum(String value) {
        this.value = value;
    }
}
