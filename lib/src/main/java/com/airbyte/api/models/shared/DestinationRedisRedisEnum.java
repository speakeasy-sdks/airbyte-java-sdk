package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationRedisRedisEnum {
    REDIS("redis");

    @JsonValue
    public final String value;

    private DestinationRedisRedisEnum(String value) {
        this.value = value;
    }
}
