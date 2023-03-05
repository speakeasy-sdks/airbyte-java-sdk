package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceOracleConnectionDataServiceNameConnectionTypeEnum {
    SERVICE_NAME("service_name");

    @JsonValue
    public final String value;

    private SourceOracleConnectionDataServiceNameConnectionTypeEnum(String value) {
        this.value = value;
    }
}
