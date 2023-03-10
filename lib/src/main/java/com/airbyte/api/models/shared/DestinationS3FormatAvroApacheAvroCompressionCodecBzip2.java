package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationS3FormatAvroApacheAvroCompressionCodecBzip2
 * The compression algorithm used to compress data. Default to no compression.
**/
public class DestinationS3FormatAvroApacheAvroCompressionCodecBzip2 {
    @JsonProperty("codec")
    public DestinationS3FormatAvroApacheAvroCompressionCodecBzip2CodecEnum codec;
    public DestinationS3FormatAvroApacheAvroCompressionCodecBzip2 withCodec(DestinationS3FormatAvroApacheAvroCompressionCodecBzip2CodecEnum codec) {
        this.codec = codec;
        return this;
    }
    
}
