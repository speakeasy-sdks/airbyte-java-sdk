package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceZendeskTalkZendeskTalkEnum {
    ZENDESK_TALK("zendesk-talk");

    @JsonValue
    public final String value;

    private SourceZendeskTalkZendeskTalkEnum(String value) {
        this.value = value;
    }
}
