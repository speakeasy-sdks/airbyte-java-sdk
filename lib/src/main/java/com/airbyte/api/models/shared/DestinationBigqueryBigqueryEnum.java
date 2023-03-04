package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationBigqueryBigqueryEnum {
    BIGQUERY("bigquery");

    @JsonValue
    public final String value;

    private DestinationBigqueryBigqueryEnum(String value) {
        this.value = value;
    }
}
