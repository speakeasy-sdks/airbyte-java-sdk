package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationElasticsearchAuthenticationMethodApiKeySecretMethodEnum {
    SECRET("secret");

    @JsonValue
    public final String value;

    private DestinationElasticsearchAuthenticationMethodApiKeySecretMethodEnum(String value) {
        this.value = value;
    }
}
