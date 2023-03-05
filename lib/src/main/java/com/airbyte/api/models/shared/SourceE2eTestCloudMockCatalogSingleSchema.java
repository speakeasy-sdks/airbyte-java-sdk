package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceE2eTestCloudMockCatalogSingleSchema
 * A catalog with one or multiple streams that share the same schema.
**/
public class SourceE2eTestCloudMockCatalogSingleSchema {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("stream_duplication")
    public Long streamDuplication;
    public SourceE2eTestCloudMockCatalogSingleSchema withStreamDuplication(Long streamDuplication) {
        this.streamDuplication = streamDuplication;
        return this;
    }
    
    @JsonProperty("stream_name")
    public String streamName;
    public SourceE2eTestCloudMockCatalogSingleSchema withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    
    @JsonProperty("stream_schema")
    public String streamSchema;
    public SourceE2eTestCloudMockCatalogSingleSchema withStreamSchema(String streamSchema) {
        this.streamSchema = streamSchema;
        return this;
    }
    
    @JsonProperty("type")
    public SourceE2eTestCloudMockCatalogSingleSchemaTypeEnum type;
    public SourceE2eTestCloudMockCatalogSingleSchema withType(SourceE2eTestCloudMockCatalogSingleSchemaTypeEnum type) {
        this.type = type;
        return this;
    }
    
}
