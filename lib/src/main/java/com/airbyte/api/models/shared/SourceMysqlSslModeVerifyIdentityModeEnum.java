package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceMysqlSslModeVerifyIdentityModeEnum {
    VERIFY_IDENTITY("verify_identity");

    @JsonValue
    public final String value;

    private SourceMysqlSslModeVerifyIdentityModeEnum(String value) {
        this.value = value;
    }
}
