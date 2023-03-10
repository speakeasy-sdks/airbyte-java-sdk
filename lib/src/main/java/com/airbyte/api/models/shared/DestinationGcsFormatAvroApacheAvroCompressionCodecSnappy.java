package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationGcsFormatAvroApacheAvroCompressionCodecSnappy
 * The compression algorithm used to compress data. Default to no compression.
**/
public class DestinationGcsFormatAvroApacheAvroCompressionCodecSnappy {
    @JsonProperty("codec")
    public DestinationGcsFormatAvroApacheAvroCompressionCodecSnappyCodecEnum codec;
    public DestinationGcsFormatAvroApacheAvroCompressionCodecSnappy withCodec(DestinationGcsFormatAvroApacheAvroCompressionCodecSnappyCodecEnum codec) {
        this.codec = codec;
        return this;
    }
    
}
