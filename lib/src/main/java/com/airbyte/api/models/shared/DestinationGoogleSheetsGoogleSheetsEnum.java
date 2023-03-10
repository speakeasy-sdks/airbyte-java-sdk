package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationGoogleSheetsGoogleSheetsEnum {
    GOOGLE_SHEETS("google-sheets");

    @JsonValue
    public final String value;

    private DestinationGoogleSheetsGoogleSheetsEnum(String value) {
        this.value = value;
    }
}
