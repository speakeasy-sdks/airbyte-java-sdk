package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DestinationKinesis {
    @JsonProperty("accessKey")
    public String accessKey;
    public DestinationKinesis withAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    
    @JsonProperty("airbyte-destination-name")
    public DestinationKinesisKinesisEnum airbyteDestinationName;
    public DestinationKinesis withAirbyteDestinationName(DestinationKinesisKinesisEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    @JsonProperty("bufferSize")
    public Long bufferSize;
    public DestinationKinesis withBufferSize(Long bufferSize) {
        this.bufferSize = bufferSize;
        return this;
    }
    
    @JsonProperty("endpoint")
    public String endpoint;
    public DestinationKinesis withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    
    @JsonProperty("privateKey")
    public String privateKey;
    public DestinationKinesis withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    
    @JsonProperty("region")
    public String region;
    public DestinationKinesis withRegion(String region) {
        this.region = region;
        return this;
    }
    
    @JsonProperty("shardCount")
    public Long shardCount;
    public DestinationKinesis withShardCount(Long shardCount) {
        this.shardCount = shardCount;
        return this;
    }
    
}
