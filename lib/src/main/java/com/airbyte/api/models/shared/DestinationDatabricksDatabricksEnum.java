package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationDatabricksDatabricksEnum {
    DATABRICKS("databricks");

    @JsonValue
    public final String value;

    private DestinationDatabricksDatabricksEnum(String value) {
        this.value = value;
    }
}
