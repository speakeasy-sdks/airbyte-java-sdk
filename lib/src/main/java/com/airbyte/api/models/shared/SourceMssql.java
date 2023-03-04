package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceMssql {
    @JsonProperty("airbyte-source-name")
    public SourceMssqlMssqlEnum airbyteSourceName;
    public SourceMssql withAirbyteSourceName(SourceMssqlMssqlEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("database")
    public String database;
    public SourceMssql withDatabase(String database) {
        this.database = database;
        return this;
    }
    
    @JsonProperty("host")
    public String host;
    public SourceMssql withHost(String host) {
        this.host = host;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jdbc_url_params")
    public String jdbcUrlParams;
    public SourceMssql withJdbcUrlParams(String jdbcUrlParams) {
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    public String password;
    public SourceMssql withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonProperty("port")
    public Long port;
    public SourceMssql withPort(Long port) {
        this.port = port;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("replication_method")
    public java.util.Map<String, Object> replicationMethod;
    public SourceMssql withReplicationMethod(java.util.Map<String, Object> replicationMethod) {
        this.replicationMethod = replicationMethod;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schemas")
    public String[] schemas;
    public SourceMssql withSchemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ssl_method")
    public java.util.Map<String, Object> sslMethod;
    public SourceMssql withSslMethod(java.util.Map<String, Object> sslMethod) {
        this.sslMethod = sslMethod;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_method")
    public java.util.Map<String, Object> tunnelMethod;
    public SourceMssql withTunnelMethod(java.util.Map<String, Object> tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
    @JsonProperty("username")
    public String username;
    public SourceMssql withUsername(String username) {
        this.username = username;
        return this;
    }
    
}
