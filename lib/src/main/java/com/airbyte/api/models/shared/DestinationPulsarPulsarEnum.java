package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationPulsarPulsarEnum {
    PULSAR("pulsar");

    @JsonValue
    public final String value;

    private DestinationPulsarPulsarEnum(String value) {
        this.value = value;
    }
}
