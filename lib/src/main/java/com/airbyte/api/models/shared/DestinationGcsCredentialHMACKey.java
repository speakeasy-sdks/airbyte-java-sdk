package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationGcsCredentialHMACKey
 * An HMAC key is a type of credential and can be associated with a service account or a user account in Cloud Storage. Read more <a href="https://cloud.google.com/storage/docs/authentication/hmackeys">here</a>.
**/
public class DestinationGcsCredentialHMACKey {
    @JsonProperty("credential_type")
    public DestinationGcsCredentialHMACKeyCredentialTypeEnum credentialType;
    public DestinationGcsCredentialHMACKey withCredentialType(DestinationGcsCredentialHMACKeyCredentialTypeEnum credentialType) {
        this.credentialType = credentialType;
        return this;
    }
    
    @JsonProperty("hmac_key_access_id")
    public String hmacKeyAccessId;
    public DestinationGcsCredentialHMACKey withHmacKeyAccessId(String hmacKeyAccessId) {
        this.hmacKeyAccessId = hmacKeyAccessId;
        return this;
    }
    
    @JsonProperty("hmac_key_secret")
    public String hmacKeySecret;
    public DestinationGcsCredentialHMACKey withHmacKeySecret(String hmacKeySecret) {
        this.hmacKeySecret = hmacKeySecret;
        return this;
    }
    
}
