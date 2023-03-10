package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceSpacexApiSpacexApiEnum {
    SPACEX_API("spacex-api");

    @JsonValue
    public final String value;

    private SourceSpacexApiSpacexApiEnum(String value) {
        this.value = value;
    }
}
