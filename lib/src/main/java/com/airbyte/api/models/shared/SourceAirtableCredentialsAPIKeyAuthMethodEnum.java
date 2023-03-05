package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceAirtableCredentialsAPIKeyAuthMethodEnum {
    API_KEY("api_key");

    @JsonValue
    public final String value;

    private SourceAirtableCredentialsAPIKeyAuthMethodEnum(String value) {
        this.value = value;
    }
}
