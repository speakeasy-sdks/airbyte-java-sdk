package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceGoogleAnalyticsDataApiCredentialsServiceAccountKeyAuthenticationAuthTypeEnum {
    SERVICE("Service");

    @JsonValue
    public final String value;

    private SourceGoogleAnalyticsDataApiCredentialsServiceAccountKeyAuthenticationAuthTypeEnum(String value) {
        this.value = value;
    }
}
