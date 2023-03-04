package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceFreshcallerFreshcallerEnum {
    FRESHCALLER("freshcaller");

    @JsonValue
    public final String value;

    private SourceFreshcallerFreshcallerEnum(String value) {
        this.value = value;
    }
}
