package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceFileSecureProviderHTTPSPublicWebStorageEnum {
    HTTPS("HTTPS");

    @JsonValue
    public final String value;

    private SourceFileSecureProviderHTTPSPublicWebStorageEnum(String value) {
        this.value = value;
    }
}
