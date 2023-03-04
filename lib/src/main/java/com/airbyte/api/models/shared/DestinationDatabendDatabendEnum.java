package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationDatabendDatabendEnum {
    DATABEND("databend");

    @JsonValue
    public final String value;

    private DestinationDatabendDatabendEnum(String value) {
        this.value = value;
    }
}
