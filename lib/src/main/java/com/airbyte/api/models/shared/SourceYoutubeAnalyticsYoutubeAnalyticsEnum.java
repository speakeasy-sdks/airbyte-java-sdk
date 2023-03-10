package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceYoutubeAnalyticsYoutubeAnalyticsEnum {
    YOUTUBE_ANALYTICS("youtube-analytics");

    @JsonValue
    public final String value;

    private SourceYoutubeAnalyticsYoutubeAnalyticsEnum(String value) {
        this.value = value;
    }
}
