package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationPubsubPubsubEnum {
    PUBSUB("pubsub");

    @JsonValue
    public final String value;

    private DestinationPubsubPubsubEnum(String value) {
        this.value = value;
    }
}
