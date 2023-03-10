package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationRabbitmq
 * The values required to configure the destination.
**/
public class DestinationRabbitmq {
    @JsonProperty("airbyte-destination-name")
    public DestinationRabbitmqRabbitmqEnum airbyteDestinationName;
    public DestinationRabbitmq withAirbyteDestinationName(DestinationRabbitmqRabbitmqEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("exchange")
    public String exchange;
    public DestinationRabbitmq withExchange(String exchange) {
        this.exchange = exchange;
        return this;
    }
    
    @JsonProperty("host")
    public String host;
    public DestinationRabbitmq withHost(String host) {
        this.host = host;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    public String password;
    public DestinationRabbitmq withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("port")
    public Long port;
    public DestinationRabbitmq withPort(Long port) {
        this.port = port;
        return this;
    }
    
    @JsonProperty("routing_key")
    public String routingKey;
    public DestinationRabbitmq withRoutingKey(String routingKey) {
        this.routingKey = routingKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ssl")
    public Boolean ssl;
    public DestinationRabbitmq withSsl(Boolean ssl) {
        this.ssl = ssl;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("username")
    public String username;
    public DestinationRabbitmq withUsername(String username) {
        this.username = username;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("virtual_host")
    public String virtualHost;
    public DestinationRabbitmq withVirtualHost(String virtualHost) {
        this.virtualHost = virtualHost;
        return this;
    }
    
}
