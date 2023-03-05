package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceSnowflakeCredentialsUsernameAndPasswordAuthTypeEnum {
    USERNAME_PASSWORD("username/password");

    @JsonValue
    public final String value;

    private SourceSnowflakeCredentialsUsernameAndPasswordAuthTypeEnum(String value) {
        this.value = value;
    }
}
