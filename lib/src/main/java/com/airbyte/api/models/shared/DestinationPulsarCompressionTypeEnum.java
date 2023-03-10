package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationPulsarCompressionTypeEnum {
    NONE("NONE"),
    LZ4("LZ4"),
    ZLIB("ZLIB"),
    ZSTD("ZSTD"),
    SNAPPY("SNAPPY");

    @JsonValue
    public final String value;

    private DestinationPulsarCompressionTypeEnum(String value) {
        this.value = value;
    }
}
