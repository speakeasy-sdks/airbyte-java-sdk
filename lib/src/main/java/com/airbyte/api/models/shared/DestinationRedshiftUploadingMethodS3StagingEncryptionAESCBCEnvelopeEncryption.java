package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationRedshiftUploadingMethodS3StagingEncryptionAESCBCEnvelopeEncryption
 * Staging data will be encrypted using AES-CBC envelope encryption.
**/
public class DestinationRedshiftUploadingMethodS3StagingEncryptionAESCBCEnvelopeEncryption {
    @JsonProperty("encryption_type")
    public DestinationRedshiftUploadingMethodS3StagingEncryptionAESCBCEnvelopeEncryptionEncryptionTypeEnum encryptionType;
    public DestinationRedshiftUploadingMethodS3StagingEncryptionAESCBCEnvelopeEncryption withEncryptionType(DestinationRedshiftUploadingMethodS3StagingEncryptionAESCBCEnvelopeEncryptionEncryptionTypeEnum encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key_encrypting_key")
    public String keyEncryptingKey;
    public DestinationRedshiftUploadingMethodS3StagingEncryptionAESCBCEnvelopeEncryption withKeyEncryptingKey(String keyEncryptingKey) {
        this.keyEncryptingKey = keyEncryptingKey;
        return this;
    }
    
}
