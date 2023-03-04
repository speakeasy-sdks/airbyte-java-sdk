package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceRechargeRechargeEnum {
    RECHARGE("recharge");

    @JsonValue
    public final String value;

    private SourceRechargeRechargeEnum(String value) {
        this.value = value;
    }
}
