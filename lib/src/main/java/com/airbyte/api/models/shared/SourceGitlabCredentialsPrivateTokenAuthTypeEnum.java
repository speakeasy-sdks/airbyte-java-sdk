package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceGitlabCredentialsPrivateTokenAuthTypeEnum {
    ACCESS_TOKEN("access_token");

    @JsonValue
    public final String value;

    private SourceGitlabCredentialsPrivateTokenAuthTypeEnum(String value) {
        this.value = value;
    }
}
