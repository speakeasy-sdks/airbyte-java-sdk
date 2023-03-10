package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationMongodbAuthTypeLoginPasswordAuthorizationEnum {
    LOGIN_PASSWORD("login/password");

    @JsonValue
    public final String value;

    private DestinationMongodbAuthTypeLoginPasswordAuthorizationEnum(String value) {
        this.value = value;
    }
}
