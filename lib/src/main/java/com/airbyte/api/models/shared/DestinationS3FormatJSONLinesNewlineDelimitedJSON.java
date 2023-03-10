package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationS3FormatJSONLinesNewlineDelimitedJSON
 * Format of the data output. See <a href="https://docs.airbyte.com/integrations/destinations/s3/#supported-output-schema">here</a> for more details
**/
public class DestinationS3FormatJSONLinesNewlineDelimitedJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression")
    public Object compression;
    public DestinationS3FormatJSONLinesNewlineDelimitedJSON withCompression(Object compression) {
        this.compression = compression;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("flattening")
    public DestinationS3FormatJSONLinesNewlineDelimitedJSONFlatteningEnum flattening;
    public DestinationS3FormatJSONLinesNewlineDelimitedJSON withFlattening(DestinationS3FormatJSONLinesNewlineDelimitedJSONFlatteningEnum flattening) {
        this.flattening = flattening;
        return this;
    }
    
    @JsonProperty("format_type")
    public DestinationS3FormatJSONLinesNewlineDelimitedJSONFormatTypeEnum formatType;
    public DestinationS3FormatJSONLinesNewlineDelimitedJSON withFormatType(DestinationS3FormatJSONLinesNewlineDelimitedJSONFormatTypeEnum formatType) {
        this.formatType = formatType;
        return this;
    }
    
}
