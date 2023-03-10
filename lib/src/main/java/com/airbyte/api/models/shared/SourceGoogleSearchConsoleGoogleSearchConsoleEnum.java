package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceGoogleSearchConsoleGoogleSearchConsoleEnum {
    GOOGLE_SEARCH_CONSOLE("google-search-console");

    @JsonValue
    public final String value;

    private SourceGoogleSearchConsoleGoogleSearchConsoleEnum(String value) {
        this.value = value;
    }
}
