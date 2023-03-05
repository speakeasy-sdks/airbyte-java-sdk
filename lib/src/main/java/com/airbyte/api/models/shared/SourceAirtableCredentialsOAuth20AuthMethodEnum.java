package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceAirtableCredentialsOAuth20AuthMethodEnum {
    OAUTH20("oauth2.0");

    @JsonValue
    public final String value;

    private SourceAirtableCredentialsOAuth20AuthMethodEnum(String value) {
        this.value = value;
    }
}
