package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceMailgunMailgunEnum {
    MAILGUN("mailgun");

    @JsonValue
    public final String value;

    private SourceMailgunMailgunEnum(String value) {
        this.value = value;
    }
}
