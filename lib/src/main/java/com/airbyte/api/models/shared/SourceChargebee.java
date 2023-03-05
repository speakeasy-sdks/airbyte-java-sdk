package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceChargebee
 * The values required to configure the source.
**/
public class SourceChargebee {
    @JsonProperty("airbyte-source-name")
    public SourceChargebeeChargebeeEnum airbyteSourceName;
    public SourceChargebee withAirbyteSourceName(SourceChargebeeChargebeeEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("product_catalog")
    public SourceChargebeeProductCatalogEnum productCatalog;
    public SourceChargebee withProductCatalog(SourceChargebeeProductCatalogEnum productCatalog) {
        this.productCatalog = productCatalog;
        return this;
    }
    
    @JsonProperty("site")
    public String site;
    public SourceChargebee withSite(String site) {
        this.site = site;
        return this;
    }
    
    @JsonProperty("site_api_key")
    public String siteApiKey;
    public SourceChargebee withSiteApiKey(String siteApiKey) {
        this.siteApiKey = siteApiKey;
        return this;
    }
    
    @JsonProperty("start_date")
    public String startDate;
    public SourceChargebee withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
