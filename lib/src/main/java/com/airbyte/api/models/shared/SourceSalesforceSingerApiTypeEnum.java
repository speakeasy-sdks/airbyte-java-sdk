package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceSalesforceSingerApiTypeEnum {
    BULK("BULK"),
    REST("REST");

    @JsonValue
    public final String value;

    private SourceSalesforceSingerApiTypeEnum(String value) {
        this.value = value;
    }
}
