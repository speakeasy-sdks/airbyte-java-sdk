package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourcePocketDetailTypeEnum {
    SIMPLE("simple"),
    COMPLETE("complete");

    @JsonValue
    public final String value;

    private SourcePocketDetailTypeEnum(String value) {
        this.value = value;
    }
}
