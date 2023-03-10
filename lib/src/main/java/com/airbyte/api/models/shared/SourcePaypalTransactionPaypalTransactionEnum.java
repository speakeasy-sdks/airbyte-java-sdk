package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourcePaypalTransactionPaypalTransactionEnum {
    PAYPAL_TRANSACTION("paypal-transaction");

    @JsonValue
    public final String value;

    private SourcePaypalTransactionPaypalTransactionEnum(String value) {
        this.value = value;
    }
}
