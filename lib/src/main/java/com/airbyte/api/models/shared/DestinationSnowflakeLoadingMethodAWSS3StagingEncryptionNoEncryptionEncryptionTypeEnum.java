package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationSnowflakeLoadingMethodAWSS3StagingEncryptionNoEncryptionEncryptionTypeEnum {
    NONE("none");

    @JsonValue
    public final String value;

    private DestinationSnowflakeLoadingMethodAWSS3StagingEncryptionNoEncryptionEncryptionTypeEnum(String value) {
        this.value = value;
    }
}
