package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceRedshift {
    @JsonProperty("airbyte-source-name")
    public SourceRedshiftRedshiftEnum airbyteSourceName;
    public SourceRedshift withAirbyteSourceName(SourceRedshiftRedshiftEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("database")
    public String database;
    public SourceRedshift withDatabase(String database) {
        this.database = database;
        return this;
    }
    
    @JsonProperty("host")
    public String host;
    public SourceRedshift withHost(String host) {
        this.host = host;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jdbc_url_params")
    public String jdbcUrlParams;
    public SourceRedshift withJdbcUrlParams(String jdbcUrlParams) {
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }
    
    @JsonProperty("password")
    public String password;
    public SourceRedshift withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonProperty("port")
    public Long port;
    public SourceRedshift withPort(Long port) {
        this.port = port;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schemas")
    public String[] schemas;
    public SourceRedshift withSchemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }
    
    @JsonProperty("username")
    public String username;
    public SourceRedshift withUsername(String username) {
        this.username = username;
        return this;
    }
    
}
