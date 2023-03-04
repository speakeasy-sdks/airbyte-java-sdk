package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceMyHours {
    @JsonProperty("airbyte-source-name")
    public SourceMyHoursMyHoursEnum airbyteSourceName;
    public SourceMyHours withAirbyteSourceName(SourceMyHoursMyHoursEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("email")
    public String email;
    public SourceMyHours withEmail(String email) {
        this.email = email;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("logs_batch_size")
    public Long logsBatchSize;
    public SourceMyHours withLogsBatchSize(Long logsBatchSize) {
        this.logsBatchSize = logsBatchSize;
        return this;
    }
    
    @JsonProperty("password")
    public String password;
    public SourceMyHours withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonProperty("start_date")
    public String startDate;
    public SourceMyHours withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
