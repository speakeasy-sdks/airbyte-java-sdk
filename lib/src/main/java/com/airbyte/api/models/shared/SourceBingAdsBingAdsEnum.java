package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceBingAdsBingAdsEnum {
    BING_ADS("bing-ads");

    @JsonValue
    public final String value;

    private SourceBingAdsBingAdsEnum(String value) {
        this.value = value;
    }
}
