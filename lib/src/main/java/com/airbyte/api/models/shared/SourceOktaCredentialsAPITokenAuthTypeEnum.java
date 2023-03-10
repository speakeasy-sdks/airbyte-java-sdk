package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceOktaCredentialsAPITokenAuthTypeEnum {
    API_TOKEN("api_token");

    @JsonValue
    public final String value;

    private SourceOktaCredentialsAPITokenAuthTypeEnum(String value) {
        this.value = value;
    }
}
