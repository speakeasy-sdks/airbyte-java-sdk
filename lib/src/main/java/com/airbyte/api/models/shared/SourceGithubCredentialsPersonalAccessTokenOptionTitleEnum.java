package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceGithubCredentialsPersonalAccessTokenOptionTitleEnum {
    PAT_CREDENTIALS("PAT Credentials");

    @JsonValue
    public final String value;

    private SourceGithubCredentialsPersonalAccessTokenOptionTitleEnum(String value) {
        this.value = value;
    }
}
