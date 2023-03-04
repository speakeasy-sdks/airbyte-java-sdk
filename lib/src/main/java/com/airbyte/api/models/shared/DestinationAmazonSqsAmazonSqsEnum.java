package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationAmazonSqsAmazonSqsEnum {
    AMAZON_SQS("amazon-sqs");

    @JsonValue
    public final String value;

    private DestinationAmazonSqsAmazonSqsEnum(String value) {
        this.value = value;
    }
}
