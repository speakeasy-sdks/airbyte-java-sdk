package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourcePosthogPosthogEnum {
    POSTHOG("posthog");

    @JsonValue
    public final String value;

    private SourcePosthogPosthogEnum(String value) {
        this.value = value;
    }
}
