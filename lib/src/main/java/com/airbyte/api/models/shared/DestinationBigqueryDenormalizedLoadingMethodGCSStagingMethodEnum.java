package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationBigqueryDenormalizedLoadingMethodGCSStagingMethodEnum {
    GCS_STAGING("GCS Staging");

    @JsonValue
    public final String value;

    private DestinationBigqueryDenormalizedLoadingMethodGCSStagingMethodEnum(String value) {
        this.value = value;
    }
}
