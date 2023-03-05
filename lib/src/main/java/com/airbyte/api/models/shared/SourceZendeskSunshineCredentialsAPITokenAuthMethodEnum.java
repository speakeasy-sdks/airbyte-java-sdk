package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceZendeskSunshineCredentialsAPITokenAuthMethodEnum {
    API_TOKEN("api_token");

    @JsonValue
    public final String value;

    private SourceZendeskSunshineCredentialsAPITokenAuthMethodEnum(String value) {
        this.value = value;
    }
}
