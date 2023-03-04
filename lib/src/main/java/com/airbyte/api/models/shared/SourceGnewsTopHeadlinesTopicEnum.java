package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceGnewsTopHeadlinesTopicEnum {
    BREAKING_NEWS("breaking-news"),
    WORLD("world"),
    NATION("nation"),
    BUSINESS("business"),
    TECHNOLOGY("technology"),
    ENTERTAINMENT("entertainment"),
    SPORTS("sports"),
    SCIENCE("science"),
    HEALTH("health");

    @JsonValue
    public final String value;

    private SourceGnewsTopHeadlinesTopicEnum(String value) {
        this.value = value;
    }
}
