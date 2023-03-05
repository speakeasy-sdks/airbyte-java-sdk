package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationS3GlueFormatJSONLinesNewlineDelimitedJSON
 * Format of the data output. See <a href="https://docs.airbyte.com/integrations/destinations/s3/#supported-output-schema">here</a> for more details
**/
public class DestinationS3GlueFormatJSONLinesNewlineDelimitedJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression")
    public Object compression;
    public DestinationS3GlueFormatJSONLinesNewlineDelimitedJSON withCompression(Object compression) {
        this.compression = compression;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("flatten_data")
    public Boolean flattenData;
    public DestinationS3GlueFormatJSONLinesNewlineDelimitedJSON withFlattenData(Boolean flattenData) {
        this.flattenData = flattenData;
        return this;
    }
    
    @JsonProperty("format_type")
    public DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONFormatTypeEnum formatType;
    public DestinationS3GlueFormatJSONLinesNewlineDelimitedJSON withFormatType(DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONFormatTypeEnum formatType) {
        this.formatType = formatType;
        return this;
    }
    
}
