package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceSquareCredentialsAPIKeyCredentialsTitleEnum {
    API_KEY("API Key");

    @JsonValue
    public final String value;

    private SourceSquareCredentialsAPIKeyCredentialsTitleEnum(String value) {
        this.value = value;
    }
}
