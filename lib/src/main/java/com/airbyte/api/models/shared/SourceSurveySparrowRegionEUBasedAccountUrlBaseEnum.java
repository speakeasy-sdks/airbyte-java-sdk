package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceSurveySparrowRegionEUBasedAccountUrlBaseEnum {
    HTTPS_EU_API_SURVEYSPARROW_COM_V3("https://eu-api.surveysparrow.com/v3");

    @JsonValue
    public final String value;

    private SourceSurveySparrowRegionEUBasedAccountUrlBaseEnum(String value) {
        this.value = value;
    }
}
