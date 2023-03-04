package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceChartmogulChartmogulEnum {
    CHARTMOGUL("chartmogul");

    @JsonValue
    public final String value;

    private SourceChartmogulChartmogulEnum(String value) {
        this.value = value;
    }
}
