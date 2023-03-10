package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceSurveySparrowRegionGlobalAccountUrlBaseEnum {
    HTTPS_API_SURVEYSPARROW_COM_V3("https://api.surveysparrow.com/v3");

    @JsonValue
    public final String value;

    private SourceSurveySparrowRegionGlobalAccountUrlBaseEnum(String value) {
        this.value = value;
    }
}
