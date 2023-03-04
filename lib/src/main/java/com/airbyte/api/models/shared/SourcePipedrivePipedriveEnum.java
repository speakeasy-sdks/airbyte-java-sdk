package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourcePipedrivePipedriveEnum {
    PIPEDRIVE("pipedrive");

    @JsonValue
    public final String value;

    private SourcePipedrivePipedriveEnum(String value) {
        this.value = value;
    }
}
