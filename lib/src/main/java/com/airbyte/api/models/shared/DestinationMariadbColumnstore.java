package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DestinationMariadbColumnstore {
    @JsonProperty("airbyte-destination-name")
    public DestinationMariadbColumnstoreMariadbColumnstoreEnum airbyteDestinationName;
    public DestinationMariadbColumnstore withAirbyteDestinationName(DestinationMariadbColumnstoreMariadbColumnstoreEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    @JsonProperty("database")
    public String database;
    public DestinationMariadbColumnstore withDatabase(String database) {
        this.database = database;
        return this;
    }
    
    @JsonProperty("host")
    public String host;
    public DestinationMariadbColumnstore withHost(String host) {
        this.host = host;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jdbc_url_params")
    public String jdbcUrlParams;
    public DestinationMariadbColumnstore withJdbcUrlParams(String jdbcUrlParams) {
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    public String password;
    public DestinationMariadbColumnstore withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonProperty("port")
    public Long port;
    public DestinationMariadbColumnstore withPort(Long port) {
        this.port = port;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_method")
    public java.util.Map<String, Object> tunnelMethod;
    public DestinationMariadbColumnstore withTunnelMethod(java.util.Map<String, Object> tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
    @JsonProperty("username")
    public String username;
    public DestinationMariadbColumnstore withUsername(String username) {
        this.username = username;
        return this;
    }
    
}
