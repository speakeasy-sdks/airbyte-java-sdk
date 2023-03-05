package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceMysqlSslModePreferredModeEnum {
    PREFERRED("preferred");

    @JsonValue
    public final String value;

    private SourceMysqlSslModePreferredModeEnum(String value) {
        this.value = value;
    }
}
