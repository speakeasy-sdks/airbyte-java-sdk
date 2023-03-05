package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationS3FormatCSVCommaSeparatedValuesCompressionGZIP
 * Whether the output files should be compressed. If compression is selected, the output filename will have an extra extension (GZIP: ".csv.gz").
**/
public class DestinationS3FormatCSVCommaSeparatedValuesCompressionGZIP {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression_type")
    public DestinationS3FormatCSVCommaSeparatedValuesCompressionGZIPCompressionTypeEnum compressionType;
    public DestinationS3FormatCSVCommaSeparatedValuesCompressionGZIP withCompressionType(DestinationS3FormatCSVCommaSeparatedValuesCompressionGZIPCompressionTypeEnum compressionType) {
        this.compressionType = compressionType;
        return this;
    }
    
}
