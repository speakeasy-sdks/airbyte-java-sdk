package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceOracle
 * The values required to configure the source.
**/
public class SourceOracle {
    @JsonProperty("airbyte-source-name")
    public SourceOracleOracleEnum airbyteSourceName;
    public SourceOracle withAirbyteSourceName(SourceOracleOracleEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("connection_data")
    public Object connectionData;
    public SourceOracle withConnectionData(Object connectionData) {
        this.connectionData = connectionData;
        return this;
    }
    
    @JsonProperty("encryption")
    public Object encryption;
    public SourceOracle withEncryption(Object encryption) {
        this.encryption = encryption;
        return this;
    }
    
    @JsonProperty("host")
    public String host;
    public SourceOracle withHost(String host) {
        this.host = host;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jdbc_url_params")
    public String jdbcUrlParams;
    public SourceOracle withJdbcUrlParams(String jdbcUrlParams) {
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    public String password;
    public SourceOracle withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonProperty("port")
    public Long port;
    public SourceOracle withPort(Long port) {
        this.port = port;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schemas")
    public String[] schemas;
    public SourceOracle withSchemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_method")
    public Object tunnelMethod;
    public SourceOracle withTunnelMethod(Object tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
    @JsonProperty("username")
    public String username;
    public SourceOracle withUsername(String username) {
        this.username = username;
        return this;
    }
    
}
