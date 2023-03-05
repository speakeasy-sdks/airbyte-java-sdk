package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationMongodbAuthTypeNoneAuthorizationEnum {
    NONE("none");

    @JsonValue
    public final String value;

    private DestinationMongodbAuthTypeNoneAuthorizationEnum(String value) {
        this.value = value;
    }
}
