package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationMongodbMongodbEnum {
    MONGODB("mongodb");

    @JsonValue
    public final String value;

    private DestinationMongodbMongodbEnum(String value) {
        this.value = value;
    }
}
