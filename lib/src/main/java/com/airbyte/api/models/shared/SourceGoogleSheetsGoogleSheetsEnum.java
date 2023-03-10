package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceGoogleSheetsGoogleSheetsEnum {
    GOOGLE_SHEETS("google-sheets");

    @JsonValue
    public final String value;

    private SourceGoogleSheetsGoogleSheetsEnum(String value) {
        this.value = value;
    }
}
