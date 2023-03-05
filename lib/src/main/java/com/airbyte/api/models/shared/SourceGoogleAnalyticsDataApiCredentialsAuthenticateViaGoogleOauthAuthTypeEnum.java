package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceGoogleAnalyticsDataApiCredentialsAuthenticateViaGoogleOauthAuthTypeEnum {
    CLIENT("Client");

    @JsonValue
    public final String value;

    private SourceGoogleAnalyticsDataApiCredentialsAuthenticateViaGoogleOauthAuthTypeEnum(String value) {
        this.value = value;
    }
}
