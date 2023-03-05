package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationGcsFormatAvroApacheAvroCompressionCodecNoCompression
 * The compression algorithm used to compress data. Default to no compression.
**/
public class DestinationGcsFormatAvroApacheAvroCompressionCodecNoCompression {
    @JsonProperty("codec")
    public DestinationGcsFormatAvroApacheAvroCompressionCodecNoCompressionCodecEnum codec;
    public DestinationGcsFormatAvroApacheAvroCompressionCodecNoCompression withCodec(DestinationGcsFormatAvroApacheAvroCompressionCodecNoCompressionCodecEnum codec) {
        this.codec = codec;
        return this;
    }
    
}
