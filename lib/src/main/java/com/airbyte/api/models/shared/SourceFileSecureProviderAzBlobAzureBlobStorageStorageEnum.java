package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceFileSecureProviderAzBlobAzureBlobStorageStorageEnum {
    AZ_BLOB("AzBlob");

    @JsonValue
    public final String value;

    private SourceFileSecureProviderAzBlobAzureBlobStorageStorageEnum(String value) {
        this.value = value;
    }
}
