package com.airbyte.api.models.shared;

import com.airbyte.api.utils.DateTimeDeserializer;
import com.airbyte.api.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

public class SourceSmartsheets {
    @JsonProperty("airbyte-source-name")
    public SourceSmartsheetsSmartsheetsEnum airbyteSourceName;
    public SourceSmartsheets withAirbyteSourceName(SourceSmartsheetsSmartsheetsEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("credentials")
    public java.util.Map<String, Object> credentials;
    public SourceSmartsheets withCredentials(java.util.Map<String, Object> credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonProperty("spreadsheet_id")
    public String spreadsheetId;
    public SourceSmartsheets withSpreadsheetId(String spreadsheetId) {
        this.spreadsheetId = spreadsheetId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_datetime")
    public OffsetDateTime startDatetime;
    public SourceSmartsheets withStartDatetime(OffsetDateTime startDatetime) {
        this.startDatetime = startDatetime;
        return this;
    }
    
}
