package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceGoogleAnalyticsV4CredentialsServiceAccountKeyAuthenticationAuthTypeEnum {
    SERVICE("Service");

    @JsonValue
    public final String value;

    private SourceGoogleAnalyticsV4CredentialsServiceAccountKeyAuthenticationAuthTypeEnum(String value) {
        this.value = value;
    }
}
