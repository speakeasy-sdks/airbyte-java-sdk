package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceOracleConnectionDataServiceName
 * Use service name
**/
public class SourceOracleConnectionDataServiceName {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("connection_type")
    public SourceOracleConnectionDataServiceNameConnectionTypeEnum connectionType;
    public SourceOracleConnectionDataServiceName withConnectionType(SourceOracleConnectionDataServiceNameConnectionTypeEnum connectionType) {
        this.connectionType = connectionType;
        return this;
    }
    
    @JsonProperty("service_name")
    public String serviceName;
    public SourceOracleConnectionDataServiceName withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    
}
