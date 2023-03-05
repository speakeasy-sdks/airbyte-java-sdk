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
 * SourceZendeskChat
 * The values required to configure the source.
**/
public class SourceZendeskChat {
    @JsonProperty("airbyte-source-name")
    public SourceZendeskChatZendeskChatEnum airbyteSourceName;
    public SourceZendeskChat withAirbyteSourceName(SourceZendeskChatZendeskChatEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public Object credentials;
    public SourceZendeskChat withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;
    public SourceZendeskChat withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subdomain")
    public String subdomain;
    public SourceZendeskChat withSubdomain(String subdomain) {
        this.subdomain = subdomain;
        return this;
    }
    
}
