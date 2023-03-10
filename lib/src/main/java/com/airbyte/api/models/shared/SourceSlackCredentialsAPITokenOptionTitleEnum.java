package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceSlackCredentialsAPITokenOptionTitleEnum {
    API_TOKEN_CREDENTIALS("API Token Credentials");

    @JsonValue
    public final String value;

    private SourceSlackCredentialsAPITokenOptionTitleEnum(String value) {
        this.value = value;
    }
}
