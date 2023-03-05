package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceShopifyCredentialsAPIPasswordAuthMethodEnum {
    API_PASSWORD("api_password");

    @JsonValue
    public final String value;

    private SourceShopifyCredentialsAPIPasswordAuthMethodEnum(String value) {
        this.value = value;
    }
}
