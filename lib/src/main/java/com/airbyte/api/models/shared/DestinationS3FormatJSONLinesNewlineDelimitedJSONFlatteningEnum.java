package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationS3FormatJSONLinesNewlineDelimitedJSONFlatteningEnum {
    NO_FLATTENING("No flattening"),
    ROOT_LEVEL_FLATTENING("Root level flattening");

    @JsonValue
    public final String value;

    private DestinationS3FormatJSONLinesNewlineDelimitedJSONFlatteningEnum(String value) {
        this.value = value;
    }
}
