package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceAlloydb {
    @JsonProperty("airbyte-source-name")
    public SourceAlloydbAlloydbEnum airbyteSourceName;
    public SourceAlloydb withAirbyteSourceName(SourceAlloydbAlloydbEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("database")
    public String database;
    public SourceAlloydb withDatabase(String database) {
        this.database = database;
        return this;
    }
    
    @JsonProperty("host")
    public String host;
    public SourceAlloydb withHost(String host) {
        this.host = host;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jdbc_url_params")
    public String jdbcUrlParams;
    public SourceAlloydb withJdbcUrlParams(String jdbcUrlParams) {
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    public String password;
    public SourceAlloydb withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonProperty("port")
    public Long port;
    public SourceAlloydb withPort(Long port) {
        this.port = port;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("replication_method")
    public java.util.Map<String, Object> replicationMethod;
    public SourceAlloydb withReplicationMethod(java.util.Map<String, Object> replicationMethod) {
        this.replicationMethod = replicationMethod;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schemas")
    public String[] schemas;
    public SourceAlloydb withSchemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ssl_mode")
    public java.util.Map<String, Object> sslMode;
    public SourceAlloydb withSslMode(java.util.Map<String, Object> sslMode) {
        this.sslMode = sslMode;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_method")
    public java.util.Map<String, Object> tunnelMethod;
    public SourceAlloydb withTunnelMethod(java.util.Map<String, Object> tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
    @JsonProperty("username")
    public String username;
    public SourceAlloydb withUsername(String username) {
        this.username = username;
        return this;
    }
    
}
