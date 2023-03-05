package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceS3FormatAvroFiletypeEnum {
    AVRO("avro");

    @JsonValue
    public final String value;

    private SourceS3FormatAvroFiletypeEnum(String value) {
        this.value = value;
    }
}
