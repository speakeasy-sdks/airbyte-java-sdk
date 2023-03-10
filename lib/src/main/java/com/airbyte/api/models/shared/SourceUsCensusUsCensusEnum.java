package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceUsCensusUsCensusEnum {
    US_CENSUS("us-census");

    @JsonValue
    public final String value;

    private SourceUsCensusUsCensusEnum(String value) {
        this.value = value;
    }
}
