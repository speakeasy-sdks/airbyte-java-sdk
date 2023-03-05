package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationDatabricksDataSourceAmazonS3
 * Storage on which the delta lake is built.
**/
public class DestinationDatabricksDataSourceAmazonS3 {
    @JsonProperty("data_source_type")
    public DestinationDatabricksDataSourceAmazonS3DataSourceTypeEnum dataSourceType;
    public DestinationDatabricksDataSourceAmazonS3 withDataSourceType(DestinationDatabricksDataSourceAmazonS3DataSourceTypeEnum dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file_name_pattern")
    public String fileNamePattern;
    public DestinationDatabricksDataSourceAmazonS3 withFileNamePattern(String fileNamePattern) {
        this.fileNamePattern = fileNamePattern;
        return this;
    }
    
    @JsonProperty("s3_access_key_id")
    public String s3AccessKeyId;
    public DestinationDatabricksDataSourceAmazonS3 withS3AccessKeyId(String s3AccessKeyId) {
        this.s3AccessKeyId = s3AccessKeyId;
        return this;
    }
    
    @JsonProperty("s3_bucket_name")
    public String s3BucketName;
    public DestinationDatabricksDataSourceAmazonS3 withS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
        return this;
    }
    
    @JsonProperty("s3_bucket_path")
    public String s3BucketPath;
    public DestinationDatabricksDataSourceAmazonS3 withS3BucketPath(String s3BucketPath) {
        this.s3BucketPath = s3BucketPath;
        return this;
    }
    
    @JsonProperty("s3_bucket_region")
    public DestinationDatabricksDataSourceAmazonS3S3BucketRegionEnum s3BucketRegion;
    public DestinationDatabricksDataSourceAmazonS3 withS3BucketRegion(DestinationDatabricksDataSourceAmazonS3S3BucketRegionEnum s3BucketRegion) {
        this.s3BucketRegion = s3BucketRegion;
        return this;
    }
    
    @JsonProperty("s3_secret_access_key")
    public String s3SecretAccessKey;
    public DestinationDatabricksDataSourceAmazonS3 withS3SecretAccessKey(String s3SecretAccessKey) {
        this.s3SecretAccessKey = s3SecretAccessKey;
        return this;
    }
    
}
