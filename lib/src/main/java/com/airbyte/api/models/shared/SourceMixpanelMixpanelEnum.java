package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceMixpanelMixpanelEnum {
    MIXPANEL("mixpanel");

    @JsonValue
    public final String value;

    private SourceMixpanelMixpanelEnum(String value) {
        this.value = value;
    }
}
