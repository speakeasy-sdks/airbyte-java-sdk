package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceZuoraZuoraEnum {
    ZUORA("zuora");

    @JsonValue
    public final String value;

    private SourceZuoraZuoraEnum(String value) {
        this.value = value;
    }
}
