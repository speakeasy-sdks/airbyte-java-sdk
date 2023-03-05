package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMysqlReplicationMethodLogicalReplicationCDC
 * CDC uses the Binlog to detect inserts, updates, and deletes. This needs to be configured on the source database itself.
**/
public class SourceMysqlReplicationMethodLogicalReplicationCDC {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("initial_waiting_seconds")
    public Long initialWaitingSeconds;
    public SourceMysqlReplicationMethodLogicalReplicationCDC withInitialWaitingSeconds(Long initialWaitingSeconds) {
        this.initialWaitingSeconds = initialWaitingSeconds;
        return this;
    }
    
    @JsonProperty("method")
    public SourceMysqlReplicationMethodLogicalReplicationCDCMethodEnum method;
    public SourceMysqlReplicationMethodLogicalReplicationCDC withMethod(SourceMysqlReplicationMethodLogicalReplicationCDCMethodEnum method) {
        this.method = method;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("server_time_zone")
    public String serverTimeZone;
    public SourceMysqlReplicationMethodLogicalReplicationCDC withServerTimeZone(String serverTimeZone) {
        this.serverTimeZone = serverTimeZone;
        return this;
    }
    
}
