package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceAmazonAdsRegionEnum {
    NA("NA"),
    EU("EU"),
    FE("FE");

    @JsonValue
    public final String value;

    private SourceAmazonAdsRegionEnum(String value) {
        this.value = value;
    }
}
