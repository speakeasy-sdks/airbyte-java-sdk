package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceBambooHrBambooHrEnum {
    BAMBOO_HR("bamboo-hr");

    @JsonValue
    public final String value;

    private SourceBambooHrBambooHrEnum(String value) {
        this.value = value;
    }
}
