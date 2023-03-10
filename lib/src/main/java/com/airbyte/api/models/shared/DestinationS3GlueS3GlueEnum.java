package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationS3GlueS3GlueEnum {
    S3_GLUE("s3-glue");

    @JsonValue
    public final String value;

    private DestinationS3GlueS3GlueEnum(String value) {
        this.value = value;
    }
}
