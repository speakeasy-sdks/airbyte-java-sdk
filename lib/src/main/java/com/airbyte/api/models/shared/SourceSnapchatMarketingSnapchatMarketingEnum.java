package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceSnapchatMarketingSnapchatMarketingEnum {
    SNAPCHAT_MARKETING("snapchat-marketing");

    @JsonValue
    public final String value;

    private SourceSnapchatMarketingSnapchatMarketingEnum(String value) {
        this.value = value;
    }
}
