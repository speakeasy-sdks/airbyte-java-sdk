package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceMssqlReplicationMethodLogicalReplicationCDCMethodEnum {
    CDC("CDC");

    @JsonValue
    public final String value;

    private SourceMssqlReplicationMethodLogicalReplicationCDCMethodEnum(String value) {
        this.value = value;
    }
}
