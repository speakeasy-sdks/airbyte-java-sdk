package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationGcsFormatAvroApacheAvroCompressionCodecBzip2CodecEnum {
    BZIP2("bzip2");

    @JsonValue
    public final String value;

    private DestinationGcsFormatAvroApacheAvroCompressionCodecBzip2CodecEnum(String value) {
        this.value = value;
    }
}
