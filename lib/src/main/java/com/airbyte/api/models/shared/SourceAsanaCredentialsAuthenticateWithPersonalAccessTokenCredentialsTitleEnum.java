package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceAsanaCredentialsAuthenticateWithPersonalAccessTokenCredentialsTitleEnum {
    PAT_CREDENTIALS("PAT Credentials");

    @JsonValue
    public final String value;

    private SourceAsanaCredentialsAuthenticateWithPersonalAccessTokenCredentialsTitleEnum(String value) {
        this.value = value;
    }
}
