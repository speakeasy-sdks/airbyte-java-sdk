package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationBigqueryTransformationQueryRunTypeEnum {
    INTERACTIVE("interactive"),
    BATCH("batch");

    @JsonValue
    public final String value;

    private DestinationBigqueryTransformationQueryRunTypeEnum(String value) {
        this.value = value;
    }
}
