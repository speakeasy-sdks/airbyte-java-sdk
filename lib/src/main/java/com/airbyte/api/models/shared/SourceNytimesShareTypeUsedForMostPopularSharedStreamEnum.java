package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceNytimesShareTypeUsedForMostPopularSharedStreamEnum {
    FACEBOOK("facebook");

    @JsonValue
    public final String value;

    private SourceNytimesShareTypeUsedForMostPopularSharedStreamEnum(String value) {
        this.value = value;
    }
}
