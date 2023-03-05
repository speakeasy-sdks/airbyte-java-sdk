package com.airbyte.api.models.shared;

import com.airbyte.api.utils.DateTimeDeserializer;
import com.airbyte.api.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * SourceMailgun
 * The values required to configure the source.
**/
public class SourceMailgun {
    @JsonProperty("airbyte-source-name")
    public SourceMailgunMailgunEnum airbyteSourceName;
    public SourceMailgun withAirbyteSourceName(SourceMailgunMailgunEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("domain_region")
    public String domainRegion;
    public SourceMailgun withDomainRegion(String domainRegion) {
        this.domainRegion = domainRegion;
        return this;
    }
    
    @JsonProperty("private_key")
    public String privateKey;
    public SourceMailgun withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;
    public SourceMailgun withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
