package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationS3FormatParquetColumnarStorageCompressionCodecEnum {
    UNCOMPRESSED("UNCOMPRESSED"),
    SNAPPY("SNAPPY"),
    GZIP("GZIP"),
    LZO("LZO"),
    BROTLI("BROTLI"),
    LZ4("LZ4"),
    ZSTD("ZSTD");

    @JsonValue
    public final String value;

    private DestinationS3FormatParquetColumnarStorageCompressionCodecEnum(String value) {
        this.value = value;
    }
}
