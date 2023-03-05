package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceMongodbInstanceTypeReplicaSetInstanceEnum {
    REPLICA("replica");

    @JsonValue
    public final String value;

    private SourceMongodbInstanceTypeReplicaSetInstanceEnum(String value) {
        this.value = value;
    }
}
