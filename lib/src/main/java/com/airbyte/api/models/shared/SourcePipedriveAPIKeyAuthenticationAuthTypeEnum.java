package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourcePipedriveAPIKeyAuthenticationAuthTypeEnum {
    TOKEN("Token");

    @JsonValue
    public final String value;

    private SourcePipedriveAPIKeyAuthenticationAuthTypeEnum(String value) {
        this.value = value;
    }
}
