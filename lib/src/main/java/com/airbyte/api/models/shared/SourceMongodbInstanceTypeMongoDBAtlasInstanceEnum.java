package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceMongodbInstanceTypeMongoDBAtlasInstanceEnum {
    ATLAS("atlas");

    @JsonValue
    public final String value;

    private SourceMongodbInstanceTypeMongoDBAtlasInstanceEnum(String value) {
        this.value = value;
    }
}
