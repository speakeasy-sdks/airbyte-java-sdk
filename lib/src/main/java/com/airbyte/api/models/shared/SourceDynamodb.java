package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceDynamodb {
    @JsonProperty("access_key_id")
    public String accessKeyId;
    public SourceDynamodb withAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    
    @JsonProperty("airbyte-source-name")
    public SourceDynamodbDynamodbEnum airbyteSourceName;
    public SourceDynamodb withAirbyteSourceName(SourceDynamodbDynamodbEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("endpoint")
    public String endpoint;
    public SourceDynamodb withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("region")
    public SourceDynamodbDynamodbRegionEnum region;
    public SourceDynamodb withRegion(SourceDynamodbDynamodbRegionEnum region) {
        this.region = region;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reserved_attribute_names")
    public String reservedAttributeNames;
    public SourceDynamodb withReservedAttributeNames(String reservedAttributeNames) {
        this.reservedAttributeNames = reservedAttributeNames;
        return this;
    }
    
    @JsonProperty("secret_access_key")
    public String secretAccessKey;
    public SourceDynamodb withSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
        return this;
    }
    
}
