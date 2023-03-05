package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceE2eTestCloudMockCatalogMultiSchemaTypeEnum {
    MULTI_STREAM("MULTI_STREAM");

    @JsonValue
    public final String value;

    private SourceE2eTestCloudMockCatalogMultiSchemaTypeEnum(String value) {
        this.value = value;
    }
}
