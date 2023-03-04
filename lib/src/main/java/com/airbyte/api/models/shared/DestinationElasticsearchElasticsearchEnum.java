package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationElasticsearchElasticsearchEnum {
    ELASTICSEARCH("elasticsearch");

    @JsonValue
    public final String value;

    private DestinationElasticsearchElasticsearchEnum(String value) {
        this.value = value;
    }
}
