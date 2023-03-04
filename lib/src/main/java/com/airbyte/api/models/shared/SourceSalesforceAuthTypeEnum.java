package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceSalesforceAuthTypeEnum {
    CLIENT("Client");

    @JsonValue
    public final String value;

    private SourceSalesforceAuthTypeEnum(String value) {
        this.value = value;
    }
}
