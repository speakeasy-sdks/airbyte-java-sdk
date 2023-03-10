package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMssqlReplicationMethodStandard
 * Standard replication requires no setup on the DB side but will not be able to represent deletions incrementally.
**/
public class SourceMssqlReplicationMethodStandard {
    @JsonProperty("method")
    public SourceMssqlReplicationMethodStandardMethodEnum method;
    public SourceMssqlReplicationMethodStandard withMethod(SourceMssqlReplicationMethodStandardMethodEnum method) {
        this.method = method;
        return this;
    }
    
}
