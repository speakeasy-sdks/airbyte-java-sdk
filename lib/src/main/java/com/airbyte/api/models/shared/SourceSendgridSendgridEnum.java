package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceSendgridSendgridEnum {
    SENDGRID("sendgrid");

    @JsonValue
    public final String value;

    private SourceSendgridSendgridEnum(String value) {
        this.value = value;
    }
}
