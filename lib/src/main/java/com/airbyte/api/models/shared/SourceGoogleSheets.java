package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceGoogleSheets {
    @JsonProperty("airbyte-source-name")
    public SourceGoogleSheetsGoogleSheetsEnum airbyteSourceName;
    public SourceGoogleSheets withAirbyteSourceName(SourceGoogleSheetsGoogleSheetsEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("credentials")
    public java.util.Map<String, Object> credentials;
    public SourceGoogleSheets withCredentials(java.util.Map<String, Object> credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("row_batch_size")
    public Long rowBatchSize;
    public SourceGoogleSheets withRowBatchSize(Long rowBatchSize) {
        this.rowBatchSize = rowBatchSize;
        return this;
    }
    
    @JsonProperty("spreadsheet_id")
    public String spreadsheetId;
    public SourceGoogleSheets withSpreadsheetId(String spreadsheetId) {
        this.spreadsheetId = spreadsheetId;
        return this;
    }
    
}
