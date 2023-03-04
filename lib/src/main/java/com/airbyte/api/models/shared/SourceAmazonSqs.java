package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceAmazonSqs {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access_key")
    public String accessKey;
    public SourceAmazonSqs withAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    
    @JsonProperty("airbyte-source-name")
    public SourceAmazonSqsAmazonSqsEnum airbyteSourceName;
    public SourceAmazonSqs withAirbyteSourceName(SourceAmazonSqsAmazonSqsEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("attributes_to_return")
    public String attributesToReturn;
    public SourceAmazonSqs withAttributesToReturn(String attributesToReturn) {
        this.attributesToReturn = attributesToReturn;
        return this;
    }
    
    @JsonProperty("delete_messages")
    public Boolean deleteMessages;
    public SourceAmazonSqs withDeleteMessages(Boolean deleteMessages) {
        this.deleteMessages = deleteMessages;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_batch_size")
    public Long maxBatchSize;
    public SourceAmazonSqs withMaxBatchSize(Long maxBatchSize) {
        this.maxBatchSize = maxBatchSize;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_wait_time")
    public Long maxWaitTime;
    public SourceAmazonSqs withMaxWaitTime(Long maxWaitTime) {
        this.maxWaitTime = maxWaitTime;
        return this;
    }
    
    @JsonProperty("queue_url")
    public String queueUrl;
    public SourceAmazonSqs withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }
    
    @JsonProperty("region")
    public SourceAmazonSqsAWSRegionEnum region;
    public SourceAmazonSqs withRegion(SourceAmazonSqsAWSRegionEnum region) {
        this.region = region;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("secret_key")
    public String secretKey;
    public SourceAmazonSqs withSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("visibility_timeout")
    public Long visibilityTimeout;
    public SourceAmazonSqs withVisibilityTimeout(Long visibilityTimeout) {
        this.visibilityTimeout = visibilityTimeout;
        return this;
    }
    
}
