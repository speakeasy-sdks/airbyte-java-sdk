package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceSquareCredentialsOauthAuthenticationCredentialsTitleEnum {
    O_AUTH_CREDENTIALS("OAuth Credentials");

    @JsonValue
    public final String value;

    private SourceSquareCredentialsOauthAuthenticationCredentialsTitleEnum(String value) {
        this.value = value;
    }
}
