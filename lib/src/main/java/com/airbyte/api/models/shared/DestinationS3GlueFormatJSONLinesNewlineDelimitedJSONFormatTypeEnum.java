package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONFormatTypeEnum {
    JSONL("JSONL");

    @JsonValue
    public final String value;

    private DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONFormatTypeEnum(String value) {
        this.value = value;
    }
}
