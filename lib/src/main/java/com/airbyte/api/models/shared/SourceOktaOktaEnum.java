package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceOktaOktaEnum {
    OKTA("okta");

    @JsonValue
    public final String value;

    private SourceOktaOktaEnum(String value) {
        this.value = value;
    }
}
