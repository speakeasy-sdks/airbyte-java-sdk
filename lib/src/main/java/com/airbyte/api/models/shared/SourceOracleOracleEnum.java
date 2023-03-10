package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceOracleOracleEnum {
    ORACLE("oracle");

    @JsonValue
    public final String value;

    private SourceOracleOracleEnum(String value) {
        this.value = value;
    }
}
