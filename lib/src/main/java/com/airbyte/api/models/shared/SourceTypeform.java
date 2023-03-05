package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceTypeform
 * The values required to configure the source.
**/
public class SourceTypeform {
    @JsonProperty("airbyte-source-name")
    public SourceTypeformTypeformEnum airbyteSourceName;
    public SourceTypeform withAirbyteSourceName(SourceTypeformTypeformEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("form_ids")
    public String[] formIds;
    public SourceTypeform withFormIds(String[] formIds) {
        this.formIds = formIds;
        return this;
    }
    
    @JsonProperty("start_date")
    public String startDate;
    public SourceTypeform withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
    @JsonProperty("token")
    public String token;
    public SourceTypeform withToken(String token) {
        this.token = token;
        return this;
    }
    
}
