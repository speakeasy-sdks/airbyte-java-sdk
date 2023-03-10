package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourcePinterestStatusEnum {
    ACTIVE("ACTIVE"),
    PAUSED("PAUSED"),
    ARCHIVED("ARCHIVED");

    @JsonValue
    public final String value;

    private SourcePinterestStatusEnum(String value) {
        this.value = value;
    }
}
