package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceS3 {
    @JsonProperty("airbyte-source-name")
    public SourceS3S3Enum airbyteSourceName;
    public SourceS3 withAirbyteSourceName(SourceS3S3Enum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("dataset")
    public String dataset;
    public SourceS3 withDataset(String dataset) {
        this.dataset = dataset;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("format")
    public java.util.Map<String, Object> format;
    public SourceS3 withFormat(java.util.Map<String, Object> format) {
        this.format = format;
        return this;
    }
    
    @JsonProperty("path_pattern")
    public String pathPattern;
    public SourceS3 withPathPattern(String pathPattern) {
        this.pathPattern = pathPattern;
        return this;
    }
    
    @JsonProperty("provider")
    public SourceS3S3AmazonWebServices provider;
    public SourceS3 withProvider(SourceS3S3AmazonWebServices provider) {
        this.provider = provider;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schema")
    public String schema;
    public SourceS3 withSchema(String schema) {
        this.schema = schema;
        return this;
    }
    
}
