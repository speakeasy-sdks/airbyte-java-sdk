package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceNytimesNytimesEnum {
    NYTIMES("nytimes");

    @JsonValue
    public final String value;

    private SourceNytimesNytimesEnum(String value) {
        this.value = value;
    }
}
