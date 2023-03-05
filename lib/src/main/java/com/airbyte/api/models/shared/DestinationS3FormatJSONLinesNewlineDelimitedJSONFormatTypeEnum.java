package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationS3FormatJSONLinesNewlineDelimitedJSONFormatTypeEnum {
    JSONL("JSONL");

    @JsonValue
    public final String value;

    private DestinationS3FormatJSONLinesNewlineDelimitedJSONFormatTypeEnum(String value) {
        this.value = value;
    }
}
