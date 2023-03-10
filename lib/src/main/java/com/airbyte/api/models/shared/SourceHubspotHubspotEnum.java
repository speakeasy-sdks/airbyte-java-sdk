package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceHubspotHubspotEnum {
    HUBSPOT("hubspot");

    @JsonValue
    public final String value;

    private SourceHubspotHubspotEnum(String value) {
        this.value = value;
    }
}
