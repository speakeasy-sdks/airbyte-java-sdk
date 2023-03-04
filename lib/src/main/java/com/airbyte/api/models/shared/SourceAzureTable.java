package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceAzureTable {
    @JsonProperty("airbyte-source-name")
    public SourceAzureTableAzureTableEnum airbyteSourceName;
    public SourceAzureTable withAirbyteSourceName(SourceAzureTableAzureTableEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("storage_access_key")
    public String storageAccessKey;
    public SourceAzureTable withStorageAccessKey(String storageAccessKey) {
        this.storageAccessKey = storageAccessKey;
        return this;
    }
    
    @JsonProperty("storage_account_name")
    public String storageAccountName;
    public SourceAzureTable withStorageAccountName(String storageAccountName) {
        this.storageAccountName = storageAccountName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("storage_endpoint_suffix")
    public String storageEndpointSuffix;
    public SourceAzureTable withStorageEndpointSuffix(String storageEndpointSuffix) {
        this.storageEndpointSuffix = storageEndpointSuffix;
        return this;
    }
    
}
