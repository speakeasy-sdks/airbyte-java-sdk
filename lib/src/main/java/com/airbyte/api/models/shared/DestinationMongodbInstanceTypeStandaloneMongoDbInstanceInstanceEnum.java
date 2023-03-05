package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationMongodbInstanceTypeStandaloneMongoDbInstanceInstanceEnum {
    STANDALONE("standalone");

    @JsonValue
    public final String value;

    private DestinationMongodbInstanceTypeStandaloneMongoDbInstanceInstanceEnum(String value) {
        this.value = value;
    }
}
