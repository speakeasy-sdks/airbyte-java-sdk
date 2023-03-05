package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationMongodbInstanceTypeReplicaSetInstanceEnum {
    REPLICA("replica");

    @JsonValue
    public final String value;

    private DestinationMongodbInstanceTypeReplicaSetInstanceEnum(String value) {
        this.value = value;
    }
}
