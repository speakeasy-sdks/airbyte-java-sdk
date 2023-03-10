package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceAzureTableAzureTableEnum {
    AZURE_TABLE("azure-table");

    @JsonValue
    public final String value;

    private SourceAzureTableAzureTableEnum(String value) {
        this.value = value;
    }
}
