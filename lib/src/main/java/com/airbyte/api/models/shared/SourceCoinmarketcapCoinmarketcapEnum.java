package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceCoinmarketcapCoinmarketcapEnum {
    COINMARKETCAP("coinmarketcap");

    @JsonValue
    public final String value;

    private SourceCoinmarketcapCoinmarketcapEnum(String value) {
        this.value = value;
    }
}
