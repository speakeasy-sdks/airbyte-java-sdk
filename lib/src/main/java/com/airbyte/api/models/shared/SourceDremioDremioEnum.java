package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceDremioDremioEnum {
    DREMIO("dremio");

    @JsonValue
    public final String value;

    private SourceDremioDremioEnum(String value) {
        this.value = value;
    }
}
