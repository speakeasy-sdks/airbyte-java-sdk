package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationElasticsearchAuthenticationMethodUsernamePasswordMethodEnum {
    BASIC("basic");

    @JsonValue
    public final String value;

    private DestinationElasticsearchAuthenticationMethodUsernamePasswordMethodEnum(String value) {
        this.value = value;
    }
}
