package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceTiktokMarketingReportAggregationGranularityEnum {
    LIFETIME("LIFETIME"),
    DAY("DAY"),
    HOUR("HOUR");

    @JsonValue
    public final String value;

    private SourceTiktokMarketingReportAggregationGranularityEnum(String value) {
        this.value = value;
    }
}
