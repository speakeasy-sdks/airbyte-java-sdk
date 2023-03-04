package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceZoomZoomEnum {
    ZOOM("zoom");

    @JsonValue
    public final String value;

    private SourceZoomZoomEnum(String value) {
        this.value = value;
    }
}
