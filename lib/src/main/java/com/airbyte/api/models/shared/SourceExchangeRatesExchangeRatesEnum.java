package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceExchangeRatesExchangeRatesEnum {
    EXCHANGE_RATES("exchange-rates");

    @JsonValue
    public final String value;

    private SourceExchangeRatesExchangeRatesEnum(String value) {
        this.value = value;
    }
}
