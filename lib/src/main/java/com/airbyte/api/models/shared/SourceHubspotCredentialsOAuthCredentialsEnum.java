package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceHubspotCredentialsOAuthCredentialsEnum {
    O_AUTH_CREDENTIALS("OAuth Credentials");

    @JsonValue
    public final String value;

    private SourceHubspotCredentialsOAuthCredentialsEnum(String value) {
        this.value = value;
    }
}
