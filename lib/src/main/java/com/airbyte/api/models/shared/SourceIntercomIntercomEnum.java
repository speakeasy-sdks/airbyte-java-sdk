package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceIntercomIntercomEnum {
    INTERCOM("intercom");

    @JsonValue
    public final String value;

    private SourceIntercomIntercomEnum(String value) {
        this.value = value;
    }
}
