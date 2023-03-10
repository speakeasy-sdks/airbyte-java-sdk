package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationSnowflakeLoadingMethodAWSS3StagingEncryptionAESCBCEnvelopeEncryptionEncryptionTypeEnum {
    AES_CBC_ENVELOPE("aes_cbc_envelope");

    @JsonValue
    public final String value;

    private DestinationSnowflakeLoadingMethodAWSS3StagingEncryptionAESCBCEnvelopeEncryptionEncryptionTypeEnum(String value) {
        this.value = value;
    }
}
