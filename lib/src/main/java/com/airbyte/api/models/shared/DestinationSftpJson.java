package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationSftpJson
 * The values required to configure the destination.
**/
public class DestinationSftpJson {
    @JsonProperty("airbyte-destination-name")
    public DestinationSftpJsonSftpJsonEnum airbyteDestinationName;
    public DestinationSftpJson withAirbyteDestinationName(DestinationSftpJsonSftpJsonEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    @JsonProperty("destination_path")
    public String destinationPath;
    public DestinationSftpJson withDestinationPath(String destinationPath) {
        this.destinationPath = destinationPath;
        return this;
    }
    
    @JsonProperty("host")
    public String host;
    public DestinationSftpJson withHost(String host) {
        this.host = host;
        return this;
    }
    
    @JsonProperty("password")
    public String password;
    public DestinationSftpJson withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("port")
    public Long port;
    public DestinationSftpJson withPort(Long port) {
        this.port = port;
        return this;
    }
    
    @JsonProperty("username")
    public String username;
    public DestinationSftpJson withUsername(String username) {
        this.username = username;
        return this;
    }
    
}
