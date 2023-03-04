package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

public class SourceSalesforce {
    @JsonProperty("airbyte-source-name")
    public SourceSalesforceSalesforceEnum airbyteSourceName;
    public SourceSalesforce withAirbyteSourceName(SourceSalesforceSalesforceEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    public SourceSalesforceAuthTypeEnum authType;
    public SourceSalesforce withAuthType(SourceSalesforceAuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
    @JsonProperty("client_id")
    public String clientId;
    public SourceSalesforce withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourceSalesforce withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_sandbox")
    public Boolean isSandbox;
    public SourceSalesforce withIsSandbox(Boolean isSandbox) {
        this.isSandbox = isSandbox;
        return this;
    }
    
    @JsonProperty("refresh_token")
    public String refreshToken;
    public SourceSalesforce withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("start_date")
    public LocalDate startDate;
    public SourceSalesforce withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("streams_criteria")
    public SourceSalesforceStreamsCriteria[] streamsCriteria;
    public SourceSalesforce withStreamsCriteria(SourceSalesforceStreamsCriteria[] streamsCriteria) {
        this.streamsCriteria = streamsCriteria;
        return this;
    }
    
}
