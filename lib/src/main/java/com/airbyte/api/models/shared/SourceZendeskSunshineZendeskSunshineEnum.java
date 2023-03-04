package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceZendeskSunshineZendeskSunshineEnum {
    ZENDESK_SUNSHINE("zendesk-sunshine");

    @JsonValue
    public final String value;

    private SourceZendeskSunshineZendeskSunshineEnum(String value) {
        this.value = value;
    }
}
