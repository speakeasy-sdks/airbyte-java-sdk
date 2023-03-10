package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceNotionNotionEnum {
    NOTION("notion");

    @JsonValue
    public final String value;

    private SourceNotionNotionEnum(String value) {
        this.value = value;
    }
}
