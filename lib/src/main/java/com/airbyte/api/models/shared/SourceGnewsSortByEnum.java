package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceGnewsSortByEnum {
    PUBLISHED_AT("publishedAt"),
    RELEVANCE("relevance");

    @JsonValue
    public final String value;

    private SourceGnewsSortByEnum(String value) {
        this.value = value;
    }
}
