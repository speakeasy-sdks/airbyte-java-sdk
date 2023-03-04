package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceTiktokMarketingTiktokMarketingEnum {
    TIKTOK_MARKETING("tiktok-marketing");

    @JsonValue
    public final String value;

    private SourceTiktokMarketingTiktokMarketingEnum(String value) {
        this.value = value;
    }
}
