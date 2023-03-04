package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceChargebeeProductCatalogEnum {
    ONE0("1.0"),
    TWO0("2.0");

    @JsonValue
    public final String value;

    private SourceChargebeeProductCatalogEnum(String value) {
        this.value = value;
    }
}
