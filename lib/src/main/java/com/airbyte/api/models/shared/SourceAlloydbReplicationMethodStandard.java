package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceAlloydbReplicationMethodStandard
 * Standard replication requires no setup on the DB side but will not be able to represent deletions incrementally.
**/
public class SourceAlloydbReplicationMethodStandard {
    @JsonProperty("method")
    public SourceAlloydbReplicationMethodStandardMethodEnum method;
    public SourceAlloydbReplicationMethodStandard withMethod(SourceAlloydbReplicationMethodStandardMethodEnum method) {
        this.method = method;
        return this;
    }
    
}
