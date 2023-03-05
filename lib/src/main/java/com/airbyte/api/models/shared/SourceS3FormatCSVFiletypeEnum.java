package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceS3FormatCSVFiletypeEnum {
    CSV("csv");

    @JsonValue
    public final String value;

    private SourceS3FormatCSVFiletypeEnum(String value) {
        this.value = value;
    }
}
