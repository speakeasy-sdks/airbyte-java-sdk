package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceLokaliseLokaliseEnum {
    LOKALISE("lokalise");

    @JsonValue
    public final String value;

    private SourceLokaliseLokaliseEnum(String value) {
        this.value = value;
    }
}
