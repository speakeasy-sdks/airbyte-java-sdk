package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationMssql
 * The values required to configure the destination.
**/
public class DestinationMssql {
    @JsonProperty("airbyte-destination-name")
    public DestinationMssqlMssqlEnum airbyteDestinationName;
    public DestinationMssql withAirbyteDestinationName(DestinationMssqlMssqlEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    @JsonProperty("database")
    public String database;
    public DestinationMssql withDatabase(String database) {
        this.database = database;
        return this;
    }
    
    @JsonProperty("host")
    public String host;
    public DestinationMssql withHost(String host) {
        this.host = host;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jdbc_url_params")
    public String jdbcUrlParams;
    public DestinationMssql withJdbcUrlParams(String jdbcUrlParams) {
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    public String password;
    public DestinationMssql withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonProperty("port")
    public Long port;
    public DestinationMssql withPort(Long port) {
        this.port = port;
        return this;
    }
    
    @JsonProperty("schema")
    public String schema;
    public DestinationMssql withSchema(String schema) {
        this.schema = schema;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ssl_method")
    public Object sslMethod;
    public DestinationMssql withSslMethod(Object sslMethod) {
        this.sslMethod = sslMethod;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_method")
    public Object tunnelMethod;
    public DestinationMssql withTunnelMethod(Object tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
    @JsonProperty("username")
    public String username;
    public DestinationMssql withUsername(String username) {
        this.username = username;
        return this;
    }
    
}
