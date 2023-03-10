package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationSnowflakeLoadingMethodAWSS3StagingEncryptionNoEncryption
 * Staging data will be stored in plaintext.
**/
public class DestinationSnowflakeLoadingMethodAWSS3StagingEncryptionNoEncryption {
    @JsonProperty("encryption_type")
    public DestinationSnowflakeLoadingMethodAWSS3StagingEncryptionNoEncryptionEncryptionTypeEnum encryptionType;
    public DestinationSnowflakeLoadingMethodAWSS3StagingEncryptionNoEncryption withEncryptionType(DestinationSnowflakeLoadingMethodAWSS3StagingEncryptionNoEncryptionEncryptionTypeEnum encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }
    
}
