package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceGoogleSearchConsoleAuthorizationOAuthAuthTypeEnum {
    CLIENT("Client");

    @JsonValue
    public final String value;

    private SourceGoogleSearchConsoleAuthorizationOAuthAuthTypeEnum(String value) {
        this.value = value;
    }
}
