package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMongodb
 * The values required to configure the source.
**/
public class SourceMongodb {
    @JsonProperty("airbyte-source-name")
    public SourceMongodbMongodbEnum airbyteSourceName;
    public SourceMongodb withAirbyteSourceName(SourceMongodbMongodbEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_source")
    public String authSource;
    public SourceMongodb withAuthSource(String authSource) {
        this.authSource = authSource;
        return this;
    }
    
    @JsonProperty("database")
    public String database;
    public SourceMongodb withDatabase(String database) {
        this.database = database;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("instance_type")
    public Object instanceType;
    public SourceMongodb withInstanceType(Object instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    public String password;
    public SourceMongodb withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user")
    public String user;
    public SourceMongodb withUser(String user) {
        this.user = user;
        return this;
    }
    
}
