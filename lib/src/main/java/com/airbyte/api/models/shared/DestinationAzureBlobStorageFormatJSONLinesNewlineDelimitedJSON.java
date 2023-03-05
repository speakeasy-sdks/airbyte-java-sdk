package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationAzureBlobStorageFormatJSONLinesNewlineDelimitedJSON
 * Output data format
**/
public class DestinationAzureBlobStorageFormatJSONLinesNewlineDelimitedJSON {
    @JsonProperty("format_type")
    public DestinationAzureBlobStorageFormatJSONLinesNewlineDelimitedJSONFormatTypeEnum formatType;
    public DestinationAzureBlobStorageFormatJSONLinesNewlineDelimitedJSON withFormatType(DestinationAzureBlobStorageFormatJSONLinesNewlineDelimitedJSONFormatTypeEnum formatType) {
        this.formatType = formatType;
        return this;
    }
    
}
