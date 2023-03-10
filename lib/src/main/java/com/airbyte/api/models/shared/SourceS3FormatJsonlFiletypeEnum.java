package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceS3FormatJsonlFiletypeEnum {
    JSONL("jsonl");

    @JsonValue
    public final String value;

    private SourceS3FormatJsonlFiletypeEnum(String value) {
        this.value = value;
    }
}
