package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationAzureBlobStorageFormatJSONLinesNewlineDelimitedJSONFormatTypeEnum {
    JSONL("JSONL");

    @JsonValue
    public final String value;

    private DestinationAzureBlobStorageFormatJSONLinesNewlineDelimitedJSONFormatTypeEnum(String value) {
        this.value = value;
    }
}
