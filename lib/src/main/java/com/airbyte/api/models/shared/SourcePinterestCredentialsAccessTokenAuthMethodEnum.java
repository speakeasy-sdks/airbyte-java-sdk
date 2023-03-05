package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourcePinterestCredentialsAccessTokenAuthMethodEnum {
    ACCESS_TOKEN("access_token");

    @JsonValue
    public final String value;

    private SourcePinterestCredentialsAccessTokenAuthMethodEnum(String value) {
        this.value = value;
    }
}
