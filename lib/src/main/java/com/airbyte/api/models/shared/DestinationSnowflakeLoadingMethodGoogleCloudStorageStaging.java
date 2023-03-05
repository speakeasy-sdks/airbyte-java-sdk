package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationSnowflakeLoadingMethodGoogleCloudStorageStaging
 * Recommended for large production workloads for better speed and scalability.
**/
public class DestinationSnowflakeLoadingMethodGoogleCloudStorageStaging {
    @JsonProperty("bucket_name")
    public String bucketName;
    public DestinationSnowflakeLoadingMethodGoogleCloudStorageStaging withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    
    @JsonProperty("credentials_json")
    public String credentialsJson;
    public DestinationSnowflakeLoadingMethodGoogleCloudStorageStaging withCredentialsJson(String credentialsJson) {
        this.credentialsJson = credentialsJson;
        return this;
    }
    
    @JsonProperty("method")
    public DestinationSnowflakeLoadingMethodGoogleCloudStorageStagingMethodEnum method;
    public DestinationSnowflakeLoadingMethodGoogleCloudStorageStaging withMethod(DestinationSnowflakeLoadingMethodGoogleCloudStorageStagingMethodEnum method) {
        this.method = method;
        return this;
    }
    
    @JsonProperty("project_id")
    public String projectId;
    public DestinationSnowflakeLoadingMethodGoogleCloudStorageStaging withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    
}
