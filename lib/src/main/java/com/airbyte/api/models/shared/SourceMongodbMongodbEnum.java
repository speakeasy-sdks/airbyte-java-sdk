package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceMongodbMongodbEnum {
    MONGODB("mongodb");

    @JsonValue
    public final String value;

    private SourceMongodbMongodbEnum(String value) {
        this.value = value;
    }
}
