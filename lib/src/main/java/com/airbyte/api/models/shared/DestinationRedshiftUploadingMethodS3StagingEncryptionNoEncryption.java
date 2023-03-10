package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationRedshiftUploadingMethodS3StagingEncryptionNoEncryption
 * Staging data will be stored in plaintext.
**/
public class DestinationRedshiftUploadingMethodS3StagingEncryptionNoEncryption {
    @JsonProperty("encryption_type")
    public DestinationRedshiftUploadingMethodS3StagingEncryptionNoEncryptionEncryptionTypeEnum encryptionType;
    public DestinationRedshiftUploadingMethodS3StagingEncryptionNoEncryption withEncryptionType(DestinationRedshiftUploadingMethodS3StagingEncryptionNoEncryptionEncryptionTypeEnum encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }
    
}
