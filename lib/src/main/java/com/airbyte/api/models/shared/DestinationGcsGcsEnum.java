package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationGcsGcsEnum {
    GCS("gcs");

    @JsonValue
    public final String value;

    private DestinationGcsGcsEnum(String value) {
        this.value = value;
    }
}
