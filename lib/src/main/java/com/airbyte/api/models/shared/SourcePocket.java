package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourcePocket {
    @JsonProperty("access_token")
    public String accessToken;
    public SourcePocket withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("airbyte-source-name")
    public SourcePocketPocketEnum airbyteSourceName;
    public SourcePocket withAirbyteSourceName(SourcePocketPocketEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("consumer_key")
    public String consumerKey;
    public SourcePocket withConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("content_type")
    public SourcePocketContentTypeEnum contentType;
    public SourcePocket withContentType(SourcePocketContentTypeEnum contentType) {
        this.contentType = contentType;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("detail_type")
    public SourcePocketDetailTypeEnum detailType;
    public SourcePocket withDetailType(SourcePocketDetailTypeEnum detailType) {
        this.detailType = detailType;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("domain")
    public String domain;
    public SourcePocket withDomain(String domain) {
        this.domain = domain;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("favorite")
    public Boolean favorite;
    public SourcePocket withFavorite(Boolean favorite) {
        this.favorite = favorite;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("search")
    public String search;
    public SourcePocket withSearch(String search) {
        this.search = search;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("since")
    public String since;
    public SourcePocket withSince(String since) {
        this.since = since;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sort")
    public SourcePocketSortByEnum sort;
    public SourcePocket withSort(SourcePocketSortByEnum sort) {
        this.sort = sort;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("state")
    public SourcePocketStateEnum state;
    public SourcePocket withState(SourcePocketStateEnum state) {
        this.state = state;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tag")
    public String tag;
    public SourcePocket withTag(String tag) {
        this.tag = tag;
        return this;
    }
    
}
