package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceAirtableAirtableEnum {
    AIRTABLE("airtable");

    @JsonValue
    public final String value;

    private SourceAirtableAirtableEnum(String value) {
        this.value = value;
    }
}
