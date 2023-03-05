package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceBigcommerce
 * The values required to configure the source.
**/
public class SourceBigcommerce {
    @JsonProperty("access_token")
    public String accessToken;
    public SourceBigcommerce withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("airbyte-source-name")
    public SourceBigcommerceBigcommerceEnum airbyteSourceName;
    public SourceBigcommerce withAirbyteSourceName(SourceBigcommerceBigcommerceEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("start_date")
    public String startDate;
    public SourceBigcommerce withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
    @JsonProperty("store_hash")
    public String storeHash;
    public SourceBigcommerce withStoreHash(String storeHash) {
        this.storeHash = storeHash;
        return this;
    }
    
}
