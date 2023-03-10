package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationClickhouseClickhouseEnum {
    CLICKHOUSE("clickhouse");

    @JsonValue
    public final String value;

    private DestinationClickhouseClickhouseEnum(String value) {
        this.value = value;
    }
}
