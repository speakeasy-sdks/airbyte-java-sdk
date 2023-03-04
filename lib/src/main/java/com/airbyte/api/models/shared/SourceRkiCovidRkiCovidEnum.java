package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceRkiCovidRkiCovidEnum {
    RKI_COVID("rki-covid");

    @JsonValue
    public final String value;

    private SourceRkiCovidRkiCovidEnum(String value) {
        this.value = value;
    }
}
