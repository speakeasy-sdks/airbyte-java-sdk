package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationRabbitmqRabbitmqEnum {
    RABBITMQ("rabbitmq");

    @JsonValue
    public final String value;

    private DestinationRabbitmqRabbitmqEnum(String value) {
        this.value = value;
    }
}
