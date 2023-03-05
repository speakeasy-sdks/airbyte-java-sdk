package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceMysqlReplicationMethodStandardMethodEnum {
    STANDARD("STANDARD");

    @JsonValue
    public final String value;

    private SourceMysqlReplicationMethodStandardMethodEnum(String value) {
        this.value = value;
    }
}
