package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourcePocketSortByEnum {
    NEWEST("newest"),
    OLDEST("oldest"),
    TITLE("title"),
    SITE("site");

    @JsonValue
    public final String value;

    private SourcePocketSortByEnum(String value) {
        this.value = value;
    }
}
