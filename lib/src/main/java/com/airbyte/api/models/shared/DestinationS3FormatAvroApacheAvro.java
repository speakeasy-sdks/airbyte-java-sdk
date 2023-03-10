package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationS3FormatAvroApacheAvro
 * Format of the data output. See <a href="https://docs.airbyte.com/integrations/destinations/s3/#supported-output-schema">here</a> for more details
**/
public class DestinationS3FormatAvroApacheAvro {
    @JsonProperty("compression_codec")
    public Object compressionCodec;
    public DestinationS3FormatAvroApacheAvro withCompressionCodec(Object compressionCodec) {
        this.compressionCodec = compressionCodec;
        return this;
    }
    
    @JsonProperty("format_type")
    public DestinationS3FormatAvroApacheAvroFormatTypeEnum formatType;
    public DestinationS3FormatAvroApacheAvro withFormatType(DestinationS3FormatAvroApacheAvroFormatTypeEnum formatType) {
        this.formatType = formatType;
        return this;
    }
    
}
