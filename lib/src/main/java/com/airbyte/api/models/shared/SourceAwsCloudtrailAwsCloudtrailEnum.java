package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceAwsCloudtrailAwsCloudtrailEnum {
    AWS_CLOUDTRAIL("aws-cloudtrail");

    @JsonValue
    public final String value;

    private SourceAwsCloudtrailAwsCloudtrailEnum(String value) {
        this.value = value;
    }
}
