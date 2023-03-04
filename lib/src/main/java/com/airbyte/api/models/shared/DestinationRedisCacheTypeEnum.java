package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationRedisCacheTypeEnum {
    HASH("hash");

    @JsonValue
    public final String value;

    private DestinationRedisCacheTypeEnum(String value) {
        this.value = value;
    }
}
