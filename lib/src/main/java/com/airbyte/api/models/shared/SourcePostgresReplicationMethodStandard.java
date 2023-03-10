package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourcePostgresReplicationMethodStandard
 * Standard replication requires no setup on the DB side but will not be able to represent deletions incrementally.
**/
public class SourcePostgresReplicationMethodStandard {
    @JsonProperty("method")
    public SourcePostgresReplicationMethodStandardMethodEnum method;
    public SourcePostgresReplicationMethodStandard withMethod(SourcePostgresReplicationMethodStandardMethodEnum method) {
        this.method = method;
        return this;
    }
    
}
