package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationBigqueryDenormalizedBigqueryDenormalizedEnum {
    BIGQUERY_DENORMALIZED("bigquery-denormalized");

    @JsonValue
    public final String value;

    private DestinationBigqueryDenormalizedBigqueryDenormalizedEnum(String value) {
        this.value = value;
    }
}
