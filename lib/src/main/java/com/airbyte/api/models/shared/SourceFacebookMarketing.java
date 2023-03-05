package com.airbyte.api.models.shared;

import com.airbyte.api.utils.DateTimeDeserializer;
import com.airbyte.api.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * SourceFacebookMarketing
 * The values required to configure the source.
**/
public class SourceFacebookMarketing {
    @JsonProperty("access_token")
    public String accessToken;
    public SourceFacebookMarketing withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("account_id")
    public String accountId;
    public SourceFacebookMarketing withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("action_breakdowns_allow_empty")
    public Boolean actionBreakdownsAllowEmpty;
    public SourceFacebookMarketing withActionBreakdownsAllowEmpty(Boolean actionBreakdownsAllowEmpty) {
        this.actionBreakdownsAllowEmpty = actionBreakdownsAllowEmpty;
        return this;
    }
    
    @JsonProperty("airbyte-source-name")
    public SourceFacebookMarketingFacebookMarketingEnum airbyteSourceName;
    public SourceFacebookMarketing withAirbyteSourceName(SourceFacebookMarketingFacebookMarketingEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_insights")
    public SourceFacebookMarketingInsightConfig[] customInsights;
    public SourceFacebookMarketing withCustomInsights(SourceFacebookMarketingInsightConfig[] customInsights) {
        this.customInsights = customInsights;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_date")
    public String endDate;
    public SourceFacebookMarketing withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fetch_thumbnail_images")
    public Boolean fetchThumbnailImages;
    public SourceFacebookMarketing withFetchThumbnailImages(Boolean fetchThumbnailImages) {
        this.fetchThumbnailImages = fetchThumbnailImages;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("include_deleted")
    public Boolean includeDeleted;
    public SourceFacebookMarketing withIncludeDeleted(Boolean includeDeleted) {
        this.includeDeleted = includeDeleted;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("insights_lookback_window")
    public Long insightsLookbackWindow;
    public SourceFacebookMarketing withInsightsLookbackWindow(Long insightsLookbackWindow) {
        this.insightsLookbackWindow = insightsLookbackWindow;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_batch_size")
    public Long maxBatchSize;
    public SourceFacebookMarketing withMaxBatchSize(Long maxBatchSize) {
        this.maxBatchSize = maxBatchSize;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("page_size")
    public Long pageSize;
    public SourceFacebookMarketing withPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;
    public SourceFacebookMarketing withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
