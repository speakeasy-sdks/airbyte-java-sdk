package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceWhiskyHunterWhiskyHunterEnum {
    WHISKY_HUNTER("whisky-hunter");

    @JsonValue
    public final String value;

    private SourceWhiskyHunterWhiskyHunterEnum(String value) {
        this.value = value;
    }
}
