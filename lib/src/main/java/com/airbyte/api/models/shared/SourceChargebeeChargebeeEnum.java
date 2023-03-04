package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceChargebeeChargebeeEnum {
    CHARGEBEE("chargebee");

    @JsonValue
    public final String value;

    private SourceChargebeeChargebeeEnum(String value) {
        this.value = value;
    }
}
