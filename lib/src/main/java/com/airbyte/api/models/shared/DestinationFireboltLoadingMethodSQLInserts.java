package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationFireboltLoadingMethodSQLInserts
 * Loading method used to select the way data will be uploaded to Firebolt
**/
public class DestinationFireboltLoadingMethodSQLInserts {
    @JsonProperty("method")
    public DestinationFireboltLoadingMethodSQLInsertsMethodEnum method;
    public DestinationFireboltLoadingMethodSQLInserts withMethod(DestinationFireboltLoadingMethodSQLInsertsMethodEnum method) {
        this.method = method;
        return this;
    }
    
}
