package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationAzureBlobStorageAzureBlobStorageEnum {
    AZURE_BLOB_STORAGE("azure-blob-storage");

    @JsonValue
    public final String value;

    private DestinationAzureBlobStorageAzureBlobStorageEnum(String value) {
        this.value = value;
    }
}
