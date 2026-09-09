package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VideoStats implements Parsable {
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
    private Double totalWatchTimeMs;
    /**
     * The unique_viewers property
     */
    private Long uniqueViewers;
    /**
     * The video_id property
     */
    private String videoId;
    /**
     * The watches property
     */
    private Long watches;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VideoStats}
     */
    @jakarta.annotation.Nonnull
    public static VideoStats createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VideoStats();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("avg_watch_time_ms", (n) -> { this.setAvgWatchTimeMs(n.getDoubleValue()); });
        deserializerMap.put("completion_rate", (n) -> { this.setCompletionRate(n.getDoubleValue()); });
        deserializerMap.put("completions", (n) -> { this.setCompletions(n.getLongValue()); });
        deserializerMap.put("starts", (n) -> { this.setStarts(n.getLongValue()); });
        deserializerMap.put("total_views", (n) -> { this.setTotalViews(n.getLongValue()); });
        deserializerMap.put("total_watch_time_ms", (n) -> { this.setTotalWatchTimeMs(n.getDoubleValue()); });
        deserializerMap.put("unique_viewers", (n) -> { this.setUniqueViewers(n.getLongValue()); });
        deserializerMap.put("video_id", (n) -> { this.setVideoId(n.getStringValue()); });
        deserializerMap.put("watches", (n) -> { this.setWatches(n.getLongValue()); });
        return deserializerMap;
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
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getTotalWatchTimeMs() {
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
     * Gets the video_id property value. The video_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVideoId() {
        return this.videoId;
    }
    /**
     * Gets the watches property value. The watches property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getWatches() {
        return this.watches;
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
        writer.writeLongValue("starts", this.getStarts());
        writer.writeLongValue("total_views", this.getTotalViews());
        writer.writeDoubleValue("total_watch_time_ms", this.getTotalWatchTimeMs());
        writer.writeLongValue("unique_viewers", this.getUniqueViewers());
        writer.writeStringValue("video_id", this.getVideoId());
        writer.writeLongValue("watches", this.getWatches());
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
    public void setTotalWatchTimeMs(@jakarta.annotation.Nullable final Double value) {
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
     * Sets the video_id property value. The video_id property
     * @param value Value to set for the video_id property.
     */
    public void setVideoId(@jakarta.annotation.Nullable final String value) {
        this.videoId = value;
    }
    /**
     * Sets the watches property value. The watches property
     * @param value Value to set for the watches property.
     */
    public void setWatches(@jakarta.annotation.Nullable final Long value) {
        this.watches = value;
    }
}
