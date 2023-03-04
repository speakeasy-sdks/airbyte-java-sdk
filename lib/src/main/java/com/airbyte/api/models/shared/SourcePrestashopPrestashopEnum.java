package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourcePrestashopPrestashopEnum {
    PRESTASHOP("prestashop");

    @JsonValue
    public final String value;

    private SourcePrestashopPrestashopEnum(String value) {
        this.value = value;
    }
}
