package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationGcsFormatParquetColumnarStorageFormatTypeEnum {
    PARQUET("Parquet");

    @JsonValue
    public final String value;

    private DestinationGcsFormatParquetColumnarStorageFormatTypeEnum(String value) {
        this.value = value;
    }
}
