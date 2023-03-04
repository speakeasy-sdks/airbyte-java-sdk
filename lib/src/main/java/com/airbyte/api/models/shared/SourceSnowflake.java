package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceSnowflake {
    @JsonProperty("airbyte-source-name")
    public SourceSnowflakeSnowflakeEnum airbyteSourceName;
    public SourceSnowflake withAirbyteSourceName(SourceSnowflakeSnowflakeEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public java.util.Map<String, Object> credentials;
    public SourceSnowflake withCredentials(java.util.Map<String, Object> credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonProperty("database")
    public String database;
    public SourceSnowflake withDatabase(String database) {
        this.database = database;
        return this;
    }
    
    @JsonProperty("host")
    public String host;
    public SourceSnowflake withHost(String host) {
        this.host = host;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jdbc_url_params")
    public String jdbcUrlParams;
    public SourceSnowflake withJdbcUrlParams(String jdbcUrlParams) {
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }
    
    @JsonProperty("role")
    public String role;
    public SourceSnowflake withRole(String role) {
        this.role = role;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schema")
    public String schema;
    public SourceSnowflake withSchema(String schema) {
        this.schema = schema;
        return this;
    }
    
    @JsonProperty("warehouse")
    public String warehouse;
    public SourceSnowflake withWarehouse(String warehouse) {
        this.warehouse = warehouse;
        return this;
    }
    
}
