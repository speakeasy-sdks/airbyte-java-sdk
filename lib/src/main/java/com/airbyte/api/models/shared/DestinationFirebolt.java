package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DestinationFirebolt {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account")
    public String account;
    public DestinationFirebolt withAccount(String account) {
        this.account = account;
        return this;
    }
    
    @JsonProperty("airbyte-destination-name")
    public DestinationFireboltFireboltEnum airbyteDestinationName;
    public DestinationFirebolt withAirbyteDestinationName(DestinationFireboltFireboltEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    @JsonProperty("database")
    public String database;
    public DestinationFirebolt withDatabase(String database) {
        this.database = database;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("engine")
    public String engine;
    public DestinationFirebolt withEngine(String engine) {
        this.engine = engine;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("host")
    public String host;
    public DestinationFirebolt withHost(String host) {
        this.host = host;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("loading_method")
    public java.util.Map<String, Object> loadingMethod;
    public DestinationFirebolt withLoadingMethod(java.util.Map<String, Object> loadingMethod) {
        this.loadingMethod = loadingMethod;
        return this;
    }
    
    @JsonProperty("password")
    public String password;
    public DestinationFirebolt withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonProperty("username")
    public String username;
    public DestinationFirebolt withUsername(String username) {
        this.username = username;
        return this;
    }
    
}
