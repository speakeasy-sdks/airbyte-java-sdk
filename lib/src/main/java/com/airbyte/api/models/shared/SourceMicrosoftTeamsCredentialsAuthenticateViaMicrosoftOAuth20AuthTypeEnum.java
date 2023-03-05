package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoftOAuth20AuthTypeEnum {
    CLIENT("Client");

    @JsonValue
    public final String value;

    private SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoftOAuth20AuthTypeEnum(String value) {
        this.value = value;
    }
}
