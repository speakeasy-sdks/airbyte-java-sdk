package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceGreenhouseGreenhouseEnum {
    GREENHOUSE("greenhouse");

    @JsonValue
    public final String value;

    private SourceGreenhouseGreenhouseEnum(String value) {
        this.value = value;
    }
}
