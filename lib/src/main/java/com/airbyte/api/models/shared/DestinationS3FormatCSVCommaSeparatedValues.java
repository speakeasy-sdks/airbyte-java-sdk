package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationS3FormatCSVCommaSeparatedValues
 * Format of the data output. See <a href="https://docs.airbyte.com/integrations/destinations/s3/#supported-output-schema">here</a> for more details
**/
public class DestinationS3FormatCSVCommaSeparatedValues {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression")
    public Object compression;
    public DestinationS3FormatCSVCommaSeparatedValues withCompression(Object compression) {
        this.compression = compression;
        return this;
    }
    
    @JsonProperty("flattening")
    public DestinationS3FormatCSVCommaSeparatedValuesFlatteningEnum flattening;
    public DestinationS3FormatCSVCommaSeparatedValues withFlattening(DestinationS3FormatCSVCommaSeparatedValuesFlatteningEnum flattening) {
        this.flattening = flattening;
        return this;
    }
    
    @JsonProperty("format_type")
    public DestinationS3FormatCSVCommaSeparatedValuesFormatTypeEnum formatType;
    public DestinationS3FormatCSVCommaSeparatedValues withFormatType(DestinationS3FormatCSVCommaSeparatedValuesFormatTypeEnum formatType) {
        this.formatType = formatType;
        return this;
    }
    
}
