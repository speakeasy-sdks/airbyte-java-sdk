package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceDockerhubDockerhubEnum {
    DOCKERHUB("dockerhub");

    @JsonValue
    public final String value;

    private SourceDockerhubDockerhubEnum(String value) {
        this.value = value;
    }
}
