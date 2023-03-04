package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationScyllaScyllaEnum {
    SCYLLA("scylla");

    @JsonValue
    public final String value;

    private DestinationScyllaScyllaEnum(String value) {
        this.value = value;
    }
}
