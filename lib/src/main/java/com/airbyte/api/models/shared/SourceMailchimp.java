package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMailchimp
 * The values required to configure the source.
**/
public class SourceMailchimp {
    @JsonProperty("airbyte-source-name")
    public SourceMailchimpMailchimpEnum airbyteSourceName;
    public SourceMailchimp withAirbyteSourceName(SourceMailchimpMailchimpEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("campaign_id")
    public String campaignId;
    public SourceMailchimp withCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public Object credentials;
    public SourceMailchimp withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
}
