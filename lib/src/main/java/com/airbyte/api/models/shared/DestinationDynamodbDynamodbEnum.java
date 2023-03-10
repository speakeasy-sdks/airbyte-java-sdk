package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationDynamodbDynamodbEnum {
    DYNAMODB("dynamodb");

    @JsonValue
    public final String value;

    private DestinationDynamodbDynamodbEnum(String value) {
        this.value = value;
    }
}
