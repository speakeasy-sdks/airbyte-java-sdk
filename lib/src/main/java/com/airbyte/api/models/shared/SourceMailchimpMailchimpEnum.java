package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceMailchimpMailchimpEnum {
    MAILCHIMP("mailchimp");

    @JsonValue
    public final String value;

    private SourceMailchimpMailchimpEnum(String value) {
        this.value = value;
    }
}
