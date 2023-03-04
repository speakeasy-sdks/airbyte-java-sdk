package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceZendeskChatZendeskChatEnum {
    ZENDESK_CHAT("zendesk-chat");

    @JsonValue
    public final String value;

    private SourceZendeskChatZendeskChatEnum(String value) {
        this.value = value;
    }
}
