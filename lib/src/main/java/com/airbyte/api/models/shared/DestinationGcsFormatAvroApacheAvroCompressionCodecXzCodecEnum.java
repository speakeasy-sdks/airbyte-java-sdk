package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationGcsFormatAvroApacheAvroCompressionCodecXzCodecEnum {
    XZ("xz");

    @JsonValue
    public final String value;

    private DestinationGcsFormatAvroApacheAvroCompressionCodecXzCodecEnum(String value) {
        this.value = value;
    }
}
