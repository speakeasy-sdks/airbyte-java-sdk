package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceClickhouseClickhouseEnum {
    CLICKHOUSE("clickhouse");

    @JsonValue
    public final String value;

    private SourceClickhouseClickhouseEnum(String value) {
        this.value = value;
    }
}
