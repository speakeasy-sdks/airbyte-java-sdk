package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceMysqlReplicationMethodLogicalReplicationCDCMethodEnum {
    CDC("CDC");

    @JsonValue
    public final String value;

    private SourceMysqlReplicationMethodLogicalReplicationCDCMethodEnum(String value) {
        this.value = value;
    }
}
