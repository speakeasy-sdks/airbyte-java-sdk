package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationRedshiftUploadingMethodS3StagingEncryptionAESCBCEnvelopeEncryptionEncryptionTypeEnum {
    AES_CBC_ENVELOPE("aes_cbc_envelope");

    @JsonValue
    public final String value;

    private DestinationRedshiftUploadingMethodS3StagingEncryptionAESCBCEnvelopeEncryptionEncryptionTypeEnum(String value) {
        this.value = value;
    }
}
