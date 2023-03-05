package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationSnowflakeLoadingMethodAWSS3StagingEncryptionAESCBCEnvelopeEncryption
 * Staging data will be encrypted using AES-CBC envelope encryption.
**/
public class DestinationSnowflakeLoadingMethodAWSS3StagingEncryptionAESCBCEnvelopeEncryption {
    @JsonProperty("encryption_type")
    public DestinationSnowflakeLoadingMethodAWSS3StagingEncryptionAESCBCEnvelopeEncryptionEncryptionTypeEnum encryptionType;
    public DestinationSnowflakeLoadingMethodAWSS3StagingEncryptionAESCBCEnvelopeEncryption withEncryptionType(DestinationSnowflakeLoadingMethodAWSS3StagingEncryptionAESCBCEnvelopeEncryptionEncryptionTypeEnum encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key_encrypting_key")
    public String keyEncryptingKey;
    public DestinationSnowflakeLoadingMethodAWSS3StagingEncryptionAESCBCEnvelopeEncryption withKeyEncryptingKey(String keyEncryptingKey) {
        this.keyEncryptingKey = keyEncryptingKey;
        return this;
    }
    
}
