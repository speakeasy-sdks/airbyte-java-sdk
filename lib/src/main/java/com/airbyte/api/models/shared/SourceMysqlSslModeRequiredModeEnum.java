package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceMysqlSslModeRequiredModeEnum {
    REQUIRED("required");

    @JsonValue
    public final String value;

    private SourceMysqlSslModeRequiredModeEnum(String value) {
        this.value = value;
    }
}
