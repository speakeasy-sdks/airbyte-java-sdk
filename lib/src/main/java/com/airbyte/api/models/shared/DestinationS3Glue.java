package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DestinationS3Glue {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access_key_id")
    public String accessKeyId;
    public DestinationS3Glue withAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    
    @JsonProperty("airbyte-destination-name")
    public DestinationS3GlueS3GlueEnum airbyteDestinationName;
    public DestinationS3Glue withAirbyteDestinationName(DestinationS3GlueS3GlueEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file_name_pattern")
    public String fileNamePattern;
    public DestinationS3Glue withFileNamePattern(String fileNamePattern) {
        this.fileNamePattern = fileNamePattern;
        return this;
    }
    
    @JsonProperty("format")
    public java.util.Map<String, Object> format;
    public DestinationS3Glue withFormat(java.util.Map<String, Object> format) {
        this.format = format;
        return this;
    }
    
    @JsonProperty("glue_database")
    public String glueDatabase;
    public DestinationS3Glue withGlueDatabase(String glueDatabase) {
        this.glueDatabase = glueDatabase;
        return this;
    }
    
    @JsonProperty("glue_serialization_library")
    public DestinationS3GlueSerializationLibraryEnum glueSerializationLibrary;
    public DestinationS3Glue withGlueSerializationLibrary(DestinationS3GlueSerializationLibraryEnum glueSerializationLibrary) {
        this.glueSerializationLibrary = glueSerializationLibrary;
        return this;
    }
    
    @JsonProperty("s3_bucket_name")
    public String s3BucketName;
    public DestinationS3Glue withS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
        return this;
    }
    
    @JsonProperty("s3_bucket_path")
    public String s3BucketPath;
    public DestinationS3Glue withS3BucketPath(String s3BucketPath) {
        this.s3BucketPath = s3BucketPath;
        return this;
    }
    
    @JsonProperty("s3_bucket_region")
    public DestinationS3GlueS3BucketRegionEnum s3BucketRegion;
    public DestinationS3Glue withS3BucketRegion(DestinationS3GlueS3BucketRegionEnum s3BucketRegion) {
        this.s3BucketRegion = s3BucketRegion;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("s3_endpoint")
    public String s3Endpoint;
    public DestinationS3Glue withS3Endpoint(String s3Endpoint) {
        this.s3Endpoint = s3Endpoint;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("s3_path_format")
    public String s3PathFormat;
    public DestinationS3Glue withS3PathFormat(String s3PathFormat) {
        this.s3PathFormat = s3PathFormat;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("secret_access_key")
    public String secretAccessKey;
    public DestinationS3Glue withSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
        return this;
    }
    
}
