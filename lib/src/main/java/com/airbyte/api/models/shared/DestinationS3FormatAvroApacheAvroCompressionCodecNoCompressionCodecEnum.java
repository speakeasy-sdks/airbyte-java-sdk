package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationS3FormatAvroApacheAvroCompressionCodecNoCompressionCodecEnum {
    NO_COMPRESSION("no compression");

    @JsonValue
    public final String value;

    private DestinationS3FormatAvroApacheAvroCompressionCodecNoCompressionCodecEnum(String value) {
        this.value = value;
    }
}
