package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ImageStats implements Parsable {
    /**
     * Dwell time; images have no playback.
     */
    private Double avgViewDurationMs;
    /**
     * The feed_views property
     */
    private Long feedViews;
    /**
     * The image_id property
     */
    private String imageId;
    /**
     * The standalone_views property
     */
    private Long standaloneViews;
    /**
     * The total_view_duration_ms property
     */
    private Double totalViewDurationMs;
    /**
     * The total_views property
     */
    private Long totalViews;
    /**
     * The unique_viewers property
     */
    private Long uniqueViewers;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ImageStats}
     */
    @jakarta.annotation.Nonnull
    public static ImageStats createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ImageStats();
    }
    /**
     * Gets the avg_view_duration_ms property value. Dwell time; images have no playback.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getAvgViewDurationMs() {
        return this.avgViewDurationMs;
    }
    /**
     * Gets the feed_views property value. The feed_views property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getFeedViews() {
        return this.feedViews;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("avg_view_duration_ms", (n) -> { this.setAvgViewDurationMs(n.getDoubleValue()); });
        deserializerMap.put("feed_views", (n) -> { this.setFeedViews(n.getLongValue()); });
        deserializerMap.put("image_id", (n) -> { this.setImageId(n.getStringValue()); });
        deserializerMap.put("standalone_views", (n) -> { this.setStandaloneViews(n.getLongValue()); });
        deserializerMap.put("total_view_duration_ms", (n) -> { this.setTotalViewDurationMs(n.getDoubleValue()); });
        deserializerMap.put("total_views", (n) -> { this.setTotalViews(n.getLongValue()); });
        deserializerMap.put("unique_viewers", (n) -> { this.setUniqueViewers(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the image_id property value. The image_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getImageId() {
        return this.imageId;
    }
    /**
     * Gets the standalone_views property value. The standalone_views property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getStandaloneViews() {
        return this.standaloneViews;
    }
    /**
     * Gets the total_view_duration_ms property value. The total_view_duration_ms property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getTotalViewDurationMs() {
        return this.totalViewDurationMs;
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
     * Gets the unique_viewers property value. The unique_viewers property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getUniqueViewers() {
        return this.uniqueViewers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("avg_view_duration_ms", this.getAvgViewDurationMs());
        writer.writeLongValue("feed_views", this.getFeedViews());
        writer.writeStringValue("image_id", this.getImageId());
        writer.writeLongValue("standalone_views", this.getStandaloneViews());
        writer.writeDoubleValue("total_view_duration_ms", this.getTotalViewDurationMs());
        writer.writeLongValue("total_views", this.getTotalViews());
        writer.writeLongValue("unique_viewers", this.getUniqueViewers());
    }
    /**
     * Sets the avg_view_duration_ms property value. Dwell time; images have no playback.
     * @param value Value to set for the avg_view_duration_ms property.
     */
    public void setAvgViewDurationMs(@jakarta.annotation.Nullable final Double value) {
        this.avgViewDurationMs = value;
    }
    /**
     * Sets the feed_views property value. The feed_views property
     * @param value Value to set for the feed_views property.
     */
    public void setFeedViews(@jakarta.annotation.Nullable final Long value) {
        this.feedViews = value;
    }
    /**
     * Sets the image_id property value. The image_id property
     * @param value Value to set for the image_id property.
     */
    public void setImageId(@jakarta.annotation.Nullable final String value) {
        this.imageId = value;
    }
    /**
     * Sets the standalone_views property value. The standalone_views property
     * @param value Value to set for the standalone_views property.
     */
    public void setStandaloneViews(@jakarta.annotation.Nullable final Long value) {
        this.standaloneViews = value;
    }
    /**
     * Sets the total_view_duration_ms property value. The total_view_duration_ms property
     * @param value Value to set for the total_view_duration_ms property.
     */
    public void setTotalViewDurationMs(@jakarta.annotation.Nullable final Double value) {
        this.totalViewDurationMs = value;
    }
    /**
     * Sets the total_views property value. The total_views property
     * @param value Value to set for the total_views property.
     */
    public void setTotalViews(@jakarta.annotation.Nullable final Long value) {
        this.totalViews = value;
    }
    /**
     * Sets the unique_viewers property value. The unique_viewers property
     * @param value Value to set for the unique_viewers property.
     */
    public void setUniqueViewers(@jakarta.annotation.Nullable final Long value) {
        this.uniqueViewers = value;
    }
}
