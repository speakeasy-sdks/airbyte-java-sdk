package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceFileSecureProviderGCSGoogleCloudStorageStorageEnum {
    GCS("GCS");

    @JsonValue
    public final String value;

    private SourceFileSecureProviderGCSGoogleCloudStorageStorageEnum(String value) {
        this.value = value;
    }
}
