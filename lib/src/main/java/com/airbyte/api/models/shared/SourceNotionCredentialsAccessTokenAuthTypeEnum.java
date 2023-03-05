package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceNotionCredentialsAccessTokenAuthTypeEnum {
    TOKEN("token");

    @JsonValue
    public final String value;

    private SourceNotionCredentialsAccessTokenAuthTypeEnum(String value) {
        this.value = value;
    }
}
