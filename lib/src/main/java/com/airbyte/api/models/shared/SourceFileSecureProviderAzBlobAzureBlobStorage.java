package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceFileSecureProviderAzBlobAzureBlobStorage
 * The storage Provider or Location of the file(s) which should be replicated.
**/
public class SourceFileSecureProviderAzBlobAzureBlobStorage {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sas_token")
    public String sasToken;
    public SourceFileSecureProviderAzBlobAzureBlobStorage withSasToken(String sasToken) {
        this.sasToken = sasToken;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shared_key")
    public String sharedKey;
    public SourceFileSecureProviderAzBlobAzureBlobStorage withSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
        return this;
    }
    
    @JsonProperty("storage")
    public SourceFileSecureProviderAzBlobAzureBlobStorageStorageEnum storage;
    public SourceFileSecureProviderAzBlobAzureBlobStorage withStorage(SourceFileSecureProviderAzBlobAzureBlobStorageStorageEnum storage) {
        this.storage = storage;
        return this;
    }
    
    @JsonProperty("storage_account")
    public String storageAccount;
    public SourceFileSecureProviderAzBlobAzureBlobStorage withStorageAccount(String storageAccount) {
        this.storageAccount = storageAccount;
        return this;
    }
    
}
