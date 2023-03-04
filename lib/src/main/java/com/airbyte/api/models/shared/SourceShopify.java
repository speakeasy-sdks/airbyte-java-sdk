package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceShopify {
    @JsonProperty("airbyte-source-name")
    public SourceShopifyShopifyEnum airbyteSourceName;
    public SourceShopify withAirbyteSourceName(SourceShopifyShopifyEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public java.util.Map<String, Object> credentials;
    public SourceShopify withCredentials(java.util.Map<String, Object> credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonProperty("shop")
    public String shop;
    public SourceShopify withShop(String shop) {
        this.shop = shop;
        return this;
    }
    
    @JsonProperty("start_date")
    public String startDate;
    public SourceShopify withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
