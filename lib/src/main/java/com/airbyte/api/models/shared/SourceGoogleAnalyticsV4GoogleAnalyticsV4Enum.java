package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceGoogleAnalyticsV4GoogleAnalyticsV4Enum {
    GOOGLE_ANALYTICS_V4("google-analytics-v4");

    @JsonValue
    public final String value;

    private SourceGoogleAnalyticsV4GoogleAnalyticsV4Enum(String value) {
        this.value = value;
    }
}
