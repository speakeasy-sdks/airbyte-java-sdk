package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceAmazonSqsAWSRegionEnum {
    US_EAST1("us-east-1"),
    US_EAST2("us-east-2"),
    US_WEST1("us-west-1"),
    US_WEST2("us-west-2"),
    AF_SOUTH1("af-south-1"),
    AP_EAST1("ap-east-1"),
    AP_SOUTH1("ap-south-1"),
    AP_NORTHEAST1("ap-northeast-1"),
    AP_NORTHEAST2("ap-northeast-2"),
    AP_NORTHEAST3("ap-northeast-3"),
    AP_SOUTHEAST1("ap-southeast-1"),
    AP_SOUTHEAST2("ap-southeast-2"),
    CA_CENTRAL1("ca-central-1"),
    CN_NORTH1("cn-north-1"),
    CN_NORTHWEST1("cn-northwest-1"),
    EU_CENTRAL1("eu-central-1"),
    EU_NORTH1("eu-north-1"),
    EU_SOUTH1("eu-south-1"),
    EU_WEST1("eu-west-1"),
    EU_WEST2("eu-west-2"),
    EU_WEST3("eu-west-3"),
    SA_EAST1("sa-east-1"),
    ME_SOUTH1("me-south-1"),
    US_GOV_EAST1("us-gov-east-1"),
    US_GOV_WEST1("us-gov-west-1");

    @JsonValue
    public final String value;

    private SourceAmazonSqsAWSRegionEnum(String value) {
        this.value = value;
    }
}
