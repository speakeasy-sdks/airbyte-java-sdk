package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DestinationGoogleSheets {
    @JsonProperty("airbyte-destination-name")
    public DestinationGoogleSheetsGoogleSheetsEnum airbyteDestinationName;
    public DestinationGoogleSheets withAirbyteDestinationName(DestinationGoogleSheetsGoogleSheetsEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    @JsonProperty("credentials")
    public DestinationGoogleSheetsAuthenticationViaGoogleOAuth credentials;
    public DestinationGoogleSheets withCredentials(DestinationGoogleSheetsAuthenticationViaGoogleOAuth credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonProperty("spreadsheet_id")
    public String spreadsheetId;
    public DestinationGoogleSheets withSpreadsheetId(String spreadsheetId) {
        this.spreadsheetId = spreadsheetId;
        return this;
    }
    
}
