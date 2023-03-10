package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourcePinterestPinterestEnum {
    PINTEREST("pinterest");

    @JsonValue
    public final String value;

    private SourcePinterestPinterestEnum(String value) {
        this.value = value;
    }
}
