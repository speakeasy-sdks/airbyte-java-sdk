package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationPulsar
 * The values required to configure the destination.
**/
public class DestinationPulsar {
    @JsonProperty("airbyte-destination-name")
    public DestinationPulsarPulsarEnum airbyteDestinationName;
    public DestinationPulsar withAirbyteDestinationName(DestinationPulsarPulsarEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    @JsonProperty("batching_enabled")
    public Boolean batchingEnabled;
    public DestinationPulsar withBatchingEnabled(Boolean batchingEnabled) {
        this.batchingEnabled = batchingEnabled;
        return this;
    }
    
    @JsonProperty("batching_max_messages")
    public Long batchingMaxMessages;
    public DestinationPulsar withBatchingMaxMessages(Long batchingMaxMessages) {
        this.batchingMaxMessages = batchingMaxMessages;
        return this;
    }
    
    @JsonProperty("batching_max_publish_delay")
    public Long batchingMaxPublishDelay;
    public DestinationPulsar withBatchingMaxPublishDelay(Long batchingMaxPublishDelay) {
        this.batchingMaxPublishDelay = batchingMaxPublishDelay;
        return this;
    }
    
    @JsonProperty("block_if_queue_full")
    public Boolean blockIfQueueFull;
    public DestinationPulsar withBlockIfQueueFull(Boolean blockIfQueueFull) {
        this.blockIfQueueFull = blockIfQueueFull;
        return this;
    }
    
    @JsonProperty("brokers")
    public String brokers;
    public DestinationPulsar withBrokers(String brokers) {
        this.brokers = brokers;
        return this;
    }
    
    @JsonProperty("compression_type")
    public DestinationPulsarCompressionTypeEnum compressionType;
    public DestinationPulsar withCompressionType(DestinationPulsarCompressionTypeEnum compressionType) {
        this.compressionType = compressionType;
        return this;
    }
    
    @JsonProperty("max_pending_messages")
    public Long maxPendingMessages;
    public DestinationPulsar withMaxPendingMessages(Long maxPendingMessages) {
        this.maxPendingMessages = maxPendingMessages;
        return this;
    }
    
    @JsonProperty("max_pending_messages_across_partitions")
    public Long maxPendingMessagesAcrossPartitions;
    public DestinationPulsar withMaxPendingMessagesAcrossPartitions(Long maxPendingMessagesAcrossPartitions) {
        this.maxPendingMessagesAcrossPartitions = maxPendingMessagesAcrossPartitions;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("producer_name")
    public String producerName;
    public DestinationPulsar withProducerName(String producerName) {
        this.producerName = producerName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("producer_sync")
    public Boolean producerSync;
    public DestinationPulsar withProducerSync(Boolean producerSync) {
        this.producerSync = producerSync;
        return this;
    }
    
    @JsonProperty("send_timeout_ms")
    public Long sendTimeoutMs;
    public DestinationPulsar withSendTimeoutMs(Long sendTimeoutMs) {
        this.sendTimeoutMs = sendTimeoutMs;
        return this;
    }
    
    @JsonProperty("topic_namespace")
    public String topicNamespace;
    public DestinationPulsar withTopicNamespace(String topicNamespace) {
        this.topicNamespace = topicNamespace;
        return this;
    }
    
    @JsonProperty("topic_pattern")
    public String topicPattern;
    public DestinationPulsar withTopicPattern(String topicPattern) {
        this.topicPattern = topicPattern;
        return this;
    }
    
    @JsonProperty("topic_tenant")
    public String topicTenant;
    public DestinationPulsar withTopicTenant(String topicTenant) {
        this.topicTenant = topicTenant;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("topic_test")
    public String topicTest;
    public DestinationPulsar withTopicTest(String topicTest) {
        this.topicTest = topicTest;
        return this;
    }
    
    @JsonProperty("topic_type")
    public DestinationPulsarTopicTypeEnum topicType;
    public DestinationPulsar withTopicType(DestinationPulsarTopicTypeEnum topicType) {
        this.topicType = topicType;
        return this;
    }
    
    @JsonProperty("use_tls")
    public Boolean useTls;
    public DestinationPulsar withUseTls(Boolean useTls) {
        this.useTls = useTls;
        return this;
    }
    
}
