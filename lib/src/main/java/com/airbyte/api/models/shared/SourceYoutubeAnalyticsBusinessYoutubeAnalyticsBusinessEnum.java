package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceYoutubeAnalyticsBusinessYoutubeAnalyticsBusinessEnum {
    YOUTUBE_ANALYTICS_BUSINESS("youtube-analytics-business");

    @JsonValue
    public final String value;

    private SourceYoutubeAnalyticsBusinessYoutubeAnalyticsBusinessEnum(String value) {
        this.value = value;
    }
}
