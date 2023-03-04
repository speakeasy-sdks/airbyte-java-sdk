package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourcePunkApiPunkApiEnum {
    PUNK_API("punk-api");

    @JsonValue
    public final String value;

    private SourcePunkApiPunkApiEnum(String value) {
        this.value = value;
    }
}
