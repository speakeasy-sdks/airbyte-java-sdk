package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceWebflowWebflowEnum {
    WEBFLOW("webflow");

    @JsonValue
    public final String value;

    private SourceWebflowWebflowEnum(String value) {
        this.value = value;
    }
}
