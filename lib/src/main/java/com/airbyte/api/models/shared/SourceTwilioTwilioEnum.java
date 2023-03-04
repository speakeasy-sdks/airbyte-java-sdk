package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceTwilioTwilioEnum {
    TWILIO("twilio");

    @JsonValue
    public final String value;

    private SourceTwilioTwilioEnum(String value) {
        this.value = value;
    }
}
