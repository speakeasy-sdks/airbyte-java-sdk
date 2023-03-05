package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationBigqueryLoadingMethodGCSStagingMethodEnum {
    GCS_STAGING("GCS Staging");

    @JsonValue
    public final String value;

    private DestinationBigqueryLoadingMethodGCSStagingMethodEnum(String value) {
        this.value = value;
    }
}
