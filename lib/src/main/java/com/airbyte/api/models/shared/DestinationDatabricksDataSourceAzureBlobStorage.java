package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationDatabricksDataSourceAzureBlobStorage
 * Storage on which the delta lake is built.
**/
public class DestinationDatabricksDataSourceAzureBlobStorage {
    @JsonProperty("azure_blob_storage_account_name")
    public String azureBlobStorageAccountName;
    public DestinationDatabricksDataSourceAzureBlobStorage withAzureBlobStorageAccountName(String azureBlobStorageAccountName) {
        this.azureBlobStorageAccountName = azureBlobStorageAccountName;
        return this;
    }
    
    @JsonProperty("azure_blob_storage_container_name")
    public String azureBlobStorageContainerName;
    public DestinationDatabricksDataSourceAzureBlobStorage withAzureBlobStorageContainerName(String azureBlobStorageContainerName) {
        this.azureBlobStorageContainerName = azureBlobStorageContainerName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("azure_blob_storage_endpoint_domain_name")
    public String azureBlobStorageEndpointDomainName;
    public DestinationDatabricksDataSourceAzureBlobStorage withAzureBlobStorageEndpointDomainName(String azureBlobStorageEndpointDomainName) {
        this.azureBlobStorageEndpointDomainName = azureBlobStorageEndpointDomainName;
        return this;
    }
    
    @JsonProperty("azure_blob_storage_sas_token")
    public String azureBlobStorageSasToken;
    public DestinationDatabricksDataSourceAzureBlobStorage withAzureBlobStorageSasToken(String azureBlobStorageSasToken) {
        this.azureBlobStorageSasToken = azureBlobStorageSasToken;
        return this;
    }
    
    @JsonProperty("data_source_type")
    public DestinationDatabricksDataSourceAzureBlobStorageDataSourceTypeEnum dataSourceType;
    public DestinationDatabricksDataSourceAzureBlobStorage withDataSourceType(DestinationDatabricksDataSourceAzureBlobStorageDataSourceTypeEnum dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    
}
