package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationGcsFormatJSONLinesNewlineDelimitedJSONFormatTypeEnum {
    JSONL("JSONL");

    @JsonValue
    public final String value;

    private DestinationGcsFormatJSONLinesNewlineDelimitedJSONFormatTypeEnum(String value) {
        this.value = value;
    }
}
