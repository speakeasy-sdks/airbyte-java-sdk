package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationRedshiftUploadingMethodStandardMethodEnum {
    STANDARD("Standard");

    @JsonValue
    public final String value;

    private DestinationRedshiftUploadingMethodStandardMethodEnum(String value) {
        this.value = value;
    }
}
