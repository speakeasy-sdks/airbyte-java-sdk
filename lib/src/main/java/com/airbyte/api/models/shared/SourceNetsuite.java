package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceNetsuite
 * The values required to configure the source.
**/
public class SourceNetsuite {
    @JsonProperty("airbyte-source-name")
    public SourceNetsuiteNetsuiteEnum airbyteSourceName;
    public SourceNetsuite withAirbyteSourceName(SourceNetsuiteNetsuiteEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("consumer_key")
    public String consumerKey;
    public SourceNetsuite withConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
        return this;
    }
    
    @JsonProperty("consumer_secret")
    public String consumerSecret;
    public SourceNetsuite withConsumerSecret(String consumerSecret) {
        this.consumerSecret = consumerSecret;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("object_types")
    public String[] objectTypes;
    public SourceNetsuite withObjectTypes(String[] objectTypes) {
        this.objectTypes = objectTypes;
        return this;
    }
    
    @JsonProperty("realm")
    public String realm;
    public SourceNetsuite withRealm(String realm) {
        this.realm = realm;
        return this;
    }
    
    @JsonProperty("start_datetime")
    public String startDatetime;
    public SourceNetsuite withStartDatetime(String startDatetime) {
        this.startDatetime = startDatetime;
        return this;
    }
    
    @JsonProperty("token_key")
    public String tokenKey;
    public SourceNetsuite withTokenKey(String tokenKey) {
        this.tokenKey = tokenKey;
        return this;
    }
    
    @JsonProperty("token_secret")
    public String tokenSecret;
    public SourceNetsuite withTokenSecret(String tokenSecret) {
        this.tokenSecret = tokenSecret;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("window_in_days")
    public Long windowInDays;
    public SourceNetsuite withWindowInDays(Long windowInDays) {
        this.windowInDays = windowInDays;
        return this;
    }
    
}
