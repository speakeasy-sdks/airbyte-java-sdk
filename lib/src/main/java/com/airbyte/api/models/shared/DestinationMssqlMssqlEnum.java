package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationMssqlMssqlEnum {
    MSSQL("mssql");

    @JsonValue
    public final String value;

    private DestinationMssqlMssqlEnum(String value) {
        this.value = value;
    }
}
