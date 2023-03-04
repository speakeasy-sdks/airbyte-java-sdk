package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceFreshdeskFreshdeskEnum {
    FRESHDESK("freshdesk");

    @JsonValue
    public final String value;

    private SourceFreshdeskFreshdeskEnum(String value) {
        this.value = value;
    }
}
