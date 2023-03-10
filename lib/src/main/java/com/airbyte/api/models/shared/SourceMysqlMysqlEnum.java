package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceMysqlMysqlEnum {
    MYSQL("mysql");

    @JsonValue
    public final String value;

    private SourceMysqlMysqlEnum(String value) {
        this.value = value;
    }
}
