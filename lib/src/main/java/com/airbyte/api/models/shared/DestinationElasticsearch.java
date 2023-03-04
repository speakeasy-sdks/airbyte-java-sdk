package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DestinationElasticsearch {
    @JsonProperty("airbyte-destination-name")
    public DestinationElasticsearchElasticsearchEnum airbyteDestinationName;
    public DestinationElasticsearch withAirbyteDestinationName(DestinationElasticsearchElasticsearchEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("authenticationMethod")
    public java.util.Map<String, Object> authenticationMethod;
    public DestinationElasticsearch withAuthenticationMethod(java.util.Map<String, Object> authenticationMethod) {
        this.authenticationMethod = authenticationMethod;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ca_certificate")
    public String caCertificate;
    public DestinationElasticsearch withCaCertificate(String caCertificate) {
        this.caCertificate = caCertificate;
        return this;
    }
    
    @JsonProperty("endpoint")
    public String endpoint;
    public DestinationElasticsearch withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("upsert")
    public Boolean upsert;
    public DestinationElasticsearch withUpsert(Boolean upsert) {
        this.upsert = upsert;
        return this;
    }
    
}
