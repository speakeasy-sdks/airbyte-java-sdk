package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceSftpBulkFileTypeEnum {
    CSV("csv"),
    JSON("json");

    @JsonValue
    public final String value;

    private SourceSftpBulkFileTypeEnum(String value) {
        this.value = value;
    }
}
