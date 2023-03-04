package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourcePocketStateEnum {
    UNREAD("unread"),
    ARCHIVE("archive"),
    ALL("all");

    @JsonValue
    public final String value;

    private SourcePocketStateEnum(String value) {
        this.value = value;
    }
}
