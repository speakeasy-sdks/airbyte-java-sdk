package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceE2eTestCloudTypeEnum {
    CONTINUOUS_FEED("CONTINUOUS_FEED");

    @JsonValue
    public final String value;

    private SourceE2eTestCloudTypeEnum(String value) {
        this.value = value;
    }
}
