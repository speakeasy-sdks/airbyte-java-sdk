package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceStripeStripeEnum {
    STRIPE("stripe");

    @JsonValue
    public final String value;

    private SourceStripeStripeEnum(String value) {
        this.value = value;
    }
}
