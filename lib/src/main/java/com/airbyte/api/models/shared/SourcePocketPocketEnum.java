package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourcePocketPocketEnum {
    POCKET("pocket");

    @JsonValue
    public final String value;

    private SourcePocketPocketEnum(String value) {
        this.value = value;
    }
}
