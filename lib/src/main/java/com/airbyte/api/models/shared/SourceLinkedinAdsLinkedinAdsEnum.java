package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceLinkedinAdsLinkedinAdsEnum {
    LINKEDIN_ADS("linkedin-ads");

    @JsonValue
    public final String value;

    private SourceLinkedinAdsLinkedinAdsEnum(String value) {
        this.value = value;
    }
}
