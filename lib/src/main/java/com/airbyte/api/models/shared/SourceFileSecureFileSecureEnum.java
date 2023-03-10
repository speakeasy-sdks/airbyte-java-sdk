package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceFileSecureFileSecureEnum {
    FILE_SECURE("file-secure");

    @JsonValue
    public final String value;

    private SourceFileSecureFileSecureEnum(String value) {
        this.value = value;
    }
}
