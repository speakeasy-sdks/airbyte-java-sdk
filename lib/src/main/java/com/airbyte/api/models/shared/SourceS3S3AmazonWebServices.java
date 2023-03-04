package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceS3S3AmazonWebServices
 * Use this to load files from S3 or S3-compatible services
**/
public class SourceS3S3AmazonWebServices {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("aws_access_key_id")
    public String awsAccessKeyId;
    public SourceS3S3AmazonWebServices withAwsAccessKeyId(String awsAccessKeyId) {
        this.awsAccessKeyId = awsAccessKeyId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("aws_secret_access_key")
    public String awsSecretAccessKey;
    public SourceS3S3AmazonWebServices withAwsSecretAccessKey(String awsSecretAccessKey) {
        this.awsSecretAccessKey = awsSecretAccessKey;
        return this;
    }
    
    @JsonProperty("bucket")
    public String bucket;
    public SourceS3S3AmazonWebServices withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("endpoint")
    public String endpoint;
    public SourceS3S3AmazonWebServices withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("path_prefix")
    public String pathPrefix;
    public SourceS3S3AmazonWebServices withPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
        return this;
    }
    
}
