package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceRedshiftRedshiftEnum {
    REDSHIFT("redshift");

    @JsonValue
    public final String value;

    private SourceRedshiftRedshiftEnum(String value) {
        this.value = value;
    }
}
