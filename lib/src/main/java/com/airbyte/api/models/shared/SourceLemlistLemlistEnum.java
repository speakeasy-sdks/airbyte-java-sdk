package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceLemlistLemlistEnum {
    LEMLIST("lemlist");

    @JsonValue
    public final String value;

    private SourceLemlistLemlistEnum(String value) {
        this.value = value;
    }
}
