package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceE2eTestCloudMockCatalogMultiSchema
 * A catalog with multiple data streams, each with a different schema.
**/
public class SourceE2eTestCloudMockCatalogMultiSchema {
    @JsonProperty("stream_schemas")
    public String streamSchemas;
    public SourceE2eTestCloudMockCatalogMultiSchema withStreamSchemas(String streamSchemas) {
        this.streamSchemas = streamSchemas;
        return this;
    }
    
    @JsonProperty("type")
    public SourceE2eTestCloudMockCatalogMultiSchemaTypeEnum type;
    public SourceE2eTestCloudMockCatalogMultiSchema withType(SourceE2eTestCloudMockCatalogMultiSchemaTypeEnum type) {
        this.type = type;
        return this;
    }
    
}
