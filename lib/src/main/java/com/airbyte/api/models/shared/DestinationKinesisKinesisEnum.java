package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationKinesisKinesisEnum {
    KINESIS("kinesis");

    @JsonValue
    public final String value;

    private DestinationKinesisKinesisEnum(String value) {
        this.value = value;
    }
}
