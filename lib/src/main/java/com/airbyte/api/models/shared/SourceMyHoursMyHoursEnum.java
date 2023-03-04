package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceMyHoursMyHoursEnum {
    MY_HOURS("my-hours");

    @JsonValue
    public final String value;

    private SourceMyHoursMyHoursEnum(String value) {
        this.value = value;
    }
}
