package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationRedshiftUploadingMethodS3StagingEncryptionNoEncryptionEncryptionTypeEnum {
    NONE("none");

    @JsonValue
    public final String value;

    private DestinationRedshiftUploadingMethodS3StagingEncryptionNoEncryptionEncryptionTypeEnum(String value) {
        this.value = value;
    }
}
