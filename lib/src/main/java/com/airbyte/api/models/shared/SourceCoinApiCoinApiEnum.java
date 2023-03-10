package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceCoinApiCoinApiEnum {
    COIN_API("coin-api");

    @JsonValue
    public final String value;

    private SourceCoinApiCoinApiEnum(String value) {
        this.value = value;
    }
}
