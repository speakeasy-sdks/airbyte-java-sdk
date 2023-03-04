package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceCoinmarketcapDataTypeEnum {
    LATEST("latest"),
    HISTORICAL("historical");

    @JsonValue
    public final String value;

    private SourceCoinmarketcapDataTypeEnum(String value) {
        this.value = value;
    }
}
