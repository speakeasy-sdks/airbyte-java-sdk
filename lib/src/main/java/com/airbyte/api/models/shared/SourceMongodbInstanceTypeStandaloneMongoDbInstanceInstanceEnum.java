package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceMongodbInstanceTypeStandaloneMongoDbInstanceInstanceEnum {
    STANDALONE("standalone");

    @JsonValue
    public final String value;

    private SourceMongodbInstanceTypeStandaloneMongoDbInstanceInstanceEnum(String value) {
        this.value = value;
    }
}
