package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationSnowflakeLoadingMethodRecommendedInternalStagingMethodEnum {
    INTERNAL_STAGING("Internal Staging");

    @JsonValue
    public final String value;

    private DestinationSnowflakeLoadingMethodRecommendedInternalStagingMethodEnum(String value) {
        this.value = value;
    }
}
