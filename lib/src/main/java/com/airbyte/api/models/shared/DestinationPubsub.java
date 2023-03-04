package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DestinationPubsub {
    @JsonProperty("airbyte-destination-name")
    public DestinationPubsubPubsubEnum airbyteDestinationName;
    public DestinationPubsub withAirbyteDestinationName(DestinationPubsubPubsubEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("batching_delay_threshold")
    public Long batchingDelayThreshold;
    public DestinationPubsub withBatchingDelayThreshold(Long batchingDelayThreshold) {
        this.batchingDelayThreshold = batchingDelayThreshold;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("batching_element_count_threshold")
    public Long batchingElementCountThreshold;
    public DestinationPubsub withBatchingElementCountThreshold(Long batchingElementCountThreshold) {
        this.batchingElementCountThreshold = batchingElementCountThreshold;
        return this;
    }
    
    @JsonProperty("batching_enabled")
    public Boolean batchingEnabled;
    public DestinationPubsub withBatchingEnabled(Boolean batchingEnabled) {
        this.batchingEnabled = batchingEnabled;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("batching_request_bytes_threshold")
    public Long batchingRequestBytesThreshold;
    public DestinationPubsub withBatchingRequestBytesThreshold(Long batchingRequestBytesThreshold) {
        this.batchingRequestBytesThreshold = batchingRequestBytesThreshold;
        return this;
    }
    
    @JsonProperty("credentials_json")
    public String credentialsJson;
    public DestinationPubsub withCredentialsJson(String credentialsJson) {
        this.credentialsJson = credentialsJson;
        return this;
    }
    
    @JsonProperty("ordering_enabled")
    public Boolean orderingEnabled;
    public DestinationPubsub withOrderingEnabled(Boolean orderingEnabled) {
        this.orderingEnabled = orderingEnabled;
        return this;
    }
    
    @JsonProperty("project_id")
    public String projectId;
    public DestinationPubsub withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    
    @JsonProperty("topic_id")
    public String topicId;
    public DestinationPubsub withTopicId(String topicId) {
        this.topicId = topicId;
        return this;
    }
    
}
