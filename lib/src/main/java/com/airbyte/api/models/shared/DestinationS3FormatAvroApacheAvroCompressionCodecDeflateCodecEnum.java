package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationS3FormatAvroApacheAvroCompressionCodecDeflateCodecEnum {
    DEFLATE("Deflate");

    @JsonValue
    public final String value;

    private DestinationS3FormatAvroApacheAvroCompressionCodecDeflateCodecEnum(String value) {
        this.value = value;
    }
}
