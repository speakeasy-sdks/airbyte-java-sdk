package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceS3FormatParquetFiletypeEnum {
    PARQUET("parquet");

    @JsonValue
    public final String value;

    private SourceS3FormatParquetFiletypeEnum(String value) {
        this.value = value;
    }
}
