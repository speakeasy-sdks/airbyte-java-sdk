package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceBraintreeEnvironmentEnum {
    DEVELOPMENT("Development"),
    SANDBOX("Sandbox"),
    QA("Qa"),
    PRODUCTION("Production");

    @JsonValue
    public final String value;

    private SourceBraintreeEnvironmentEnum(String value) {
        this.value = value;
    }
}
