package com.airbyte.api.models.shared;

import com.airbyte.api.utils.DateTimeDeserializer;
import com.airbyte.api.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

public class SourceTwilio {
    @JsonProperty("account_sid")
    public String accountSid;
    public SourceTwilio withAccountSid(String accountSid) {
        this.accountSid = accountSid;
        return this;
    }
    
    @JsonProperty("airbyte-source-name")
    public SourceTwilioTwilioEnum airbyteSourceName;
    public SourceTwilio withAirbyteSourceName(SourceTwilioTwilioEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("auth_token")
    public String authToken;
    public SourceTwilio withAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lookback_window")
    public Long lookbackWindow;
    public SourceTwilio withLookbackWindow(Long lookbackWindow) {
        this.lookbackWindow = lookbackWindow;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;
    public SourceTwilio withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
