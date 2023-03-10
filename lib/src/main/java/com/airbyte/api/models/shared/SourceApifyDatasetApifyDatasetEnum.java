package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceApifyDatasetApifyDatasetEnum {
    APIFY_DATASET("apify-dataset");

    @JsonValue
    public final String value;

    private SourceApifyDatasetApifyDatasetEnum(String value) {
        this.value = value;
    }
}
