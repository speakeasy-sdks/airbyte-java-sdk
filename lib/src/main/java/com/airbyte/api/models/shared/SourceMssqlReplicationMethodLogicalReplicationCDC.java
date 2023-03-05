package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMssqlReplicationMethodLogicalReplicationCDC
 * CDC uses {TBC} to detect inserts, updates, and deletes. This needs to be configured on the source database itself.
**/
public class SourceMssqlReplicationMethodLogicalReplicationCDC {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data_to_sync")
    public SourceMssqlReplicationMethodLogicalReplicationCDCDataToSyncEnum dataToSync;
    public SourceMssqlReplicationMethodLogicalReplicationCDC withDataToSync(SourceMssqlReplicationMethodLogicalReplicationCDCDataToSyncEnum dataToSync) {
        this.dataToSync = dataToSync;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("initial_waiting_seconds")
    public Long initialWaitingSeconds;
    public SourceMssqlReplicationMethodLogicalReplicationCDC withInitialWaitingSeconds(Long initialWaitingSeconds) {
        this.initialWaitingSeconds = initialWaitingSeconds;
        return this;
    }
    
    @JsonProperty("method")
    public SourceMssqlReplicationMethodLogicalReplicationCDCMethodEnum method;
    public SourceMssqlReplicationMethodLogicalReplicationCDC withMethod(SourceMssqlReplicationMethodLogicalReplicationCDCMethodEnum method) {
        this.method = method;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("snapshot_isolation")
    public SourceMssqlReplicationMethodLogicalReplicationCDCInitialSnapshotIsolationLevelEnum snapshotIsolation;
    public SourceMssqlReplicationMethodLogicalReplicationCDC withSnapshotIsolation(SourceMssqlReplicationMethodLogicalReplicationCDCInitialSnapshotIsolationLevelEnum snapshotIsolation) {
        this.snapshotIsolation = snapshotIsolation;
        return this;
    }
    
}
