package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.analyticscommon.v1.MediaType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PostStats implements Parsable {
    /**
     * The avg_watch_time_ms property
     */
    private Double avgWatchTimeMs;
    /**
     * The completion_rate property
     */
    private Double completionRate;
    /**
     * The completions property
     */
    private Long completions;
    /**
     * The content_type property
     */
    private MediaType contentType;
    /**
     * The feed_id property
     */
    private String feedId;
    /**
     * The post_id property
     */
    private String postId;
    /**
     * The starts property
     */
    private Long starts;
    /**
     * The total_views property
     */
    private Long totalViews;
    /**
     * The total_watch_time_ms property
     */
    private Long totalWatchTimeMs;
    /**
     * The unique_viewers property
     */
    private Long uniqueViewers;
    /**
     * The views_by_page property
     */
    private PostStatsViewsByPage viewsByPage;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PostStats}
     */
    @jakarta.annotation.Nonnull
    public static PostStats createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PostStats();
    }
    /**
     * Gets the avg_watch_time_ms property value. The avg_watch_time_ms property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getAvgWatchTimeMs() {
        return this.avgWatchTimeMs;
    }
    /**
     * Gets the completion_rate property value. The completion_rate property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getCompletionRate() {
        return this.completionRate;
    }
    /**
     * Gets the completions property value. The completions property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getCompletions() {
        return this.completions;
    }
    /**
     * Gets the content_type property value. The content_type property
     * @return a {@link MediaType}
     */
    @jakarta.annotation.Nullable
    public MediaType getContentType() {
        return this.contentType;
    }
    /**
     * Gets the feed_id property value. The feed_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFeedId() {
        return this.feedId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("avg_watch_time_ms", (n) -> { this.setAvgWatchTimeMs(n.getDoubleValue()); });
        deserializerMap.put("completion_rate", (n) -> { this.setCompletionRate(n.getDoubleValue()); });
        deserializerMap.put("completions", (n) -> { this.setCompletions(n.getLongValue()); });
        deserializerMap.put("content_type", (n) -> { this.setContentType(n.getEnumValue(MediaType::forValue)); });
        deserializerMap.put("feed_id", (n) -> { this.setFeedId(n.getStringValue()); });
        deserializerMap.put("post_id", (n) -> { this.setPostId(n.getStringValue()); });
        deserializerMap.put("starts", (n) -> { this.setStarts(n.getLongValue()); });
        deserializerMap.put("total_views", (n) -> { this.setTotalViews(n.getLongValue()); });
        deserializerMap.put("total_watch_time_ms", (n) -> { this.setTotalWatchTimeMs(n.getLongValue()); });
        deserializerMap.put("unique_viewers", (n) -> { this.setUniqueViewers(n.getLongValue()); });
        deserializerMap.put("views_by_page", (n) -> { this.setViewsByPage(n.getObjectValue(PostStatsViewsByPage::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the post_id property value. The post_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPostId() {
        return this.postId;
    }
    /**
     * Gets the starts property value. The starts property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getStarts() {
        return this.starts;
    }
    /**
     * Gets the total_views property value. The total_views property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalViews() {
        return this.totalViews;
    }
    /**
     * Gets the total_watch_time_ms property value. The total_watch_time_ms property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalWatchTimeMs() {
        return this.totalWatchTimeMs;
    }
    /**
     * Gets the unique_viewers property value. The unique_viewers property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getUniqueViewers() {
        return this.uniqueViewers;
    }
    /**
     * Gets the views_by_page property value. The views_by_page property
     * @return a {@link PostStatsViewsByPage}
     */
    @jakarta.annotation.Nullable
    public PostStatsViewsByPage getViewsByPage() {
        return this.viewsByPage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("avg_watch_time_ms", this.getAvgWatchTimeMs());
        writer.writeDoubleValue("completion_rate", this.getCompletionRate());
        writer.writeLongValue("completions", this.getCompletions());
        writer.writeEnumValue("content_type", this.getContentType());
        writer.writeStringValue("feed_id", this.getFeedId());
        writer.writeStringValue("post_id", this.getPostId());
        writer.writeLongValue("starts", this.getStarts());
        writer.writeLongValue("total_views", this.getTotalViews());
        writer.writeLongValue("total_watch_time_ms", this.getTotalWatchTimeMs());
        writer.writeLongValue("unique_viewers", this.getUniqueViewers());
        writer.writeObjectValue("views_by_page", this.getViewsByPage());
    }
    /**
     * Sets the avg_watch_time_ms property value. The avg_watch_time_ms property
     * @param value Value to set for the avg_watch_time_ms property.
     */
    public void setAvgWatchTimeMs(@jakarta.annotation.Nullable final Double value) {
        this.avgWatchTimeMs = value;
    }
    /**
     * Sets the completion_rate property value. The completion_rate property
     * @param value Value to set for the completion_rate property.
     */
    public void setCompletionRate(@jakarta.annotation.Nullable final Double value) {
        this.completionRate = value;
    }
    /**
     * Sets the completions property value. The completions property
     * @param value Value to set for the completions property.
     */
    public void setCompletions(@jakarta.annotation.Nullable final Long value) {
        this.completions = value;
    }
    /**
     * Sets the content_type property value. The content_type property
     * @param value Value to set for the content_type property.
     */
    public void setContentType(@jakarta.annotation.Nullable final MediaType value) {
        this.contentType = value;
    }
    /**
     * Sets the feed_id property value. The feed_id property
     * @param value Value to set for the feed_id property.
     */
    public void setFeedId(@jakarta.annotation.Nullable final String value) {
        this.feedId = value;
    }
    /**
     * Sets the post_id property value. The post_id property
     * @param value Value to set for the post_id property.
     */
    public void setPostId(@jakarta.annotation.Nullable final String value) {
        this.postId = value;
    }
    /**
     * Sets the starts property value. The starts property
     * @param value Value to set for the starts property.
     */
    public void setStarts(@jakarta.annotation.Nullable final Long value) {
        this.starts = value;
    }
    /**
     * Sets the total_views property value. The total_views property
     * @param value Value to set for the total_views property.
     */
    public void setTotalViews(@jakarta.annotation.Nullable final Long value) {
        this.totalViews = value;
    }
    /**
     * Sets the total_watch_time_ms property value. The total_watch_time_ms property
     * @param value Value to set for the total_watch_time_ms property.
     */
    public void setTotalWatchTimeMs(@jakarta.annotation.Nullable final Long value) {
        this.totalWatchTimeMs = value;
    }
    /**
     * Sets the unique_viewers property value. The unique_viewers property
     * @param value Value to set for the unique_viewers property.
     */
    public void setUniqueViewers(@jakarta.annotation.Nullable final Long value) {
        this.uniqueViewers = value;
    }
    /**
     * Sets the views_by_page property value. The views_by_page property
     * @param value Value to set for the views_by_page property.
     */
    public void setViewsByPage(@jakarta.annotation.Nullable final PostStatsViewsByPage value) {
        this.viewsByPage = value;
    }
}
