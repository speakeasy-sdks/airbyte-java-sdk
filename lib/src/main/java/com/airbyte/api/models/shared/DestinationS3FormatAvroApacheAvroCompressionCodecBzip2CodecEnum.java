package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationS3FormatAvroApacheAvroCompressionCodecBzip2CodecEnum {
    BZIP2("bzip2");

    @JsonValue
    public final String value;

    private DestinationS3FormatAvroApacheAvroCompressionCodecBzip2CodecEnum(String value) {
        this.value = value;
    }
}
