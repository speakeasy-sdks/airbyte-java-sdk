package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceOmnisendOmnisendEnum {
    OMNISEND("omnisend");

    @JsonValue
    public final String value;

    private SourceOmnisendOmnisendEnum(String value) {
        this.value = value;
    }
}
