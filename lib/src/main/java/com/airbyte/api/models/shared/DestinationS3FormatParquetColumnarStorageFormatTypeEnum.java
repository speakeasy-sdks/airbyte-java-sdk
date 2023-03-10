package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationS3FormatParquetColumnarStorageFormatTypeEnum {
    PARQUET("Parquet");

    @JsonValue
    public final String value;

    private DestinationS3FormatParquetColumnarStorageFormatTypeEnum(String value) {
        this.value = value;
    }
}
