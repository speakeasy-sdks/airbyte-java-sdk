package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceOrbOrbEnum {
    ORB("orb");

    @JsonValue
    public final String value;

    private SourceOrbOrbEnum(String value) {
        this.value = value;
    }
}
