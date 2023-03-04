package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceInstatusInstatusEnum {
    INSTATUS("instatus");

    @JsonValue
    public final String value;

    private SourceInstatusInstatusEnum(String value) {
        this.value = value;
    }
}
