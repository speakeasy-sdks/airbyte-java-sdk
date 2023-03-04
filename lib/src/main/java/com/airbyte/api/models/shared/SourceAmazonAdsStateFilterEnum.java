package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceAmazonAdsStateFilterEnum {
    ENABLED("enabled"),
    PAUSED("paused"),
    ARCHIVED("archived");

    @JsonValue
    public final String value;

    private SourceAmazonAdsStateFilterEnum(String value) {
        this.value = value;
    }
}
