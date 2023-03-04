package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourcePublicApisPublicApisEnum {
    PUBLIC_APIS("public-apis");

    @JsonValue
    public final String value;

    private SourcePublicApisPublicApisEnum(String value) {
        this.value = value;
    }
}
