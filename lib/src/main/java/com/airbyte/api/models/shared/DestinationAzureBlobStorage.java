package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationAzureBlobStorage
 * The values required to configure the destination.
**/
public class DestinationAzureBlobStorage {
    @JsonProperty("airbyte-destination-name")
    public DestinationAzureBlobStorageAzureBlobStorageEnum airbyteDestinationName;
    public DestinationAzureBlobStorage withAirbyteDestinationName(DestinationAzureBlobStorageAzureBlobStorageEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    @JsonProperty("azure_blob_storage_account_key")
    public String azureBlobStorageAccountKey;
    public DestinationAzureBlobStorage withAzureBlobStorageAccountKey(String azureBlobStorageAccountKey) {
        this.azureBlobStorageAccountKey = azureBlobStorageAccountKey;
        return this;
    }
    
    @JsonProperty("azure_blob_storage_account_name")
    public String azureBlobStorageAccountName;
    public DestinationAzureBlobStorage withAzureBlobStorageAccountName(String azureBlobStorageAccountName) {
        this.azureBlobStorageAccountName = azureBlobStorageAccountName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("azure_blob_storage_container_name")
    public String azureBlobStorageContainerName;
    public DestinationAzureBlobStorage withAzureBlobStorageContainerName(String azureBlobStorageContainerName) {
        this.azureBlobStorageContainerName = azureBlobStorageContainerName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("azure_blob_storage_endpoint_domain_name")
    public String azureBlobStorageEndpointDomainName;
    public DestinationAzureBlobStorage withAzureBlobStorageEndpointDomainName(String azureBlobStorageEndpointDomainName) {
        this.azureBlobStorageEndpointDomainName = azureBlobStorageEndpointDomainName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("azure_blob_storage_output_buffer_size")
    public Long azureBlobStorageOutputBufferSize;
    public DestinationAzureBlobStorage withAzureBlobStorageOutputBufferSize(Long azureBlobStorageOutputBufferSize) {
        this.azureBlobStorageOutputBufferSize = azureBlobStorageOutputBufferSize;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("azure_blob_storage_spill_size")
    public Long azureBlobStorageSpillSize;
    public DestinationAzureBlobStorage withAzureBlobStorageSpillSize(Long azureBlobStorageSpillSize) {
        this.azureBlobStorageSpillSize = azureBlobStorageSpillSize;
        return this;
    }
    
    @JsonProperty("format")
    public Object format;
    public DestinationAzureBlobStorage withFormat(Object format) {
        this.format = format;
        return this;
    }
    
}
