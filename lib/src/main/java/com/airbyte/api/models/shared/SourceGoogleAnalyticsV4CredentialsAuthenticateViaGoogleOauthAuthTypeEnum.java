package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceGoogleAnalyticsV4CredentialsAuthenticateViaGoogleOauthAuthTypeEnum {
    CLIENT("Client");

    @JsonValue
    public final String value;

    private SourceGoogleAnalyticsV4CredentialsAuthenticateViaGoogleOauthAuthTypeEnum(String value) {
        this.value = value;
    }
}
