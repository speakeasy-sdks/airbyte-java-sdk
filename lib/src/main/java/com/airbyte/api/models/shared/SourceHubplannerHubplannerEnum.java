package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceHubplannerHubplannerEnum {
    HUBPLANNER("hubplanner");

    @JsonValue
    public final String value;

    private SourceHubplannerHubplannerEnum(String value) {
        this.value = value;
    }
}
