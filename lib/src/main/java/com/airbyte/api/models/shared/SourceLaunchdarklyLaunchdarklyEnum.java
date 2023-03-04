package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceLaunchdarklyLaunchdarklyEnum {
    LAUNCHDARKLY("launchdarkly");

    @JsonValue
    public final String value;

    private SourceLaunchdarklyLaunchdarklyEnum(String value) {
        this.value = value;
    }
}
