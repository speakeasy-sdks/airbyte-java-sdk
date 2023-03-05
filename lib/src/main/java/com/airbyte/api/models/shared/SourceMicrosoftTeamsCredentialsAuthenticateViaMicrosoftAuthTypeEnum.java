package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoftAuthTypeEnum {
    TOKEN("Token");

    @JsonValue
    public final String value;

    private SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoftAuthTypeEnum(String value) {
        this.value = value;
    }
}
