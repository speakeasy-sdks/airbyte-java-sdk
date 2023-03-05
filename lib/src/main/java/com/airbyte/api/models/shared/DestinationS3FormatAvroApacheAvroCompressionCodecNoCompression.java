package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationS3FormatAvroApacheAvroCompressionCodecNoCompression
 * The compression algorithm used to compress data. Default to no compression.
**/
public class DestinationS3FormatAvroApacheAvroCompressionCodecNoCompression {
    @JsonProperty("codec")
    public DestinationS3FormatAvroApacheAvroCompressionCodecNoCompressionCodecEnum codec;
    public DestinationS3FormatAvroApacheAvroCompressionCodecNoCompression withCodec(DestinationS3FormatAvroApacheAvroCompressionCodecNoCompressionCodecEnum codec) {
        this.codec = codec;
        return this;
    }
    
}