package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceE2eTestCloud {
    @JsonProperty("airbyte-source-name")
    public SourceE2eTestCloudE2eTestCloudEnum airbyteSourceName;
    public SourceE2eTestCloud withAirbyteSourceName(SourceE2eTestCloudE2eTestCloudEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("max_messages")
    public Long maxMessages;
    public SourceE2eTestCloud withMaxMessages(Long maxMessages) {
        this.maxMessages = maxMessages;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message_interval_ms")
    public Long messageIntervalMs;
    public SourceE2eTestCloud withMessageIntervalMs(Long messageIntervalMs) {
        this.messageIntervalMs = messageIntervalMs;
        return this;
    }
    
    @JsonProperty("mock_catalog")
    public java.util.Map<String, Object> mockCatalog;
    public SourceE2eTestCloud withMockCatalog(java.util.Map<String, Object> mockCatalog) {
        this.mockCatalog = mockCatalog;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("seed")
    public Long seed;
    public SourceE2eTestCloud withSeed(Long seed) {
        this.seed = seed;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public SourceE2eTestCloudTypeEnum type;
    public SourceE2eTestCloud withType(SourceE2eTestCloudTypeEnum type) {
        this.type = type;
        return this;
    }
    
}
