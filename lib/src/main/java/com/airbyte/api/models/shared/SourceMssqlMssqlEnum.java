package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceMssqlMssqlEnum {
    MSSQL("mssql");

    @JsonValue
    public final String value;

    private SourceMssqlMssqlEnum(String value) {
        this.value = value;
    }
}
