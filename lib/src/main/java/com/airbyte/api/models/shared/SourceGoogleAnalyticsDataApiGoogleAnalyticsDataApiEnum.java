package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceGoogleAnalyticsDataApiGoogleAnalyticsDataApiEnum {
    GOOGLE_ANALYTICS_DATA_API("google-analytics-data-api");

    @JsonValue
    public final String value;

    private SourceGoogleAnalyticsDataApiGoogleAnalyticsDataApiEnum(String value) {
        this.value = value;
    }
}
