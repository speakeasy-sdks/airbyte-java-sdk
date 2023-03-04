package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceMarketoMarketoEnum {
    MARKETO("marketo");

    @JsonValue
    public final String value;

    private SourceMarketoMarketoEnum(String value) {
        this.value = value;
    }
}
