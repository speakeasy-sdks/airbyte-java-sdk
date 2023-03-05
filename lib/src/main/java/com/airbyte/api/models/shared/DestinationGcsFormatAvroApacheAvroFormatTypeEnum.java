package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationGcsFormatAvroApacheAvroFormatTypeEnum {
    AVRO("Avro");

    @JsonValue
    public final String value;

    private DestinationGcsFormatAvroApacheAvroFormatTypeEnum(String value) {
        this.value = value;
    }
}
