package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceHarvest {
    @JsonProperty("account_id")
    public String accountId;
    public SourceHarvest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    
    @JsonProperty("airbyte-source-name")
    public SourceHarvestHarvestEnum airbyteSourceName;
    public SourceHarvest withAirbyteSourceName(SourceHarvestHarvestEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public java.util.Map<String, Object> credentials;
    public SourceHarvest withCredentials(java.util.Map<String, Object> credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("replication_end_date")
    public String replicationEndDate;
    public SourceHarvest withReplicationEndDate(String replicationEndDate) {
        this.replicationEndDate = replicationEndDate;
        return this;
    }
    
    @JsonProperty("replication_start_date")
    public String replicationStartDate;
    public SourceHarvest withReplicationStartDate(String replicationStartDate) {
        this.replicationStartDate = replicationStartDate;
        return this;
    }
    
}
