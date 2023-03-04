package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceHarvestHarvestEnum {
    HARVEST("harvest");

    @JsonValue
    public final String value;

    private SourceHarvestHarvestEnum(String value) {
        this.value = value;
    }
}
