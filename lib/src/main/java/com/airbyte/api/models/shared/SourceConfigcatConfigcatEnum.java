package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceConfigcatConfigcatEnum {
    CONFIGCAT("configcat");

    @JsonValue
    public final String value;

    private SourceConfigcatConfigcatEnum(String value) {
        this.value = value;
    }
}
