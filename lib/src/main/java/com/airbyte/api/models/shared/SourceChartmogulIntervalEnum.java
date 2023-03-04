package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceChartmogulIntervalEnum {
    DAY("day"),
    WEEK("week"),
    MONTH("month"),
    QUARTER("quarter");

    @JsonValue
    public final String value;

    private SourceChartmogulIntervalEnum(String value) {
        this.value = value;
    }
}
