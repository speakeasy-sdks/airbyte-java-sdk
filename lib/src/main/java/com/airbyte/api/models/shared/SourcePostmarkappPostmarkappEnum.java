package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourcePostmarkappPostmarkappEnum {
    POSTMARKAPP("postmarkapp");

    @JsonValue
    public final String value;

    private SourcePostmarkappPostmarkappEnum(String value) {
        this.value = value;
    }
}
