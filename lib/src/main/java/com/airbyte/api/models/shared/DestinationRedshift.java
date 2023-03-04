package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DestinationRedshift {
    @JsonProperty("airbyte-destination-name")
    public DestinationRedshiftRedshiftEnum airbyteDestinationName;
    public DestinationRedshift withAirbyteDestinationName(DestinationRedshiftRedshiftEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    @JsonProperty("database")
    public String database;
    public DestinationRedshift withDatabase(String database) {
        this.database = database;
        return this;
    }
    
    @JsonProperty("host")
    public String host;
    public DestinationRedshift withHost(String host) {
        this.host = host;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jdbc_url_params")
    public String jdbcUrlParams;
    public DestinationRedshift withJdbcUrlParams(String jdbcUrlParams) {
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }
    
    @JsonProperty("password")
    public String password;
    public DestinationRedshift withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonProperty("port")
    public Long port;
    public DestinationRedshift withPort(Long port) {
        this.port = port;
        return this;
    }
    
    @JsonProperty("schema")
    public String schema;
    public DestinationRedshift withSchema(String schema) {
        this.schema = schema;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("uploading_method")
    public java.util.Map<String, Object> uploadingMethod;
    public DestinationRedshift withUploadingMethod(java.util.Map<String, Object> uploadingMethod) {
        this.uploadingMethod = uploadingMethod;
        return this;
    }
    
    @JsonProperty("username")
    public String username;
    public DestinationRedshift withUsername(String username) {
        this.username = username;
        return this;
    }
    
}
