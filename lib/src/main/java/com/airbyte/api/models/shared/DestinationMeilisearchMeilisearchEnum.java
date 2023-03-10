package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationMeilisearchMeilisearchEnum {
    MEILISEARCH("meilisearch");

    @JsonValue
    public final String value;

    private DestinationMeilisearchMeilisearchEnum(String value) {
        this.value = value;
    }
}
