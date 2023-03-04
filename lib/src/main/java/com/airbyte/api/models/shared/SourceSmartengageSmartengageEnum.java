package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceSmartengageSmartengageEnum {
    SMARTENGAGE("smartengage");

    @JsonValue
    public final String value;

    private SourceSmartengageSmartengageEnum(String value) {
        this.value = value;
    }
}
