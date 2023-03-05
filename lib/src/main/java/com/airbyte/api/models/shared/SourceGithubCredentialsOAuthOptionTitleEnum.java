package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceGithubCredentialsOAuthOptionTitleEnum {
    O_AUTH_CREDENTIALS("OAuth Credentials");

    @JsonValue
    public final String value;

    private SourceGithubCredentialsOAuthOptionTitleEnum(String value) {
        this.value = value;
    }
}
