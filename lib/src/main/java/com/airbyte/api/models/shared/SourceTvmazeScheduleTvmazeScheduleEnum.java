package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceTvmazeScheduleTvmazeScheduleEnum {
    TVMAZE_SCHEDULE("tvmaze-schedule");

    @JsonValue
    public final String value;

    private SourceTvmazeScheduleTvmazeScheduleEnum(String value) {
        this.value = value;
    }
}
