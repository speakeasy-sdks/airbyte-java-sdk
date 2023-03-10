package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceAuth0CredentialsOAuth2ConfidentialApplicationAuthenticationMethodEnum {
    OAUTH2_CONFIDENTIAL_APPLICATION("oauth2_confidential_application");

    @JsonValue
    public final String value;

    private SourceAuth0CredentialsOAuth2ConfidentialApplicationAuthenticationMethodEnum(String value) {
        this.value = value;
    }
}
