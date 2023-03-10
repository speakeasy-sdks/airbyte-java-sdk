package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourcePypiPypiEnum {
    PYPI("pypi");

    @JsonValue
    public final String value;

    private SourcePypiPypiEnum(String value) {
        this.value = value;
    }
}
