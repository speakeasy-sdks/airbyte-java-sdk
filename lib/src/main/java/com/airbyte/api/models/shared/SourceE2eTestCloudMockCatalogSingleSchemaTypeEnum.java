package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceE2eTestCloudMockCatalogSingleSchemaTypeEnum {
    SINGLE_STREAM("SINGLE_STREAM");

    @JsonValue
    public final String value;

    private SourceE2eTestCloudMockCatalogSingleSchemaTypeEnum(String value) {
        this.value = value;
    }
}
