package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationDatabricksDataSourceAzureBlobStorageDataSourceTypeEnum {
    AZURE_BLOB_STORAGE("Azure_Blob_Storage");

    @JsonValue
    public final String value;

    private DestinationDatabricksDataSourceAzureBlobStorageDataSourceTypeEnum(String value) {
        this.value = value;
    }
}
