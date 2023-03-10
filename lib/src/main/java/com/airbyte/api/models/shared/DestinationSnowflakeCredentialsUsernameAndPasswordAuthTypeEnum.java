package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationSnowflakeCredentialsUsernameAndPasswordAuthTypeEnum {
    USERNAME_AND_PASSWORD("Username and Password");

    @JsonValue
    public final String value;

    private DestinationSnowflakeCredentialsUsernameAndPasswordAuthTypeEnum(String value) {
        this.value = value;
    }
}
