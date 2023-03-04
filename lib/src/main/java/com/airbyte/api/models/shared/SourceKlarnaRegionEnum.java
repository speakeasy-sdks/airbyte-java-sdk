package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceKlarnaRegionEnum {
    EU("eu"),
    US("us"),
    OC("oc");

    @JsonValue
    public final String value;

    private SourceKlarnaRegionEnum(String value) {
        this.value = value;
    }
}
