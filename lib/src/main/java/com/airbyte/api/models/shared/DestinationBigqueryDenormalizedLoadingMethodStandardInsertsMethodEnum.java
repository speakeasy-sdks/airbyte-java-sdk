package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationBigqueryDenormalizedLoadingMethodStandardInsertsMethodEnum {
    STANDARD("Standard");

    @JsonValue
    public final String value;

    private DestinationBigqueryDenormalizedLoadingMethodStandardInsertsMethodEnum(String value) {
        this.value = value;
    }
}
