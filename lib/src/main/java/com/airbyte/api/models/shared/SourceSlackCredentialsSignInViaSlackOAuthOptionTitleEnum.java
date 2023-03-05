package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceSlackCredentialsSignInViaSlackOAuthOptionTitleEnum {
    DEFAULT_O_AUTH20_AUTHORIZATION("Default OAuth2.0 authorization");

    @JsonValue
    public final String value;

    private SourceSlackCredentialsSignInViaSlackOAuthOptionTitleEnum(String value) {
        this.value = value;
    }
}
