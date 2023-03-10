package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationGcsFormatAvroApacheAvroCompressionCodecBzip2
 * The compression algorithm used to compress data. Default to no compression.
**/
public class DestinationGcsFormatAvroApacheAvroCompressionCodecBzip2 {
    @JsonProperty("codec")
    public DestinationGcsFormatAvroApacheAvroCompressionCodecBzip2CodecEnum codec;
    public DestinationGcsFormatAvroApacheAvroCompressionCodecBzip2 withCodec(DestinationGcsFormatAvroApacheAvroCompressionCodecBzip2CodecEnum codec) {
        this.codec = codec;
        return this;
    }
    
}
