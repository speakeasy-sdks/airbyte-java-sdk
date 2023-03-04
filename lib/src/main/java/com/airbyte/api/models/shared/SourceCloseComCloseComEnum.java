package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceCloseComCloseComEnum {
    CLOSE_COM("close-com");

    @JsonValue
    public final String value;

    private SourceCloseComCloseComEnum(String value) {
        this.value = value;
    }
}
