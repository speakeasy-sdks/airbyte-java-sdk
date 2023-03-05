package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationS3FormatAvroApacheAvroCompressionCodecSnappy
 * The compression algorithm used to compress data. Default to no compression.
**/
public class DestinationS3FormatAvroApacheAvroCompressionCodecSnappy {
    @JsonProperty("codec")
    public DestinationS3FormatAvroApacheAvroCompressionCodecSnappyCodecEnum codec;
    public DestinationS3FormatAvroApacheAvroCompressionCodecSnappy withCodec(DestinationS3FormatAvroApacheAvroCompressionCodecSnappyCodecEnum codec) {
        this.codec = codec;
        return this;
    }
    
}
