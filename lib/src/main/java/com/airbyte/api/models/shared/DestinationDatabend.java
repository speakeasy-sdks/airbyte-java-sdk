package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationDatabend
 * The values required to configure the destination.
**/
public class DestinationDatabend {
    @JsonProperty("airbyte-destination-name")
    public DestinationDatabendDatabendEnum airbyteDestinationName;
    public DestinationDatabend withAirbyteDestinationName(DestinationDatabendDatabendEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    @JsonProperty("database")
    public String database;
    public DestinationDatabend withDatabase(String database) {
        this.database = database;
        return this;
    }
    
    @JsonProperty("host")
    public String host;
    public DestinationDatabend withHost(String host) {
        this.host = host;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    public String password;
    public DestinationDatabend withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("port")
    public Long port;
    public DestinationDatabend withPort(Long port) {
        this.port = port;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("table")
    public String table;
    public DestinationDatabend withTable(String table) {
        this.table = table;
        return this;
    }
    
    @JsonProperty("username")
    public String username;
    public DestinationDatabend withUsername(String username) {
        this.username = username;
        return this;
    }
    
}
