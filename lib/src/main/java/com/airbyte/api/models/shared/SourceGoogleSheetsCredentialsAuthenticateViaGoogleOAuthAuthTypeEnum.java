package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceGoogleSheetsCredentialsAuthenticateViaGoogleOAuthAuthTypeEnum {
    CLIENT("Client");

    @JsonValue
    public final String value;

    private SourceGoogleSheetsCredentialsAuthenticateViaGoogleOAuthAuthTypeEnum(String value) {
        this.value = value;
    }
}
