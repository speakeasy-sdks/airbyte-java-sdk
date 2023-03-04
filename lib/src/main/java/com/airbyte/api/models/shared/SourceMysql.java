package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceMysql {
    @JsonProperty("airbyte-source-name")
    public SourceMysqlMysqlEnum airbyteSourceName;
    public SourceMysql withAirbyteSourceName(SourceMysqlMysqlEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("database")
    public String database;
    public SourceMysql withDatabase(String database) {
        this.database = database;
        return this;
    }
    
    @JsonProperty("host")
    public String host;
    public SourceMysql withHost(String host) {
        this.host = host;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jdbc_url_params")
    public String jdbcUrlParams;
    public SourceMysql withJdbcUrlParams(String jdbcUrlParams) {
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    public String password;
    public SourceMysql withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonProperty("port")
    public Long port;
    public SourceMysql withPort(Long port) {
        this.port = port;
        return this;
    }
    
    @JsonProperty("replication_method")
    public java.util.Map<String, Object> replicationMethod;
    public SourceMysql withReplicationMethod(java.util.Map<String, Object> replicationMethod) {
        this.replicationMethod = replicationMethod;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ssl_mode")
    public java.util.Map<String, Object> sslMode;
    public SourceMysql withSslMode(java.util.Map<String, Object> sslMode) {
        this.sslMode = sslMode;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_method")
    public java.util.Map<String, Object> tunnelMethod;
    public SourceMysql withTunnelMethod(java.util.Map<String, Object> tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
    @JsonProperty("username")
    public String username;
    public SourceMysql withUsername(String username) {
        this.username = username;
        return this;
    }
    
}
