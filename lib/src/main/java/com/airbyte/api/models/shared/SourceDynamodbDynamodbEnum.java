package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceDynamodbDynamodbEnum {
    DYNAMODB("dynamodb");

    @JsonValue
    public final String value;

    private SourceDynamodbDynamodbEnum(String value) {
        this.value = value;
    }
}
