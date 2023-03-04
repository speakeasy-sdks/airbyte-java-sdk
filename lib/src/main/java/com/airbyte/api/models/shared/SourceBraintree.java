package com.airbyte.api.models.shared;

import com.airbyte.api.utils.DateTimeDeserializer;
import com.airbyte.api.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

public class SourceBraintree {
    @JsonProperty("airbyte-source-name")
    public SourceBraintreeBraintreeEnum airbyteSourceName;
    public SourceBraintree withAirbyteSourceName(SourceBraintreeBraintreeEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("environment")
    public SourceBraintreeEnvironmentEnum environment;
    public SourceBraintree withEnvironment(SourceBraintreeEnvironmentEnum environment) {
        this.environment = environment;
        return this;
    }
    
    @JsonProperty("merchant_id")
    public String merchantId;
    public SourceBraintree withMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    
    @JsonProperty("private_key")
    public String privateKey;
    public SourceBraintree withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    
    @JsonProperty("public_key")
    public String publicKey;
    public SourceBraintree withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;
    public SourceBraintree withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
