package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceTheGuardianApiTheGuardianApiEnum {
    THE_GUARDIAN_API("the-guardian-api");

    @JsonValue
    public final String value;

    private SourceTheGuardianApiTheGuardianApiEnum(String value) {
        this.value = value;
    }
}
