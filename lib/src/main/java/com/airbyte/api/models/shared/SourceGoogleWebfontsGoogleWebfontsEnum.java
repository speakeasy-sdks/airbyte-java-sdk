package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceGoogleWebfontsGoogleWebfontsEnum {
    GOOGLE_WEBFONTS("google-webfonts");

    @JsonValue
    public final String value;

    private SourceGoogleWebfontsGoogleWebfontsEnum(String value) {
        this.value = value;
    }
}
