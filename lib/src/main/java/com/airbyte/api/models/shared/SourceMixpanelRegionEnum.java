package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceMixpanelRegionEnum {
    US("US"),
    EU("EU");

    @JsonValue
    public final String value;

    private SourceMixpanelRegionEnum(String value) {
        this.value = value;
    }
}
