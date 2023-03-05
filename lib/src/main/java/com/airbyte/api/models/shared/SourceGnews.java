package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceGnews
 * The values required to configure the source.
**/
public class SourceGnews {
    @JsonProperty("airbyte-source-name")
    public SourceGnewsGnewsEnum airbyteSourceName;
    public SourceGnews withAirbyteSourceName(SourceGnewsGnewsEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceGnews withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("country")
    public SourceGnewsCountryEnum country;
    public SourceGnews withCountry(SourceGnewsCountryEnum country) {
        this.country = country;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_date")
    public String endDate;
    public SourceGnews withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("in")
    public SourceGnewsInEnum[] in;
    public SourceGnews withIn(SourceGnewsInEnum[] in) {
        this.in = in;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("language")
    public SourceGnewsLanguageEnum language;
    public SourceGnews withLanguage(SourceGnewsLanguageEnum language) {
        this.language = language;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("nullable")
    public SourceGnewsNullableEnum[] nullable;
    public SourceGnews withNullable(SourceGnewsNullableEnum[] nullable) {
        this.nullable = nullable;
        return this;
    }
    
    @JsonProperty("query")
    public String query;
    public SourceGnews withQuery(String query) {
        this.query = query;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sortby")
    public SourceGnewsSortByEnum sortby;
    public SourceGnews withSortby(SourceGnewsSortByEnum sortby) {
        this.sortby = sortby;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    public String startDate;
    public SourceGnews withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("top_headlines_query")
    public String topHeadlinesQuery;
    public SourceGnews withTopHeadlinesQuery(String topHeadlinesQuery) {
        this.topHeadlinesQuery = topHeadlinesQuery;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("top_headlines_topic")
    public SourceGnewsTopHeadlinesTopicEnum topHeadlinesTopic;
    public SourceGnews withTopHeadlinesTopic(SourceGnewsTopHeadlinesTopicEnum topHeadlinesTopic) {
        this.topHeadlinesTopic = topHeadlinesTopic;
        return this;
    }
    
}
