package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceOracleConnectionDataSystemIDSID
 * Use SID (Oracle System Identifier)
**/
public class SourceOracleConnectionDataSystemIDSID {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("connection_type")
    public SourceOracleConnectionDataSystemIDSIDConnectionTypeEnum connectionType;
    public SourceOracleConnectionDataSystemIDSID withConnectionType(SourceOracleConnectionDataSystemIDSIDConnectionTypeEnum connectionType) {
        this.connectionType = connectionType;
        return this;
    }
    
    @JsonProperty("sid")
    public String sid;
    public SourceOracleConnectionDataSystemIDSID withSid(String sid) {
        this.sid = sid;
        return this;
    }
    
}
