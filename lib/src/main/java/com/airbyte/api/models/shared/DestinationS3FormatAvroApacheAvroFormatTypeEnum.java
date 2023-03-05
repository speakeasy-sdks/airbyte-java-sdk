package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationS3FormatAvroApacheAvroFormatTypeEnum {
    AVRO("Avro");

    @JsonValue
    public final String value;

    private DestinationS3FormatAvroApacheAvroFormatTypeEnum(String value) {
        this.value = value;
    }
}
