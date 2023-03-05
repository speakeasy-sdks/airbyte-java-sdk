package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationSnowflakeLoadingMethodAzureBlobStorageStaging
 * Recommended for large production workloads for better speed and scalability.
**/
public class DestinationSnowflakeLoadingMethodAzureBlobStorageStaging {
    @JsonProperty("azure_blob_storage_account_name")
    public String azureBlobStorageAccountName;
    public DestinationSnowflakeLoadingMethodAzureBlobStorageStaging withAzureBlobStorageAccountName(String azureBlobStorageAccountName) {
        this.azureBlobStorageAccountName = azureBlobStorageAccountName;
        return this;
    }
    
    @JsonProperty("azure_blob_storage_container_name")
    public String azureBlobStorageContainerName;
    public DestinationSnowflakeLoadingMethodAzureBlobStorageStaging withAzureBlobStorageContainerName(String azureBlobStorageContainerName) {
        this.azureBlobStorageContainerName = azureBlobStorageContainerName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("azure_blob_storage_endpoint_domain_name")
    public String azureBlobStorageEndpointDomainName;
    public DestinationSnowflakeLoadingMethodAzureBlobStorageStaging withAzureBlobStorageEndpointDomainName(String azureBlobStorageEndpointDomainName) {
        this.azureBlobStorageEndpointDomainName = azureBlobStorageEndpointDomainName;
        return this;
    }
    
    @JsonProperty("azure_blob_storage_sas_token")
    public String azureBlobStorageSasToken;
    public DestinationSnowflakeLoadingMethodAzureBlobStorageStaging withAzureBlobStorageSasToken(String azureBlobStorageSasToken) {
        this.azureBlobStorageSasToken = azureBlobStorageSasToken;
        return this;
    }
    
    @JsonProperty("method")
    public DestinationSnowflakeLoadingMethodAzureBlobStorageStagingMethodEnum method;
    public DestinationSnowflakeLoadingMethodAzureBlobStorageStaging withMethod(DestinationSnowflakeLoadingMethodAzureBlobStorageStagingMethodEnum method) {
        this.method = method;
        return this;
    }
    
}
