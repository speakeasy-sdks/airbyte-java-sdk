package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceGoogleDirectoryGoogleDirectoryEnum {
    GOOGLE_DIRECTORY("google-directory");

    @JsonValue
    public final String value;

    private SourceGoogleDirectoryGoogleDirectoryEnum(String value) {
        this.value = value;
    }
}
