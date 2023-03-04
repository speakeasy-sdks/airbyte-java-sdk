package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceZendeskSupportZendeskSupportEnum {
    ZENDESK_SUPPORT("zendesk-support");

    @JsonValue
    public final String value;

    private SourceZendeskSupportZendeskSupportEnum(String value) {
        this.value = value;
    }
}
