package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceMetabaseMetabaseEnum {
    METABASE("metabase");

    @JsonValue
    public final String value;

    private SourceMetabaseMetabaseEnum(String value) {
        this.value = value;
    }
}
