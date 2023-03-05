package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceAsanaCredentialsAuthenticateViaAsanaOauthCredentialsTitleEnum {
    O_AUTH_CREDENTIALS("OAuth Credentials");

    @JsonValue
    public final String value;

    private SourceAsanaCredentialsAuthenticateViaAsanaOauthCredentialsTitleEnum(String value) {
        this.value = value;
    }
}
