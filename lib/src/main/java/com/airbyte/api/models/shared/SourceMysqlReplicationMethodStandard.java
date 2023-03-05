package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMysqlReplicationMethodStandard
 * Standard replication requires no setup on the DB side but will not be able to represent deletions incrementally.
**/
public class SourceMysqlReplicationMethodStandard {
    @JsonProperty("method")
    public SourceMysqlReplicationMethodStandardMethodEnum method;
    public SourceMysqlReplicationMethodStandard withMethod(SourceMysqlReplicationMethodStandardMethodEnum method) {
        this.method = method;
        return this;
    }
    
}
