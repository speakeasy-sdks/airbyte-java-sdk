package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DestinationRedis {
    @JsonProperty("airbyte-destination-name")
    public DestinationRedisRedisEnum airbyteDestinationName;
    public DestinationRedis withAirbyteDestinationName(DestinationRedisRedisEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    @JsonProperty("cache_type")
    public DestinationRedisCacheTypeEnum cacheType;
    public DestinationRedis withCacheType(DestinationRedisCacheTypeEnum cacheType) {
        this.cacheType = cacheType;
        return this;
    }
    
    @JsonProperty("host")
    public String host;
    public DestinationRedis withHost(String host) {
        this.host = host;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    public String password;
    public DestinationRedis withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonProperty("port")
    public Long port;
    public DestinationRedis withPort(Long port) {
        this.port = port;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ssl")
    public Boolean ssl;
    public DestinationRedis withSsl(Boolean ssl) {
        this.ssl = ssl;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ssl_mode")
    public java.util.Map<String, Object> sslMode;
    public DestinationRedis withSslMode(java.util.Map<String, Object> sslMode) {
        this.sslMode = sslMode;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_method")
    public java.util.Map<String, Object> tunnelMethod;
    public DestinationRedis withTunnelMethod(java.util.Map<String, Object> tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
    @JsonProperty("username")
    public String username;
    public DestinationRedis withUsername(String username) {
        this.username = username;
        return this;
    }
    
}
