package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceShortioShortioEnum {
    SHORTIO("shortio");

    @JsonValue
    public final String value;

    private SourceShortioShortioEnum(String value) {
        this.value = value;
    }
}
