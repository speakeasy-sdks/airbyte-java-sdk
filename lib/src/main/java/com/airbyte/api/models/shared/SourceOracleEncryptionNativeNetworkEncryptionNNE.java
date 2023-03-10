package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceOracleEncryptionNativeNetworkEncryptionNNE
 * The native network encryption gives you the ability to encrypt database connections, without the configuration overhead of TCP/IP and SSL/TLS and without the need to open and listen on different ports.
**/
public class SourceOracleEncryptionNativeNetworkEncryptionNNE {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("encryption_algorithm")
    public SourceOracleEncryptionNativeNetworkEncryptionNNEEncryptionAlgorithmEnum encryptionAlgorithm;
    public SourceOracleEncryptionNativeNetworkEncryptionNNE withEncryptionAlgorithm(SourceOracleEncryptionNativeNetworkEncryptionNNEEncryptionAlgorithmEnum encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
        return this;
    }
    
    @JsonProperty("encryption_method")
    public SourceOracleEncryptionNativeNetworkEncryptionNNEEncryptionMethodEnum encryptionMethod;
    public SourceOracleEncryptionNativeNetworkEncryptionNNE withEncryptionMethod(SourceOracleEncryptionNativeNetworkEncryptionNNEEncryptionMethodEnum encryptionMethod) {
        this.encryptionMethod = encryptionMethod;
        return this;
    }
    
}
