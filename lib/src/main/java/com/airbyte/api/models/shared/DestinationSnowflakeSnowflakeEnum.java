package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationSnowflakeSnowflakeEnum {
    SNOWFLAKE("snowflake");

    @JsonValue
    public final String value;

    private DestinationSnowflakeSnowflakeEnum(String value) {
        this.value = value;
    }
}
