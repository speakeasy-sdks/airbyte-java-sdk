package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceNetsuiteNetsuiteEnum {
    NETSUITE("netsuite");

    @JsonValue
    public final String value;

    private SourceNetsuiteNetsuiteEnum(String value) {
        this.value = value;
    }
}
