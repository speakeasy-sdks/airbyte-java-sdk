package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationGcsFormatAvroApacheAvroCompressionCodecNoCompressionCodecEnum {
    NO_COMPRESSION("no compression");

    @JsonValue
    public final String value;

    private DestinationGcsFormatAvroApacheAvroCompressionCodecNoCompressionCodecEnum(String value) {
        this.value = value;
    }
}
