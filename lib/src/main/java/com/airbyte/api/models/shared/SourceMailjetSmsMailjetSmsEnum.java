package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceMailjetSmsMailjetSmsEnum {
    MAILJET_SMS("mailjet-sms");

    @JsonValue
    public final String value;

    private SourceMailjetSmsMailjetSmsEnum(String value) {
        this.value = value;
    }
}
