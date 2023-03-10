package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceSentrySentryEnum {
    SENTRY("sentry");

    @JsonValue
    public final String value;

    private SourceSentrySentryEnum(String value) {
        this.value = value;
    }
}
