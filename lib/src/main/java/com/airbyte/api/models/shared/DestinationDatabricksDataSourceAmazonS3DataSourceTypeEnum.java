package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationDatabricksDataSourceAmazonS3DataSourceTypeEnum {
    S3("S3");

    @JsonValue
    public final String value;

    private DestinationDatabricksDataSourceAmazonS3DataSourceTypeEnum(String value) {
        this.value = value;
    }
}
