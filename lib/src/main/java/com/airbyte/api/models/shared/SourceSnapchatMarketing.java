package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

/**
 * SourceSnapchatMarketing
 * The values required to configure the source.
**/
public class SourceSnapchatMarketing {
    @JsonProperty("airbyte-source-name")
    public SourceSnapchatMarketingSnapchatMarketingEnum airbyteSourceName;
    public SourceSnapchatMarketing withAirbyteSourceName(SourceSnapchatMarketingSnapchatMarketingEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("client_id")
    public String clientId;
    public SourceSnapchatMarketing withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourceSnapchatMarketing withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("end_date")
    public LocalDate endDate;
    public SourceSnapchatMarketing withEndDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }
    
    @JsonProperty("refresh_token")
    public String refreshToken;
    public SourceSnapchatMarketing withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("start_date")
    public LocalDate startDate;
    public SourceSnapchatMarketing withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
