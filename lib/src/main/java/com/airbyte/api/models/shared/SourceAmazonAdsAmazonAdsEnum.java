package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceAmazonAdsAmazonAdsEnum {
    AMAZON_ADS("amazon-ads");

    @JsonValue
    public final String value;

    private SourceAmazonAdsAmazonAdsEnum(String value) {
        this.value = value;
    }
}
