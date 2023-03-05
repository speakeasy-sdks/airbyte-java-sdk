package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationSnowflakeLoadingMethodAWSS3StagingMethodEnum {
    S3_STAGING("S3 Staging");

    @JsonValue
    public final String value;

    private DestinationSnowflakeLoadingMethodAWSS3StagingMethodEnum(String value) {
        this.value = value;
    }
}
