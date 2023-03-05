package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationSnowflakeLoadingMethodAzureBlobStorageStagingMethodEnum {
    AZURE_BLOB_STAGING("Azure Blob Staging");

    @JsonValue
    public final String value;

    private DestinationSnowflakeLoadingMethodAzureBlobStorageStagingMethodEnum(String value) {
        this.value = value;
    }
}
