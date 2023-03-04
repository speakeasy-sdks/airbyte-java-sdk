package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceWikipediaPageviews {
    @JsonProperty("access")
    public String access;
    public SourceWikipediaPageviews withAccess(String access) {
        this.access = access;
        return this;
    }
    
    @JsonProperty("agent")
    public String agent;
    public SourceWikipediaPageviews withAgent(String agent) {
        this.agent = agent;
        return this;
    }
    
    @JsonProperty("airbyte-source-name")
    public SourceWikipediaPageviewsWikipediaPageviewsEnum airbyteSourceName;
    public SourceWikipediaPageviews withAirbyteSourceName(SourceWikipediaPageviewsWikipediaPageviewsEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("article")
    public String article;
    public SourceWikipediaPageviews withArticle(String article) {
        this.article = article;
        return this;
    }
    
    @JsonProperty("country")
    public String country;
    public SourceWikipediaPageviews withCountry(String country) {
        this.country = country;
        return this;
    }
    
    @JsonProperty("end")
    public String end;
    public SourceWikipediaPageviews withEnd(String end) {
        this.end = end;
        return this;
    }
    
    @JsonProperty("project")
    public String project;
    public SourceWikipediaPageviews withProject(String project) {
        this.project = project;
        return this;
    }
    
    @JsonProperty("start")
    public String start;
    public SourceWikipediaPageviews withStart(String start) {
        this.start = start;
        return this;
    }
    
}
