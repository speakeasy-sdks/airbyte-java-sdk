package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationFireboltLoadingMethodExternalTableViaS3MethodEnum {
    S3("S3");

    @JsonValue
    public final String value;

    private DestinationFireboltLoadingMethodExternalTableViaS3MethodEnum(String value) {
        this.value = value;
    }
}
