package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceBigcommerceBigcommerceEnum {
    BIGCOMMERCE("bigcommerce");

    @JsonValue
    public final String value;

    private SourceBigcommerceBigcommerceEnum(String value) {
        this.value = value;
    }
}
