package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceZendeskChatCredentialsOAuth20CredentialsEnum {
    OAUTH20("oauth2.0");

    @JsonValue
    public final String value;

    private SourceZendeskChatCredentialsOAuth20CredentialsEnum(String value) {
        this.value = value;
    }
}
