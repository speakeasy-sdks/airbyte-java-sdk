package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceGoogleAdsGoogleAdsEnum {
    GOOGLE_ADS("google-ads");

    @JsonValue
    public final String value;

    private SourceGoogleAdsGoogleAdsEnum(String value) {
        this.value = value;
    }
}
