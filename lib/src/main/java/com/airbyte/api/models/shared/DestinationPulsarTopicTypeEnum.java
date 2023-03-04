package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationPulsarTopicTypeEnum {
    PERSISTENT("persistent"),
    NON_PERSISTENT("non-persistent");

    @JsonValue
    public final String value;

    private DestinationPulsarTopicTypeEnum(String value) {
        this.value = value;
    }
}
