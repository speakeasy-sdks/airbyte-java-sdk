package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceMysqlSslModeVerifyCAModeEnum {
    VERIFY_CA("verify_ca");

    @JsonValue
    public final String value;

    private SourceMysqlSslModeVerifyCAModeEnum(String value) {
        this.value = value;
    }
}
