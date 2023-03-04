package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceGnewsNullableEnum {
    TITLE("title"),
    DESCRIPTION("description"),
    CONTENT("content");

    @JsonValue
    public final String value;

    private SourceGnewsNullableEnum(String value) {
        this.value = value;
    }
}
