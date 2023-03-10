package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceAuth0CredentialsOAuth2AccessTokenAuthenticationMethodEnum {
    OAUTH2_ACCESS_TOKEN("oauth2_access_token");

    @JsonValue
    public final String value;

    private SourceAuth0CredentialsOAuth2AccessTokenAuthenticationMethodEnum(String value) {
        this.value = value;
    }
}
