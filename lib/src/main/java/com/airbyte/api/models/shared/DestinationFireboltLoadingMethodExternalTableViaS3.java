package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationFireboltLoadingMethodExternalTableViaS3
 * Loading method used to select the way data will be uploaded to Firebolt
**/
public class DestinationFireboltLoadingMethodExternalTableViaS3 {
    @JsonProperty("aws_key_id")
    public String awsKeyId;
    public DestinationFireboltLoadingMethodExternalTableViaS3 withAwsKeyId(String awsKeyId) {
        this.awsKeyId = awsKeyId;
        return this;
    }
    
    @JsonProperty("aws_key_secret")
    public String awsKeySecret;
    public DestinationFireboltLoadingMethodExternalTableViaS3 withAwsKeySecret(String awsKeySecret) {
        this.awsKeySecret = awsKeySecret;
        return this;
    }
    
    @JsonProperty("method")
    public DestinationFireboltLoadingMethodExternalTableViaS3MethodEnum method;
    public DestinationFireboltLoadingMethodExternalTableViaS3 withMethod(DestinationFireboltLoadingMethodExternalTableViaS3MethodEnum method) {
        this.method = method;
        return this;
    }
    
    @JsonProperty("s3_bucket")
    public String s3Bucket;
    public DestinationFireboltLoadingMethodExternalTableViaS3 withS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
        return this;
    }
    
    @JsonProperty("s3_region")
    public String s3Region;
    public DestinationFireboltLoadingMethodExternalTableViaS3 withS3Region(String s3Region) {
        this.s3Region = s3Region;
        return this;
    }
    
}
