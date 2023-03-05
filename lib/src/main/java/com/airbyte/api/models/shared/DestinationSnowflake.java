package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationSnowflake
 * The values required to configure the destination.
**/
public class DestinationSnowflake {
    @JsonProperty("airbyte-destination-name")
    public DestinationSnowflakeSnowflakeEnum airbyteDestinationName;
    public DestinationSnowflake withAirbyteDestinationName(DestinationSnowflakeSnowflakeEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public Object credentials;
    public DestinationSnowflake withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonProperty("database")
    public String database;
    public DestinationSnowflake withDatabase(String database) {
        this.database = database;
        return this;
    }
    
    @JsonProperty("host")
    public String host;
    public DestinationSnowflake withHost(String host) {
        this.host = host;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jdbc_url_params")
    public String jdbcUrlParams;
    public DestinationSnowflake withJdbcUrlParams(String jdbcUrlParams) {
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("loading_method")
    public Object loadingMethod;
    public DestinationSnowflake withLoadingMethod(Object loadingMethod) {
        this.loadingMethod = loadingMethod;
        return this;
    }
    
    @JsonProperty("role")
    public String role;
    public DestinationSnowflake withRole(String role) {
        this.role = role;
        return this;
    }
    
    @JsonProperty("schema")
    public String schema;
    public DestinationSnowflake withSchema(String schema) {
        this.schema = schema;
        return this;
    }
    
    @JsonProperty("username")
    public String username;
    public DestinationSnowflake withUsername(String username) {
        this.username = username;
        return this;
    }
    
    @JsonProperty("warehouse")
    public String warehouse;
    public DestinationSnowflake withWarehouse(String warehouse) {
        this.warehouse = warehouse;
        return this;
    }
    
}
