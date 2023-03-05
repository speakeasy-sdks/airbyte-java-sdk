package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationDynamodb
 * The values required to configure the destination.
**/
public class DestinationDynamodb {
    @JsonProperty("access_key_id")
    public String accessKeyId;
    public DestinationDynamodb withAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    
    @JsonProperty("airbyte-destination-name")
    public DestinationDynamodbDynamodbEnum airbyteDestinationName;
    public DestinationDynamodb withAirbyteDestinationName(DestinationDynamodbDynamodbEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dynamodb_endpoint")
    public String dynamodbEndpoint;
    public DestinationDynamodb withDynamodbEndpoint(String dynamodbEndpoint) {
        this.dynamodbEndpoint = dynamodbEndpoint;
        return this;
    }
    
    @JsonProperty("dynamodb_region")
    public DestinationDynamodbDynamoDBRegionEnum dynamodbRegion;
    public DestinationDynamodb withDynamodbRegion(DestinationDynamodbDynamoDBRegionEnum dynamodbRegion) {
        this.dynamodbRegion = dynamodbRegion;
        return this;
    }
    
    @JsonProperty("dynamodb_table_name_prefix")
    public String dynamodbTableNamePrefix;
    public DestinationDynamodb withDynamodbTableNamePrefix(String dynamodbTableNamePrefix) {
        this.dynamodbTableNamePrefix = dynamodbTableNamePrefix;
        return this;
    }
    
    @JsonProperty("secret_access_key")
    public String secretAccessKey;
    public DestinationDynamodb withSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
        return this;
    }
    
}
