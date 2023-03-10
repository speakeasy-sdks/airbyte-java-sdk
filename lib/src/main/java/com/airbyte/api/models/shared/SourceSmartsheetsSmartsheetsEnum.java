package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceSmartsheetsSmartsheetsEnum {
    SMARTSHEETS("smartsheets");

    @JsonValue
    public final String value;

    private SourceSmartsheetsSmartsheetsEnum(String value) {
        this.value = value;
    }
}
