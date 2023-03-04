package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationMysqlMysqlEnum {
    MYSQL("mysql");

    @JsonValue
    public final String value;

    private DestinationMysqlMysqlEnum(String value) {
        this.value = value;
    }
}
