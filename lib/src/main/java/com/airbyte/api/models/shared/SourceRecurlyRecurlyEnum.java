package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceRecurlyRecurlyEnum {
    RECURLY("recurly");

    @JsonValue
    public final String value;

    private SourceRecurlyRecurlyEnum(String value) {
        this.value = value;
    }
}
