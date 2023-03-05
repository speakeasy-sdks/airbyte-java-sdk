package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationGcsFormatAvroApacheAvroCompressionCodecDeflateCodecEnum {
    DEFLATE("Deflate");

    @JsonValue
    public final String value;

    private DestinationGcsFormatAvroApacheAvroCompressionCodecDeflateCodecEnum(String value) {
        this.value = value;
    }
}
