package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationFireboltLoadingMethodSQLInsertsMethodEnum {
    SQL("SQL");

    @JsonValue
    public final String value;

    private DestinationFireboltLoadingMethodSQLInsertsMethodEnum(String value) {
        this.value = value;
    }
}
