package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceKlaviyoKlaviyoEnum {
    KLAVIYO("klaviyo");

    @JsonValue
    public final String value;

    private SourceKlaviyoKlaviyoEnum(String value) {
        this.value = value;
    }
}
