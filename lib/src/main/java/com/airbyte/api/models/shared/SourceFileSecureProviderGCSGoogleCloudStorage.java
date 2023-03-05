package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceFileSecureProviderGCSGoogleCloudStorage
 * The storage Provider or Location of the file(s) which should be replicated.
**/
public class SourceFileSecureProviderGCSGoogleCloudStorage {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("service_account_json")
    public String serviceAccountJson;
    public SourceFileSecureProviderGCSGoogleCloudStorage withServiceAccountJson(String serviceAccountJson) {
        this.serviceAccountJson = serviceAccountJson;
        return this;
    }
    
    @JsonProperty("storage")
    public SourceFileSecureProviderGCSGoogleCloudStorageStorageEnum storage;
    public SourceFileSecureProviderGCSGoogleCloudStorage withStorage(SourceFileSecureProviderGCSGoogleCloudStorageStorageEnum storage) {
        this.storage = storage;
        return this;
    }
    
}
