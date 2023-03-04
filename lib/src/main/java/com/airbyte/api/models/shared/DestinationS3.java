package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DestinationS3 {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access_key_id")
    public String accessKeyId;
    public DestinationS3 withAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    
    @JsonProperty("airbyte-destination-name")
    public DestinationS3S3Enum airbyteDestinationName;
    public DestinationS3 withAirbyteDestinationName(DestinationS3S3Enum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file_name_pattern")
    public String fileNamePattern;
    public DestinationS3 withFileNamePattern(String fileNamePattern) {
        this.fileNamePattern = fileNamePattern;
        return this;
    }
    
    @JsonProperty("format")
    public java.util.Map<String, Object> format;
    public DestinationS3 withFormat(java.util.Map<String, Object> format) {
        this.format = format;
        return this;
    }
    
    @JsonProperty("s3_bucket_name")
    public String s3BucketName;
    public DestinationS3 withS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
        return this;
    }
    
    @JsonProperty("s3_bucket_path")
    public String s3BucketPath;
    public DestinationS3 withS3BucketPath(String s3BucketPath) {
        this.s3BucketPath = s3BucketPath;
        return this;
    }
    
    @JsonProperty("s3_bucket_region")
    public DestinationS3S3BucketRegionEnum s3BucketRegion;
    public DestinationS3 withS3BucketRegion(DestinationS3S3BucketRegionEnum s3BucketRegion) {
        this.s3BucketRegion = s3BucketRegion;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("s3_endpoint")
    public String s3Endpoint;
    public DestinationS3 withS3Endpoint(String s3Endpoint) {
        this.s3Endpoint = s3Endpoint;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("s3_path_format")
    public String s3PathFormat;
    public DestinationS3 withS3PathFormat(String s3PathFormat) {
        this.s3PathFormat = s3PathFormat;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("secret_access_key")
    public String secretAccessKey;
    public DestinationS3 withSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
        return this;
    }
    
}
