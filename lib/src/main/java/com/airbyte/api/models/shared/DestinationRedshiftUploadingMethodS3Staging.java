package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationRedshiftUploadingMethodS3Staging
 * The method how the data will be uploaded to the database.
**/
public class DestinationRedshiftUploadingMethodS3Staging {
    @JsonProperty("access_key_id")
    public String accessKeyId;
    public DestinationRedshiftUploadingMethodS3Staging withAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("encryption")
    public Object encryption;
    public DestinationRedshiftUploadingMethodS3Staging withEncryption(Object encryption) {
        this.encryption = encryption;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file_buffer_count")
    public Long fileBufferCount;
    public DestinationRedshiftUploadingMethodS3Staging withFileBufferCount(Long fileBufferCount) {
        this.fileBufferCount = fileBufferCount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file_name_pattern")
    public String fileNamePattern;
    public DestinationRedshiftUploadingMethodS3Staging withFileNamePattern(String fileNamePattern) {
        this.fileNamePattern = fileNamePattern;
        return this;
    }
    
    @JsonProperty("method")
    public DestinationRedshiftUploadingMethodS3StagingMethodEnum method;
    public DestinationRedshiftUploadingMethodS3Staging withMethod(DestinationRedshiftUploadingMethodS3StagingMethodEnum method) {
        this.method = method;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("purge_staging_data")
    public Boolean purgeStagingData;
    public DestinationRedshiftUploadingMethodS3Staging withPurgeStagingData(Boolean purgeStagingData) {
        this.purgeStagingData = purgeStagingData;
        return this;
    }
    
    @JsonProperty("s3_bucket_name")
    public String s3BucketName;
    public DestinationRedshiftUploadingMethodS3Staging withS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("s3_bucket_path")
    public String s3BucketPath;
    public DestinationRedshiftUploadingMethodS3Staging withS3BucketPath(String s3BucketPath) {
        this.s3BucketPath = s3BucketPath;
        return this;
    }
    
    @JsonProperty("s3_bucket_region")
    public DestinationRedshiftUploadingMethodS3StagingS3BucketRegionEnum s3BucketRegion;
    public DestinationRedshiftUploadingMethodS3Staging withS3BucketRegion(DestinationRedshiftUploadingMethodS3StagingS3BucketRegionEnum s3BucketRegion) {
        this.s3BucketRegion = s3BucketRegion;
        return this;
    }
    
    @JsonProperty("secret_access_key")
    public String secretAccessKey;
    public DestinationRedshiftUploadingMethodS3Staging withSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
        return this;
    }
    
}
