package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationSnowflakeLoadingMethodGoogleCloudStorageStagingMethodEnum {
    GCS_STAGING("GCS Staging");

    @JsonValue
    public final String value;

    private DestinationSnowflakeLoadingMethodGoogleCloudStorageStagingMethodEnum(String value) {
        this.value = value;
    }
}
