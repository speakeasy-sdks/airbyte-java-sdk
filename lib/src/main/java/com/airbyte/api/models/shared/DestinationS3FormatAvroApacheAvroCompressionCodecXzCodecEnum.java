package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationS3FormatAvroApacheAvroCompressionCodecXzCodecEnum {
    XZ("xz");

    @JsonValue
    public final String value;

    private DestinationS3FormatAvroApacheAvroCompressionCodecXzCodecEnum(String value) {
        this.value = value;
    }
}
