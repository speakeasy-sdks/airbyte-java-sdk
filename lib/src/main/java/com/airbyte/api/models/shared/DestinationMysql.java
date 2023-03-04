package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DestinationMysql {
    @JsonProperty("airbyte-destination-name")
    public DestinationMysqlMysqlEnum airbyteDestinationName;
    public DestinationMysql withAirbyteDestinationName(DestinationMysqlMysqlEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    @JsonProperty("database")
    public String database;
    public DestinationMysql withDatabase(String database) {
        this.database = database;
        return this;
    }
    
    @JsonProperty("host")
    public String host;
    public DestinationMysql withHost(String host) {
        this.host = host;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jdbc_url_params")
    public String jdbcUrlParams;
    public DestinationMysql withJdbcUrlParams(String jdbcUrlParams) {
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    public String password;
    public DestinationMysql withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonProperty("port")
    public Long port;
    public DestinationMysql withPort(Long port) {
        this.port = port;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_method")
    public java.util.Map<String, Object> tunnelMethod;
    public DestinationMysql withTunnelMethod(java.util.Map<String, Object> tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
    @JsonProperty("username")
    public String username;
    public DestinationMysql withUsername(String username) {
        this.username = username;
        return this;
    }
    
}
