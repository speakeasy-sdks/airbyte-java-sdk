package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceFileSecureFileFormatEnum {
    CSV("csv"),
    JSON("json"),
    JSONL("jsonl"),
    EXCEL("excel"),
    EXCEL_BINARY("excel_binary"),
    FEATHER("feather"),
    PARQUET("parquet"),
    YAML("yaml");

    @JsonValue
    public final String value;

    private SourceFileSecureFileFormatEnum(String value) {
        this.value = value;
    }
}
