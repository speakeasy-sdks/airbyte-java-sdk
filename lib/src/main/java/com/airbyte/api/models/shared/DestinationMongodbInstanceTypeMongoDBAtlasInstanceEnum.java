package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationMongodbInstanceTypeMongoDBAtlasInstanceEnum {
    ATLAS("atlas");

    @JsonValue
    public final String value;

    private DestinationMongodbInstanceTypeMongoDBAtlasInstanceEnum(String value) {
        this.value = value;
    }
}
