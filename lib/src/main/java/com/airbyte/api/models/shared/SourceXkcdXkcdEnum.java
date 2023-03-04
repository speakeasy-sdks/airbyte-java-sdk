package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceXkcdXkcdEnum {
    XKCD("xkcd");

    @JsonValue
    public final String value;

    private SourceXkcdXkcdEnum(String value) {
        this.value = value;
    }
}
