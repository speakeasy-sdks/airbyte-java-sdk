package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceDatascopeDatascopeEnum {
    DATASCOPE("datascope");

    @JsonValue
    public final String value;

    private SourceDatascopeDatascopeEnum(String value) {
        this.value = value;
    }
}
