package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceGnewsInEnum {
    TITLE("title"),
    DESCRIPTION("description"),
    CONTENT("content");

    @JsonValue
    public final String value;

    private SourceGnewsInEnum(String value) {
        this.value = value;
    }
}
