package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceGnewsGnewsEnum {
    GNEWS("gnews");

    @JsonValue
    public final String value;

    private SourceGnewsGnewsEnum(String value) {
        this.value = value;
    }
}
