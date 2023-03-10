package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceOracleConnectionDataSystemIDSIDConnectionTypeEnum {
    SID("sid");

    @JsonValue
    public final String value;

    private SourceOracleConnectionDataSystemIDSIDConnectionTypeEnum(String value) {
        this.value = value;
    }
}
