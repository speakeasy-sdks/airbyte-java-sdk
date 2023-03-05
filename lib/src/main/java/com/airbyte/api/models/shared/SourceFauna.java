package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceFauna
 * The values required to configure the source.
**/
public class SourceFauna {
    @JsonProperty("airbyte-source-name")
    public SourceFaunaFaunaEnum airbyteSourceName;
    public SourceFauna withAirbyteSourceName(SourceFaunaFaunaEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("collection")
    public SourceFaunaCollection collection;
    public SourceFauna withCollection(SourceFaunaCollection collection) {
        this.collection = collection;
        return this;
    }
    
    @JsonProperty("domain")
    public String domain;
    public SourceFauna withDomain(String domain) {
        this.domain = domain;
        return this;
    }
    
    @JsonProperty("port")
    public Long port;
    public SourceFauna withPort(Long port) {
        this.port = port;
        return this;
    }
    
    @JsonProperty("scheme")
    public String scheme;
    public SourceFauna withScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }
    
    @JsonProperty("secret")
    public String secret;
    public SourceFauna withSecret(String secret) {
        this.secret = secret;
        return this;
    }
    
}
